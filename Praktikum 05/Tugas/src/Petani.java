import java.time.LocalDate;
public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    private final int C = 1;

    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0; 
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahun() + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}