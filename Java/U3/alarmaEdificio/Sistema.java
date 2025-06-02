package U3.alarmaEdificio;

import java.lang.classfile.instruction.SwitchCase;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.SequencedSet;

public class Sistema {
    public static void main(String[] args) {
        boolean bucle = true;
        ArrayList<Sensor> sensores = new ArrayList<>();
        while (bucle){
            for (Sensor s:sensores){
                if (s.getMedida() > s.getUmbralInicial()){
//                    switch (s.getClass().getName()){
//                        case "SensorHumo":
//                            System.out.println("Llamando a bomberos...");
//                            break;
//                        case "Sensor Temperatura":
//                            System.out.println("Cuidado! Temperatura alta!");
//                            break;
//                    }

                    //Cual de las dos soluciones es mejor?

                    if (s instanceof SensorHumo){
                        System.out.println("Llamando a bomberos...");
                    } else if (s instanceof SensorTemperatura) {
                        System.out.println("Cuidado! Temperatura alta!");
                    }
                }
            }

            int medida = 0, umbral = 0;
            for (Sensor s:sensores){
                if (s instanceof SensorPresion){
                    medida += s.getMedida();
                    umbral = s.getUmbralInicial();
                }
            }
            if (medida/3 > umbral){
                System.out.println("Sensores de presion activados!");
            }

        }
    }
}
