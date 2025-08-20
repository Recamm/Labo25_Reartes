package U7.sistemaAlarmas;

import java.util.ArrayList;

public class  Sistema {
    ArrayList<Sensor> sensores = new ArrayList<>();

    public void statusSensores(){
        for (Sensor s: sensores){
            s.statusAlarma();
        }
    }

    

    public void main(String[] args) {
        boolean bucle = true;
        while (bucle){
            statusSensores();
        }
    }
}
