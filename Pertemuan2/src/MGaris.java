/*
 * File     : Garis.java
 * Deskripsi : Kelas Garis untuk menyimpan informasi tentang garis
 * Pembuat  : Ridho Tri Saputra-24060124130122
 * Tanggal   : 23/02/2026
 */
public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik t1 = new Titik(2, 3);
        Titik t2 = new Titik(5, 7);

        // Membuat objek Garis
        Garis g1 = new Garis(t1, t2);

        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien garis: " + g1.getGradien());
        System.out.println("Titik Tengah Garis: ");
        g1.getTitikTengah().printTitik();
        System.out.println("Persamaan Garis: " + g1.getPersamaanGaris());
        Garis G2 = new Garis(new Titik(2, 2), new Titik(5, 6));
        System.out.println("Sejajar dengan G2? " + g1.isSejajar(G2));
        System.out.println("Tegak lurus dengan G2? " + g1.isTegakLurus(G2));
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    } 
}
