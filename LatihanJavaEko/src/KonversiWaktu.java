import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] detikArray = new int[4];

        for (int i = 0; i < detikArray.length; i++) {
            System.out.print("Masukkan detik ke-" + (i + 1) + ": ");
            detikArray[i] = scanner.nextInt();
        }

        System.out.println("\nNo\tDetik\t\tJam\tMenit");

        for (int i = 0; i < detikArray.length; i++) {
            int detik = detikArray[i];

            int jam = detik / 3600;
            int menit = detik / 60;

            System.out.printf("%d\t%d detik\t%d\t%d\n", i + 1, detik, jam, menit);
        }

        scanner.close();
    }
}
