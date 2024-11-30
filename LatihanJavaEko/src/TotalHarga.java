import java.util.Scanner;

public class TotalHarga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] hargaBarang = new int[4];
        int totalHarga = 0;

        for (int i = 0 ; i < hargaBarang.length ; i++){
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            hargaBarang[i] = scanner.nextInt();
            totalHarga += hargaBarang[i];
        }

        System.out.println("Total harga yang harus dibayarkan Dinda adalah Rp." + totalHarga + ".");

        scanner.close();
    }
}
