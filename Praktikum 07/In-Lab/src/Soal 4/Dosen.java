class Dosen extends CivitasAkademika {
    String NIP;

    Dosen(String nama, String nip) {
        this.nama = nama;
        this.NIP = nip;
    }

    String getNomor() {
        return NIP;
    }
}