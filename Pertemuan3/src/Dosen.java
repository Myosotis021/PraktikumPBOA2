public class Dosen {
    //Atribut
    private String nip,nama,prodi;

    //Method
    //Konstruktor tanpa parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor dan Mutator
    //Selektor
    //Selektor untuk mendapatkan nilai nip
    public String getNip(){
        return this.nip;
    }
    //Selektor untuk mendapatkan nilai nama
    public String getNama(){
        return this.nama;
    }
    //Selektor untuk mendapatkan nilai prodi
    public String getProdi(){
        return this.prodi;
    }

    //Mutator
    //Mutator untuk mengubah nilai nip
    public void setNip(String nip){
        this.nip = nip;
    }
    //Mutator untuk mengubah nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }
    //Mutator untuk mengubah nilai prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

}