public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftar = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : daftar) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}