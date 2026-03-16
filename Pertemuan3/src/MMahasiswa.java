public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("12345", "Dr. Budi", "Informatika");

        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B 1234 CD", "Motor");

        // Membuat objek Mahasiswa dengan parameter
        Mahasiswa mhs1 = new Mahasiswa("Andi", "2021001", "Informatika", dosen1, kendaraan1);

        // Menambahkan matkul ke mahasiswa
        mhs1.addMatkul(new Matakuliah("IF101", "Pemrograman Dasar", 3));
        mhs1.addMatkul(new Matakuliah("IF102", "Struktur Data", 4));

        // Menampilkan data mahasiswa
        mhs1.printMhs();
        System.out.println("Jumlah SKS: " + mhs1.getJumlahSKS());
    }
}
