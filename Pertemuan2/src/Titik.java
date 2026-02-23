/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Ridho Tri Saputra(24060124130122)
 * Tanggal      : 23/02/2026 */

public class Titik {
    /*****************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*****************METHOD*****************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }
    
    //mengembalikan nilai absis
    public void setAbsis(double a) {
        absis = a;
    }

    //mengembalikan nilai ordinat
    public void setOrdinat(double o) {
        ordinat = o;
    }

    //mengeset absis titik dengan nilai baru x
    public double getAbsis() {
        return absis;
    }

    //mengeset ordinat titik dengan nilai baru y
    public double getOrdinat() {
        return ordinat;
    }
    void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }
} //end class Titik