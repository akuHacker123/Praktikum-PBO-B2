import java.time.LocalDate;
public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    private final int A = 1;

    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String nip) {
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl, double pendapatan, String nip) {
        super(nama, tgl, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahun() + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}