/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Galang Bintang Ramadhan/24060124130101
 * Tanggal      : Kamis/19-02-2026
 */

public class MGaris {

    public static void main(String[] args) {

        Titik A = new Titik();
        A.setAbsis(-2);
        A.setOrdinat(0);
        Titik B = new Titik();
        B.setAbsis(0);
        B.setOrdinat(4);
        Garis G1 = new Garis(A, B);
        System.out.println("=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang: " + G1.panjangGaris());
        System.out.println("Gradien: " + G1.Gradien());
        Titik tengah = G1.titikTengah();
        System.out.print("Titik Tengah: ");
        tengah.printTitik();
        System.out.println("Persamaan: " + G1.persamaanGaris());
        Titik C = new Titik();
        C.setAbsis(1);
        C.setOrdinat(2);
        Titik D = new Titik();
        D.setAbsis(3);
        D.setOrdinat(6);
        Garis G2 = new Garis(C, D);
        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Gradien: " + G2.Gradien());
        System.out.println("\nApakah sejajar? " + G1.sejajar(G2));
        System.out.println("Apakah tegak lurus? " + G1.tegakLurus(G2));
        System.out.println("\nJumlah objek Garis: " + Garis.getcounterGaris());
    }
}

