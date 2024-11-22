const canvas = document.getElementById("alx");
const ctx = canvas.getContext("2d");

let particles = [];
let points = [];
let WIDTH = (canvas.width = window.innerWidth);
let HEIGHT = (canvas.height = window.innerHeight);

const PARTICLE_COUNT = 32;
const MAX_RADIUS = 6.3; // Equivalent to 2 * Math.PI
const STEP = 0.3; // Optimized iteration step
const RANDOM = Math.random;
const COS = Math.cos;

// Generate points for the heart shape
function generateHeartShape() {
  points = [];
  for (let i = 0; i < MAX_RADIUS; i += STEP) {
    points.push([
      WIDTH / 2 + 150 * Math.pow(Math.sin(i), 3),
      HEIGHT / 2 -
        9 * (15 * COS(i) - 5 * COS(2 * i) - 2 * COS(3 * i) - COS(4 * i)),
    ]);
  }
}

// Generate particles
function generateParticles() {
  particles = [];
  for (let i = 0; i < PARTICLE_COUNT; i++) {
    let x = RANDOM() * WIDTH;
    let y = RANDOM() * HEIGHT;
    let hue = 360 * (i / PARTICLE_COUNT);
    let particleTrail = [];

    for (let j = 0; j < PARTICLE_COUNT; j++) {
      particleTrail[j] = {
        x: x,
        y: y,
        X: 0,
        Y: 0,
        R: 1 - j / PARTICLE_COUNT + 1,
        S: RANDOM() + 1,
        q: ~~(RANDOM() * PARTICLE_COUNT),
        D: 2 * (i % 2) - 1,
        F: 0.2 * RANDOM() + 0.7,
        color: `hsla(${~~hue}, 60%, 70%, 0.1)`,
      };
    }

    particles[i] = particleTrail;
  }
}

// Draw a single particle
function drawParticle(particle) {
  ctx.fillStyle = particle.color;
  ctx.beginPath();
  ctx.arc(particle.x, particle.y, particle.R, 0, MAX_RADIUS, true);
  ctx.closePath();
  ctx.fill();
}

// Update and render particles
function updateParticles() {
  ctx.fillStyle = "rgba(0, 0, 0, 0.2)";
  ctx.fillRect(0, 0, WIDTH, HEIGHT);

  for (let i = 0; i < PARTICLE_COUNT; i++) {
    const trail = particles[i];
    const head = trail[0];
    const target = points[head.q];
    const dx = head.x - target[0];
    const dy = head.y - target[1];
    const distance = Math.sqrt(dx * dx + dy * dy);

    if (distance < 10) {
      if (RANDOM() > 0.95) {
        head.q = ~~(RANDOM() * PARTICLE_COUNT);
      } else if (RANDOM() > 0.99) {
        head.D *= -1;
      }
      head.q = (head.q + head.D + PARTICLE_COUNT) % PARTICLE_COUNT;
    }

    head.X += (-dx / distance) * head.S;
    head.Y += (-dy / distance) * head.S;
    head.x += head.X;
    head.y += head.Y;
    drawParticle(head);

    head.X *= head.F;
    head.Y *= head.F;

    for (let j = 0; j < PARTICLE_COUNT - 1; j++) {
      const current = trail[j];
      const next = trail[j + 1];

      next.x -= 0.7 * (next.x - current.x);
      next.y -= 0.7 * (next.y - current.y);
      drawParticle(next);
    }
  }

  requestAnimationFrame(updateParticles);
}

// Adjust canvas size dynamically
window.addEventListener("resize", () => {
  WIDTH = canvas.width = window.innerWidth;
  HEIGHT = canvas.height = window.innerHeight;
  generateHeartShape();
});

// Initialize and start the animation
generateHeartShape();
generateParticles();
updateParticles();
