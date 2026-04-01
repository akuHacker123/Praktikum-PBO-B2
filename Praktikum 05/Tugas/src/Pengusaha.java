import java.time.LocalDate;
public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    private final int B = 0; 

    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahun() + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}