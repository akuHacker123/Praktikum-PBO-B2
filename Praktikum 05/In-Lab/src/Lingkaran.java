// File : Lingkaran.java
// Deskripsi : Class Lingkaran turunan BangunDatar
// Pembuat : Galang Bintang Ramadhan
// Tanggal : 18 Maret 2026

public class Lingkaran extends BangunDatar implements IResize {

    private double jari;

    public Lingkaran(double jari, String warna, String border){
        super(warna, border);
        this.jmlSisi = 0;
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(double percent) {
        jari *= percent;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}