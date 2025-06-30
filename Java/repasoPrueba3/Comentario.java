package repasoPrueba3;

public class Comentario {
    private Cliente cliente;
    private String descripcionComentario;

    public Comentario(Cliente cliente, String descripcionComentario) {
        this.cliente = cliente;
        this.descripcionComentario = descripcionComentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcionComentario() {
        return descripcionComentario;
    }

    public void setDescripcionComentario(String descripcionComentario) {
        this.descripcionComentario = descripcionComentario;
    }
}
