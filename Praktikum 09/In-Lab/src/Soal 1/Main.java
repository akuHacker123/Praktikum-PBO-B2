public class Main {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("IniGalang");
        t.addNama("IniGalskuy");
        t.addNama("IniGaltot");
        t.addNama("IniGalcuy");

        t.showTeman();

        System.out.println("Jumlah teman: " + t.getNbelm());

        System.out.println("apakah Galskuy ada? " + t.isMember("IniGalskuy"));

        System.out.println("Jumlah Galskuy: " + t.countNama("IniGalskuy"));

        t.gantiNama("Galtot", "Skuylang");

        t.setNama(1, "IniGalskuy");

        t.delNama("IniGalang");

        System.out.println("\nSetelah perubahan:");
        t.showTeman();
    }
}