package U7.bibliotecaVirtual;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);

    private int librosPrestados;

    private Membresia (int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }
}
