/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      : Galang Bintang Ramadhan/24060124130101
 * Tanggal      : Kamis/19-02-2026
 */
public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int  counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    static int getcounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public int getKuadranCuy(){
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else{
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void refleksiX() {
        ordinat = -ordinat;
    }
    
    void refleksiY() {
        absis = -absis;
    }
    
    Titik getRefleksiX() {
        Titik t = new Titik();
        t.setAbsis(this.absis);
        t.setOrdinat(-this.ordinat);
        return t;
    }
    
    Titik getRefleksiY() {
        Titik t = new Titik();
        t.setAbsis(-this.absis);
        t.setOrdinat(this.ordinat);
        return t;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    //end class Titik
}
