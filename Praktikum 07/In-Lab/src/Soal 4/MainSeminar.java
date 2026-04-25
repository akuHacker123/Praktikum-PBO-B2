public class MainSeminar {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Pak A", "D001");
        Dosen d2 = new Dosen("Pak B", "D002");

        Mahasiswa2 m1 = new Mahasiswa2("Ali", "M001");
        Mahasiswa2 m2 = new Mahasiswa2("Budi", "M002");
        Mahasiswa2 m3 = new Mahasiswa2("Cici", "M003");
        Mahasiswa2 m4 = new Mahasiswa2("Dedi", "M004");
        Mahasiswa2 m5 = new Mahasiswa2("Eka", "M005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Total peserta: " + s.countPeserta());
        System.out.println("Total mahasiswa: " + s.countMahasiswa());

        s.tampilPeserta();

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}