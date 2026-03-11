import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama,
                      LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan(){
        int tahun = hitungMasaKerja().getYears();
        return 0.02 * tahun * gajiPokok;
    }

    public LocalDate hitungTanggalPensiun(){
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo(){

        Period masaKerja = hitungMasaKerja();

        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Masa Kerja : "
                + masaKerja.getYears()+" tahun "
                + masaKerja.getMonths()+" bulan");

        System.out.println("Tanggal Pensiun : "
                + formatTanggal(hitungTanggalPensiun()));

        System.out.println("Gaji Pokok : Rp " + gajiPokok);

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}