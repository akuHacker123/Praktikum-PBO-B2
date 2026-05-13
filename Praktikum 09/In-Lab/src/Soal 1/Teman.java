import java.util.ArrayList;

class Teman {
    private int Nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        Nbelm = 0;
    }

    // a
    public int getNbelm() {
        return Nbelm;
    }

    // b
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    // c
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    // d
    public void addNama(String nama) {
        Lnama.add(nama);
        Nbelm++;
    }

    // e
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            Nbelm--;
        }
    }

    // f
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g
    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    // h
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // i
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}