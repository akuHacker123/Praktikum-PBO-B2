class Kucing extends Anabul {
    protected double bobot; // dalam kg

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " meong!");
    }
}