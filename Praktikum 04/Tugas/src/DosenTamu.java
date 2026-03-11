import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip,String nidk,String nama,
                     LocalDate tanggalLahir,LocalDate tmt,
                     double gajiPokok,String fakultas,
                     LocalDate akhirKontrak){

        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);

        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan(){
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo(){

        Period sisaKontrak = Period.between(LocalDate.now(), akhirKontrak);

        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);

        System.out.println("Sisa Kontrak : "
                + sisaKontrak.getYears()+" tahun "
                + sisaKontrak.getMonths()+" bulan");

        System.out.println("Gaji Pokok : Rp " + gajiPokok);

        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}