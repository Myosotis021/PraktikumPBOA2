/*
 * File     : Mahasiswa.java
 * Deskripsi : Kelas Mahasiswa untuk menyimpan informasi tentang mahasiswa
 * Pembuat  : Ridho Tri Saputra-24060124130122
 * Tanggal   : 02-03-2026
 */
public class Mahasiswa {
    //Atribut
    private String nama;
    private String nim; 
    private String prodi;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private Matakuliah[] listMatkul = new Matakuliah[50];
    private int jumlahMatkul = 0;

    //Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String nama, String nim, String prodi,
                     Dosen dosenWali, Kendaraan kendaraan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    //Selektor dan Mutator
    //Selektor
    //Selektor untuk mendapatkan nilai nama
    public String getNama() { return nama; }
    //Selektor untuk mendapatkan nilai nim
    public String getNim() { return nim; }
    //Selektor untuk mendapatkan nilai prodi
    public String getProdi() { return prodi; }
    //Selektor untuk mendapatkan nilai dosen wali
    public Dosen getDosenWali() { return dosenWali; }
    //Selektor untuk mendapatkan nilai kendaraan
    public Kendaraan getKendaraan() { return kendaraan; }

    //Mutator
    //Mutator untuk mengubah nilai nama
    public void setNama(String nama) { this.nama = nama; }
    //Mutator untuk mengubah nilai nim
    public void setNim(String nim) { this.nim = nim; }
    //Mutator untuk mengubah nilai prodi
    public void setProdi(String prodi) { this.prodi = prodi; }
    //Mutator untuk mengubah nilai dosen wali
    public void setDosenWali(Dosen d) { this.dosenWali = d; }
    //Mutator untuk mengubah nilai kendaraan
    public void setKendaraan(Kendaraan k) { this.kendaraan = k; }

    // Method tambah matkul
    public void addMatkul(Matakuliah matkul) {
        if (jumlahMatkul < listMatkul.length) {
            listMatkul[jumlahMatkul] = matkul;
            jumlahMatkul++;
        } else {
            System.out.println("Kapasitas Matkul penuh");
        }
    }
    // Method untuk menghitung total SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += listMatkul[i].getSks();
        }
        return totalSKS;
    }
    // Selektor untuk mendapatkan jumlah matkul
    public int getJumlahMatkul() {
        return jumlahMatkul;
    }
    // Selektor untuk mendapatkan daftar matkul
    // tampil data mahasiswa
    public void printMhs() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
    }

    // tampil detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("Kendaraan  : " + kendaraan.getJenis());
        System.out.println("No Plat    : " + kendaraan.getNoPlat());

        System.out.println("\nDaftar Matakuliah:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("- " +
                listMatkul[i].getNamaMatkul() +
                " (" + listMatkul[i].getSks() + " SKS)");
        }

        System.out.println("Total SKS : " + getJumlahSKS());
    }
}