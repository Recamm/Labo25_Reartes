package U7.bibliotecaVirtual;

public class Libro {
    private String titulo, nombreArchivoPDF;
    private Autor autor;
    private Genero genero;
    private int cantDescargasDisponibles;
    private int stockDisponible;

    public Libro(String titulo, String nombreArchivoPDF, Autor autor, Genero genero, int cantDescargasDisponibles, int stockDisponible) {
        this.titulo = titulo;
        this.nombreArchivoPDF = nombreArchivoPDF;
        this.autor = autor;
        this.genero = genero;
        this.cantDescargasDisponibles = 145;
        this.stockDisponible = 145;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreArchivoPDF() {
        return nombreArchivoPDF;
    }

    public void setNombreArchivoPDF(String nombreArchivoPDF) {
        this.nombreArchivoPDF = nombreArchivoPDF;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getCantDescargasDisponibles() {
        return cantDescargasDisponibles;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }
}
