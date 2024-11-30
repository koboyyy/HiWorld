import java.util.Scanner;

public class KonfersiWaktu {
    public static void main(String[] args) {

        double detik1, detik2, detik3, detik4;
        double konfersiJam = 3600;
        double konfersiMenit = 60;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan detik pertama: ");
        detik1 = scanner.nextInt();

        System.out.print("Masukkan detik kedua: ");
        detik2 = scanner.nextInt();

        System.out.print("Masukkan detik ketiga: ");
        detik3 = scanner.nextInt();

        System.out.print("Masukkan detik keempat: ");
        detik4 = scanner.nextInt();


        System.out.println(detik1 / konfersiJam);
        System.out.println(detik2 / konfersiJam);
        System.out.println(detik3 / konfersiJam);
        System.out.println(detik4 / konfersiJam);

        System.out.println(detik1 / konfersiMenit);
        System.out.println(detik2 / konfersiMenit);
        System.out.println(detik3 / konfersiMenit);
        System.out.println(detik4 / konfersiMenit);

    }

}
