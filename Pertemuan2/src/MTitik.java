public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T2.printTitik();
        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Nilai absis T1   = " + T1.getAbsis());
        System.out.println("Nilai ordinat T1 = " + T1.getOrdinat());
    }
}