// File : Main.java

public class Main {

    public static void main(String[] args) {

        Persegi p = new Persegi(5,"Merah","Hitam");
        Lingkaran l = new Lingkaran(7,"Biru","Putih");

        System.out.println("=== PERSEGI ===");
        p.printInfo();

        System.out.println();

        System.out.println("=== LINGKARAN ===");
        l.printInfo();
    }
}