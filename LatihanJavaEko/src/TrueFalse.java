public class TrueFalse {  //Class TrueFalse
    public static void main(String[] args) { // Method main
        // Inisialisasi variabel
        String nama = "Budi";  // Menentukan nama
        int nilai = 54;  // Menentukan bilangan bulat
        boolean lulus = false;  // Menentukan nilai true or false

        System.out.println("Nama : "+nama);  // menampilkan nama
        System.out.println("Nilai : "+nilai);  // menampilkan nilai

        if (lulus == true){ // Pengkondisian (jika lulus bernilai true maka tampilkan status lulu)
            System.out.println("Status : lulus.");
        }else { // Pengkondisian (jika lulus bernilai true maka tampilkan status tidak lulus)
            System.out.println("Status : tidak lulus.");
        }
    } 
} 