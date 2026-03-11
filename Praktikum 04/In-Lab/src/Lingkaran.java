// File : Lingkaran.java

public class Lingkaran extends BangunDatar {

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
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}