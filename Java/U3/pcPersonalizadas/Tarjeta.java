package U3.pcPersonalizadas;

import java.time.LocalDate;

public class Tarjeta {
    private String titular;
    private int nroTarjeta, codSeguridad;
    private double recargo;
    private LocalDate fechaVencimiento;

    public Tarjeta(int nroTarjeta, int codSeguridad, LocalDate fechaVencimiento, String titular) {
        if (fechaVencimiento.isBefore(LocalDate.now())){
            this.nroTarjeta = nroTarjeta;
            this.codSeguridad = codSeguridad;
            this.fechaVencimiento = fechaVencimiento;
            this.titular = titular;
            this.recargo = 0.5;
        } else {
            System.out.println("Tarjeta vencida");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public int getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(int codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    public double  getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        if (fechaVencimiento.isBefore(LocalDate.now())){
            this.fechaVencimiento = fechaVencimiento;
        } else {
            System.out.println("Tarjeta vencida");
        }
    }
}
