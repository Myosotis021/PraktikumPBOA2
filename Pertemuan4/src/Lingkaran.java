/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Ridho Tri Saputra (24060124130122)
 * Tanggal      : 09/03/2026
 */

public class Lingkaran extends BangunDatar {
    /*************** ATRIBUT ***************/
    private double jari;

    /*************** METHOD ***************/
    
    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(0);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter /2;
    }

    // Getter dan Setter
    
    // Selektor untuk mendapatkan nilai jari-jari
    public double getJari() {
        return jari;
    }

    // Mutator untuk mengubah nilai jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Fungsi untuk menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Fungsi untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {  
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}