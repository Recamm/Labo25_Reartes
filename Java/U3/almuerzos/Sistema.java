package U3.almuerzos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        ArrayList<Pedido> pedidosHoy = new ArrayList<>();
        for (Pedido p:pedidos){
            if (p.getFechaCreacion() == LocalDate.now()){
                pedidosHoy.add(p);
            }
        }

        for (Pedido p:pedidosHoy){
            System.out.println("Pedido de " + p.getSolicitante() + ":");
            boolean descuento = false;
            if (p.getSolicitante().getClass().getName() == "Profesor"){
                descuento = true;
            }
            for (Plato pl: p.getPlatos()){
                int precio = precio = pl.getPrecio();
                if (descuento){
                    Profesor profe = (Profesor) p.getSolicitante();
                    precio = pl.getPrecio() * (1 + profe.getPorcentajeDescuento()/100);
                }
                System.out.println(pl.getNombre() + " --> " + precio);
            }
        }


        // Saber si hay platos repetidos, y almacenarlos en un ArrayList de Plato
        ArrayList<Plato> platos = new ArrayList<>();
        for (Pedido pe:pedidos){
            for (Plato pl:pe.getPlatos()){
                pl.incrementarCantidad();
                if (!platos.contains(pl)){
                    platos.add(pl);
                }
            }
        }


        System.out.println("Top platos:");
        platos.sort(Comparator.comparingInt(Plato::getCantidadPedidos).reversed());
        for (Plato cantPl:platos){
            System.out.println(cantPl.getNombre() + " --> pedido " + cantPl.getCantidadPedidos() + " veces");
        }

    }
}
