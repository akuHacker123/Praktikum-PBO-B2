/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Galang Bintang Ramadhan/24060124130101
 * Tanggal      : Kamis/19-02-2026
 */

public class Garis {
    Titik T0;
    Titik T1;
    static int counterGaris = 0;

    Garis(){
        T0 = new Titik();
        T1 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(1);
        counterGaris++;
    }

    Garis(Titik T0, Titik T1){
        this.T0 = T0;
        this.T1 = T1;
        counterGaris++;
    }

    static int getcounterGaris(){
        return counterGaris;
    }

    Titik getT0(){
        return T0;
    }

    Titik getT1(){
        return T1;
    }

    void setT0(Titik T0){
        this.T0 = T0;
    }

    void setT1(Titik T1){
        this.T1 = T1;
    }

    double panjangGaris(){
        double dx = this.T1.absis - this.T0.absis;
        double dy = this.T1.ordinat - this.T0.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    double Gradien(){
        double atas = this.T1.ordinat - this.T0.ordinat;
        double bawah = this.T1.absis - this.T0.absis;
        return atas / bawah;
    }

    Titik titikTengah(){
        double dx = (this.T1.absis + this.T0.absis) /2 ;
        double dy = (this.T1.ordinat + this.T0.ordinat) / 2;
        return new Titik(dx,dy);
    }

    boolean sejajar(Garis g){
        return this.Gradien() == g.Gradien();
    }

    boolean tegakLurus(Garis g){
        return this.Gradien() * g.Gradien() == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal: (" + T0.absis + ", " + T0.ordinat + ")");
        System.out.println("Titik Akhir: (" + T1.absis + ", " + T1.ordinat + ")");
    }

    String persamaanGaris(){
        double m = Gradien();
        double c = T0.ordinat - (m * T0.absis);

        return "y = " + m + "x + " + c;
    }

}
