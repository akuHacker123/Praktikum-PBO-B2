public class Mahasiswa {
    /***************ATRIBUT***************/
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul;
    private int jumlahMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        } else {
            System.out.println("Mata kuliah penuh!");
        }
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        printMhs();

        System.out.println("Dosen Wali: " + dosenWali.getNama());

        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getJenis());
        }

        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }
    }
}