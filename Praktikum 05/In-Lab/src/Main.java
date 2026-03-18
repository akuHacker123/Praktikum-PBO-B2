// File : Main.java
// Deskripsi : Program utama untuk testing
// Pembuat : Galang Bintang Ramadhan
// Tanggal : 18 Maret 2026

public class Main {

    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10,"Merah","Hitam");
        Persegi P2 = new Persegi(5,"Hijau","Putih");
        BangunDatar L1 = new Lingkaran(7,"Biru","Putih");
        Lingkaran L2 = new Lingkaran(14,"Kuning","Hitam");

        System.out.println("=== PERSEGI P1 ===");
        P1.printInfo();

        System.out.println("\n=== PERSEGI P2 ===");
        P2.printInfo();

        System.out.println("\n=== LINGKARAN L1 ===");
        L1.printInfo();

        System.out.println("\n=== LINGKARAN L2 ===");
        L2.printInfo();

        // perbandingan
        System.out.println("\n=== PERBANDINGAN ===");
        System.out.println("P1 vs P2 (Luas): " + P1.isEqualLuas(P2));
        System.out.println("P1 vs L1 (Luas): " + P1.isEqualLuas(L1));

        System.out.println("P1 vs P2 (Keliling): " + P1.isEqualKeliling(P2));
        System.out.println("P1 vs L1 (Keliling): " + P1.isEqualKeliling(L1));

        // resize
        System.out.println("\n=== RESIZE ===");
        P2.zoomIn();
        L2.zoomOut();

        System.out.println("\nSetelah Resize:");
        P2.printInfo();
        System.out.println();
        L2.printInfo();
    }
}