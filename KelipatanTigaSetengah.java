package KelipatanTigaSetengah;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini menampilkan bilangan kelipatan 3,5
 */

public class KelipatanTigaSetengah {
    public static void main(String[] args) {
        // Inisialisasi variabel awal
        double bilangan = 3.5;

        // Loop untuk mencetak kelipatan 3.5
        while (bilangan <= 35.0) {
            System.out.println(bilangan);
            bilangan += 3.5; // Tambah 3.5 pada setiap iterasi
        }
    }
}

