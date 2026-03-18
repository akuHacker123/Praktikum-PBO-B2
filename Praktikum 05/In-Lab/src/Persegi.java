// File : Persegi.java
// Deskripsi : Class Persegi turunan BangunDatar
// Pembuat : Galang Bintang Ramadhan
// Tanggal : 18 Maret 2026

public class Persegi extends BangunDatar implements IResize {

    private double sisi;

    public Persegi(double sisi, String warna, String border){
        super(warna, border);
        this.jmlSisi = 4;
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(double percent) {
        sisi *= percent;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}