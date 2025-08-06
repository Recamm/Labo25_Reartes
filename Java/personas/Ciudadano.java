package personas;

import java.util.HashMap;

public class Ciudadano {
    private int dni;
    private String nombre, apellido, provinciaResidencia, domicilio, mailContacto, provincia;

    public Ciudadano(int dni, String nombre, String apellido, String provinciaResidencia, String domicilio, String mailContacto, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provinciaResidencia = provinciaResidencia;
        this.domicilio = domicilio;
        this.mailContacto = mailContacto;
        this.provincia = provincia;
    }

    public String getProvincia() { return provincia; }

    public void setProvincia(String provincia) { this.provincia = provincia; }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProvinciaResidencia() {
        return provinciaResidencia;
    }

    public void setProvinciaResidencia(String provinciaResidencia) {
        this.provinciaResidencia = provinciaResidencia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMailContacto() {
        return mailContacto;
    }

    public void setMailContacto(String mailContacto) {
        this.mailContacto = mailContacto;
    }
}
