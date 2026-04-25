class Seminar {
    CivitasAkademika[] pesertas = new CivitasAkademika[100];
    int banyakPeserta;

    Seminar() {
        banyakPeserta = 0;
    }

    void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta++] = c;
        }
    }

    int countPeserta() {
        return banyakPeserta;
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " | " + pesertas[i].nama);
        }
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}