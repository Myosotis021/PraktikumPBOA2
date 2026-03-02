/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Pongo (12345)
 * Tanggal      : 2 Maret 2026 
 */

public class Titik {
    /*****************ATRIBUT*****************/
    // Semua atribut di-set private sesuai prinsip enkapsulasi
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*****************METHOD*****************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor dengan parameter absis dan ordinat
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }
    
    //mengeset absis titik dengan nilai baru a
    public void setAbsis(double a) {
        absis = a;
    }

    //mengeset ordinat titik dengan nilai baru o
    public void setOrdinat(double o) {
        ordinat = o;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; // sebelumnya ada typo ditambah x
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} //end class Titik