public class PenghitungDiskon {
    public static final double DISKON = 0.1;
    public static final double PAJAK = 0.05;

    public static void main(String[] args) {
        int hargaAwal = 500000;

        // Hitung total harga
        double hargaSetelahDiskon = hargaAwal * (1 - DISKON);
        double hargaTotal = hargaSetelahDiskon * (1 + PAJAK);

        // Tampilkan hasil
        System.out.println("Harga awal: Rp" + hargaAwal);
        System.out.println("Diskon: 10%");
        System.out.println("Pajak: 5%");
        System.out.println("Total Harga Setelah Diskon dan Pajak: Rp" + hargaTotal);
    }
}
