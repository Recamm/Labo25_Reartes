package U3.vehiculos;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public class sistema {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Integer> cantVehiculos = new ArrayList<>(); // Auto[0], Camioneta[1], Bicicleta[2]
        for (int i = 0; i < 3; i++){ cantVehiculos.add(0); } // Set cantidades en cero
        String vehiculoMayorCant = "";
        int autosDescapotables = 0;

        for (Vehiculo v:vehiculos){
            switch (v.getClass().getName()){
                case "Auto":
                    Auto autoo = (Auto) v;
                    cantVehiculos.set(0, cantVehiculos.get(0) + 1);
                    if (autoo.getDescapotables()){
                        autosDescapotables++;
                    }
                    break;
                case "Camioneta":
                    cantVehiculos.set(1, cantVehiculos.get(1) + 1);
                    break;
                case "Bicicleta":
                    cantVehiculos.set(2, cantVehiculos.get(2) + 1);
                    break;
            }
        }

        int valor = cantVehiculos.get(0);
        String nombresVehiculos[] = {"Auto", "Camioneta", "Bicicleta"};
        for (int i = 0; i < 3; i++){
            if (valor < cantVehiculos.get(i)){
                valor = cantVehiculos.get(i);
                vehiculoMayorCant = nombresVehiculos[i];
            }
        }

        System.out.println("Vehiculo con mayor cantidad -->" + vehiculoMayorCant);
        System.out.println("Autos descapotables -->" + (autosDescapotables / cantVehiculos.get(0) * 100));
    }
}
