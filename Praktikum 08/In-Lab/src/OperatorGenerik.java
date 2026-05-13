class OperatorGenerik {

    public static <T> void tukar(Wrapper<T> a, Wrapper<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static double bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}