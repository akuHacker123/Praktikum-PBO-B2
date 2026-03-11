import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== DATA DOSEN TETAP =====");

        DosenTetap dosenTetap = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );

        dosenTetap.printInfo();


        System.out.println("\n===== DATA DOSEN TAMU =====");

        DosenTamu dosenTamu = new DosenTamu(
                "1234567890",
                "99887766",
                "Budi",
                LocalDate.of(1988,3,12),
                LocalDate.of(2020,2,1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2027,6,30)
        );

        dosenTamu.printInfo();


        System.out.println("\n===== DATA TENDIK =====");

        Tendik tendik = new Tendik(
                "5678901234",
                "Siti",
                LocalDate.of(1992,7,20),
                LocalDate.of(2018,4,10),
                3500000,
                "Akademik"
        );

        tendik.printInfo();

    }
}