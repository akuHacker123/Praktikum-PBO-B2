// File : BangunDatar.java
// Deskripsi : Superclass abstract untuk bangun datar
// Pembuat : Galang Bintang Ramadhan
// Tanggal : 18 Maret 2026

public abstract class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar() {}

    public BangunDatar(String warna, String border){
        this.warna = warna;
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
        System.out.println("Jumlah Sisi : " + jmlSisi);
    }

    // abstract method
    public abstract double getLuas();
    public abstract double getKeliling();

    // method pembanding
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}