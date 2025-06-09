package U4.tiendaProductosElectronicos;

public class Televisor extends Multimedia{
    private Tecnologia tec;
    private int resolucionPixeles;

    public Televisor(String nombre, int precio, int stock, Tecnologia tec, int resolucionPixeles) {
        super(nombre, precio, stock);
        this.tec = tec;
        this.resolucionPixeles = resolucionPixeles;
    }

    public Tecnologia getTec() {
        return tec;
    }

    public void setTec(Tecnologia tec) {
        this.tec = tec;
    }

    public int getResolucionPixeles() {
        return resolucionPixeles;
    }

    public void setResolucionPixeles(int resolucionPixeles) {
        this.resolucionPixeles = resolucionPixeles;
    }
}
