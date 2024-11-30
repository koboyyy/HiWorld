import java.util.Scanner;

public class LuasDanVolumeBola {

    public static void main(String[] args) {
        final double PHI = 3.14;

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nilai r: ");
        double r = scanner.nextDouble();

        // Proses
        double lpermukaan = (4 * PHI * (r*r));
        double vBola = (1.33333333 * (PHI * (r*r*r)));

        // Output
        System.out.println("r = " + r);
        System.out.println("Luas permukaan bola adalah: " + lpermukaan);
        System.out.printf("Volume bola adalah: " + vBola);

        scanner.close();
    }
}
