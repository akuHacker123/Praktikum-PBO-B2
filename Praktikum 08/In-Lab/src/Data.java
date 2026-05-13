class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    public T getIsi(int index) {
        if (index < 1 || index > banyak) {
            return null;
        }
        return ruang[index - 1];
    }

    public void setIsi(int index, T value) {
        if (index < 1 || index > 100) {
            return;
        }

        ruang[index - 1] = value;

        if (index > banyak) {
            banyak = index;
        }
    }

    public int getSize() {
        return banyak;
    }
}