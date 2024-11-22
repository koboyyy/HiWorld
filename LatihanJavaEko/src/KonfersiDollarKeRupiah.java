public class KonfersiDollarKeRupiah {
    // Deklarasi konstanta
    public static final int KURS_DOLLAR = 15850;

    public static void main(String[] args) {

        // Deklarasi variabel
        int dollar = 5;

        int konfersi = KURS_DOLLAR * dollar;

        // Menampilkan hasil konversi
        System.out.println("Dollar: $" + dollar);
        System.out.println("Hasil " + "$" + dollar + " Setelah di konfersi ke Rupiah adalah: Rp." + konfersi);

    }
    
}
