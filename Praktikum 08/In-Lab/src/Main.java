public class Main {
    public static void main(String[] args) {

        System.out.println("=== DATUM ===");
        Datum<Kucing> dataKucing = new Datum<>();
        Anggora ang = new Anggora("Milo", 3.5);
        dataKucing.setIsi(ang);

        System.out.println("Nama: " + dataKucing.getIsi().nama);
        System.out.println("Bobot: " + dataKucing.getIsi().getBobot());

        System.out.println("\n=== TUKAR ===");

        Wrapper<Integer> a = new Wrapper<>(3);
        Wrapper<Integer> b = new Wrapper<>(6);
        OperatorGenerik.tukar(a, b);
        System.out.println("Integer: a=" + a.value + " b=" + b.value);

        Wrapper<String> s1 = new Wrapper<>("Halo");
        Wrapper<String> s2 = new Wrapper<>("Dunia");
        OperatorGenerik.tukar(s1, s2);
        System.out.println("String: s1=" + s1.value + " s2=" + s2.value);

        Wrapper<Anabul> x = new Wrapper<>(new Anggora("Milo", 3));
        Wrapper<Anabul> y = new Wrapper<>(new Kembangtelon("Oyen", 4));
        OperatorGenerik.tukar(x, y);
        System.out.println("Anabul: x=" + x.value.nama + " y=" + y.value.nama);

        double total = OperatorGenerik.bobot2(ang, new Kembangtelon("Oyen", 4));
        System.out.println("Total bobot: " + total);

        System.out.println("\n=== DATA ARRAY ===");

        Data<Kucing> data = new Data<>();
        data.setIsi(1, new Anggora("Milo", 3));
        data.setIsi(2, new Kembangtelon("Oyen", 4));

        System.out.println("Index 1: " + data.getIsi(1).nama);
        System.out.println("Index 2: " + data.getIsi(2).nama);
        System.out.println("Jumlah data: " + data.getSize());
    }
}