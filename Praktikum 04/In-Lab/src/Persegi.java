// File : Persegi.java

public class Persegi extends BangunDatar {

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
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}