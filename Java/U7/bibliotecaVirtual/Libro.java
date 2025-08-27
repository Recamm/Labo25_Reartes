package U7.bibliotecaVirtual;

public class Libro {
    private String titulo, nombreArchivoPDF;
    private Autor autor;
    private Genero genero;
    private static int cantDescargasDisponibles = 145;
    private int stockDisponible;

    public Libro(String titulo, String nombreArchivoPDF, Autor autor, Genero genero) {
        this.titulo = titulo;
        this.nombreArchivoPDF = nombreArchivoPDF;
        this.autor = autor;
        this.genero = genero;
        this.stockDisponible = Libro.cantDescargasDisponibles;
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

    public void alquilarLibro(){
        Libro.cantDescargasDisponibles --;
    }
}
