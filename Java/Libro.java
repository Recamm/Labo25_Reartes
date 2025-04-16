package Unidad1;

public class Libro {
    private String titulo, autor, editorial;
    private int ISBN, paginas;
    private Persona usuario;
    private Fecha fechaPublicacion;


    public Libro(String titulo, String autor, String editorial, int ISBN, int paginas, Persona usuario, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.usuario = usuario;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String anterior(Libro libroComparar){
        return this.fechaPublicacion.menorQue(libroComparar.getFechaPublicacion());
    }
}