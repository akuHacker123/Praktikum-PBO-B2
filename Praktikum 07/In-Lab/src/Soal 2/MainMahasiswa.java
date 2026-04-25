public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("101", "Galang", "Informatika");
        Mahasiswa m3 = new Mahasiswa(m2);

        m1.setProgramStudi();
        m2.setProgramStudi("Sistem Informasi");
        m3.setProgramStudi(m2);

        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}