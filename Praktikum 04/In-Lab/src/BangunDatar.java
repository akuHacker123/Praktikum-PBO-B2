// File : BangunDatar.java
// Deskripsi : Superclass untuk bangun datar
// Pembuat : Galang Bintang Ramadhan
// Tanggal : 11 Maret 2026

public class BangunDatar {

    protected int jmlSisi;
    protected String warna;
    protected String border;

    public BangunDatar() {

    }

    public BangunDatar(String warna, String border){
        this.warna = warna;
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
        System.out.println("Jumlah Sisi : " + jmlSisi);
    }
}