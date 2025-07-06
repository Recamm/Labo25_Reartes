package repasoPrueba3.Default;

public enum Estado {
    ABIERTO(false), ENPROGRESO(false), RESUELTO(true), CERRADO(true), CANCELADO(true);

    public boolean finalizado;

    private Estado(boolean finalizado){
        this.finalizado = finalizado;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
}