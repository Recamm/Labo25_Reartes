package U4.tiendaProductosElectronicos;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto prd){
        this.productos.add(prd);
    }

    public void eliminarProducto(Producto prd){
        this.productos.remove(prd);
    }

    public void modificarProducto(Producto ant, Producto post){
        int index = 0;
        for (int i = 0; i < productos.size(); i++){
            if (productos.get(i).equals(ant)){
                index = i;
            }
        }
        this.productos.set(index, post);
    }

    public Producto mayorStock(){
        Producto prd = productos.get(0);
        for (Producto p:productos){
            if (p.getStock() > prd.getStock()){
                prd = p;
            }
        }
        return prd;
    }

    public Producto menorStock(){
        Producto prd = productos.get(0);
        for (Producto p:productos){
            if (p.getStock() < prd.getStock()){
                prd = p;
            }
        }
        return prd;
    }

}
