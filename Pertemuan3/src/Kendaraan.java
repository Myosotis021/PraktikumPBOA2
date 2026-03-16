/*
 * File     : Kendaraan.java
 * Deskripsi : Kelas Kendaraan untuk menyimpan informasi tentang kendaraan
 * Pembuat  : Ridho Tri Saputra-24060124130122
 * Tanggal   : 2024-06-01
 */
public class Kendaraan {
    //Atribut
    private String NoPlat, Jenis;

    //Method
    //Konstruktor tanapa parameter
    public Kendaraan(){
        this.NoPlat = "";
        this.Jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String NoPlat, String Jenis){
        this.NoPlat = NoPlat;
        this.Jenis = Jenis;
    }

    //Selektor dan Mutator
    //Selektor
    //Selektor untuk mendapatkan nilai NoPlat
    public String getNoPlat(){
        return this.NoPlat;
    }
    //Selektor untuk mendapatkan nilai Jenis
    public String getJenis(){
        return this.Jenis;
    }

    //Mutator
    //Mutator untuk mengubah nilai NoPlat
    public void setNoPlat(String NoPlat){
        this.NoPlat = NoPlat;
    }
    //Mutator untuk mengubah nilai Jenis
    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
}