class Mahasiswa2 extends CivitasAkademika {
    String NIM;
    Dosen dosenWali;

    Mahasiswa2(String nama, String nim) {
        this.nama = nama;
        this.NIM = nim;
    }

    String getNomor() {
        return NIM;
    }

    void setWali(Dosen d) {
        this.dosenWali = d;
    }

    void tampilDataMahasiswa() {
        System.out.println(NIM + " | " + nama + " | Wali: " + dosenWali.nama);
    }
}