package U3.pcPersonalizadas;

import java.util.ArrayList;

public class Compra {
    private int celularCliente;
    private boolean tarjeta;
    private ArrayList<CPU> cpu;
    private ArrayList<Componentes> componentes;

    public Compra(int celularCliente, boolean tarjeta, ArrayList<CPU> cpu, ArrayList<Componentes> componentes) {
        this.celularCliente = celularCliente;
        this.tarjeta = tarjeta;
        this.cpu = cpu;
        this.componentes = componentes;
    }

    public int getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(int celularCliente) {
        this.celularCliente = celularCliente;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<CPU> getCpu() {
        return cpu;
    }

    public void setCpu(ArrayList<CPU> cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Componentes> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }
}