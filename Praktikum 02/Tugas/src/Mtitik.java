/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      : Galang Bintang Ramadhan/24060124130101
 * Tanggal      : Kamis/19-02-2026
 */

public class Mtitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();   //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);         //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadranCuy());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        Titik T2 = new Titik();
        T2.setAbsis(-2);
        T2.setOrdinat(5);
        System.out.print("T2: ");
        T2.printTitik();
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));
        Titik refX = T1.getRefleksiX();
        System.out.print("Refleksi sumbu X: ");
        refX.printTitik();
        Titik refY = T1.getRefleksiY();
        System.out.print("Refleksi sumbu Y: ");
        refY.printTitik();
        System.out.println("Jumlah objek Titik: " + Titik.getcounterTitik());

    }
}
