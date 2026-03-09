/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Ridho Tri Saputra(24060124130122)
 * Tanggal      : 09/03/2026 */

public class BangunDatar {
    /***************ATRIBUT***************/
    private int jmlSisi;
    private String warna;
    private String border;
    /***************METHOD***************/
    // Konstruktor tanpa parameter
    public BangunDatar(){
        jmlSisi = 0;
        warna = "";
        border = "";
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    // Selektor dan Mutator
    // Selektor untuk mendapatkan nilai jumlah sisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    // Mutator untuk mengubah nilai jumlah sisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // Selektor untuk mendapatkan nilai warna
    public String getWarna(){
        return warna;
    }

    // Mutator untuk mengubah nilai warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // Selektor untuk mendapatkan nilai border
    public String getBorder(){
        return border;
    }

    // Mutator untuk mengubah nilai border
    public void setBorder(String border){
        this.border = border;
    }

    // Fungsi untuk menampilkan informasi bangun datar
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

}
