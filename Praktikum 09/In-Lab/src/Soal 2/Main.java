public class Main {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();
        Kucing k1 = new Kucing("GalCing", 3.5);
        Anjing a1 = new Anjing("GalJing", 7.2);
        Galang g1 = new Galang("GalSkuy", 5.0);

        p.enqueueAnabul(g1);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(k1);

        p.showAnabul();

        System.out.println("buang siapa ya cik = " + p.dequeueAnabul().getNama());
        System.out.println("jumlahnya skuy " + p.getNbelm());

        p.showAnabul();

        // jumlah elemen
        System.out.println("Jumlah anabul = " + p.getNbelm());

        // isMember
        System.out.println("Apakah Galskuy ada? " + p.isMember(g1));

        // getAnabul
        System.out.println("Anabul pertama = " + p.getAnabul().getNama());

        // countKucing
        System.out.println("Jumlah kucing = " + p.countKucing());

        // bobotKucing
        System.out.println("Total bobot kucing = " + p.bobotKucing());

        System.out.println();

        // showJenisAnabul
        p.showJenisAnabul();

        System.out.println();

        // dequeue
        Anabul keluar = p.dequeueAnabul();
        System.out.println("Yang keluar antrean = " + keluar.getNama());

        System.out.println("Jumlah anabul sekarang = " + p.getNbelm());
    }
}
