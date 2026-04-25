class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;

    Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.ProgramStudi = prodi;
    }

    Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.ProgramStudi;
    }

    void tampil() {
        System.out.println(NIM + " | " + Nama + " | " + ProgramStudi);
    }
}