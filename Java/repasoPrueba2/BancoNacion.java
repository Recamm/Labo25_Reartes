package repasoPrueba2;

import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean abierto24hs, enFuncionamiento;
    private ArrayList<Persona> trabajadores;

    public BancoNacion(String direccion, boolean abierto24hs, boolean enFuncionamiento){
        this.direccion = direccion;
        this.abierto24hs = abierto24hs;
        this.enFuncionamiento = enFuncionamiento;
        trabajadores = new ArrayList<>();
    }

    public void setDireccion(String direccion){ this.direccion = direccion; }
    public void setAbierto24hs(Boolean abierto24hs){ this.abierto24hs = abierto24hs; }
    public void setEnFuncionamiento(Boolean enFuncionamiento){ this.enFuncionamiento = enFuncionamiento; }

    public String getDireccion(){ return this.direccion; }
    public Boolean getAbierto24hs(){ return this.abierto24hs; }
    public Boolean getEnFuncionamiento(){ return this.enFuncionamiento; }

    public void agregarTrabajador(Persona persona){ this.trabajadores.add(persona); }

    public void cantidadTrabajadores(){
        System.out.println(trabajadores.size());
    }

    public Persona empleadoMayorAntiguedad(){
        Persona mayorAntiguedad = trabajadores.get(0);
        for (Persona p:trabajadores){
            if(p.antiguedad() > mayorAntiguedad.antiguedad()){
                mayorAntiguedad = p;
            }
        }
        return mayorAntiguedad;
    }
}
