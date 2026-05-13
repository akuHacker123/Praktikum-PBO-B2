import java.util.LinkedList;
import java.util.Queue;

// Kelas Piaraan
class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // getNbelm
    public int getNbelm() {
        return nbelm;
    }

    // enqueue
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // isMember
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // getAnabul
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // dequeue
    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();

        if (a != null) {
            nbelm--;
        }

        return a;
    }

    // showAnabul
    public void showAnabul() {
        System.out.println("Daftar Anabul:");

        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    // countKucing
    public int countKucing() {
        int count = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // bobotKucing
    public double bobotKucing() {
        double total = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }

        return total;
    }

    // showJenisAnabul
    public void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul:");

        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " - " + a.getClass().getName()
            );
        }
    }
}

