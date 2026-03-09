/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Ridho Tri Saputra(24060124130122)
 * Tanggal      : 09/03/2026 */

public class Persegi extends BangunDatar {
    /*************** ATRIBUT ***************/
    private double sisi;
    /*************** METHOD ***************/
    public Persegi() {
        setJmlSisi(4);
    }
    
    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }
    
    // Getter dan Setter
    // Selektor untuk mendapatkan nilai sisi
    public double getSisi() {
        return sisi;
    }

    // Mutator untuk mengubah nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Fungsi untuk menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Fungsi untuk menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Fungsi untuk menghitung diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
}
