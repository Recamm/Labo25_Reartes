package U5.gestionMascotas;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Mascota> mascotas = new ArrayList<>();

    public void saludar(Usuario usuario, Mascota mascota){
        if (mascota.getUsuario() == usuario){
            System.out.println(mascota.saludar());
        } else {
            if (!(mascota instanceof Pajaro)){
                System.out.println(mascota.saludar().toUpperCase());
            }
        }
    }


}
