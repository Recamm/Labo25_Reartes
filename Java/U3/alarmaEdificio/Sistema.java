package U3.alarmaEdificio;

import java.lang.classfile.instruction.SwitchCase;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.SequencedSet;

public class Sistema {
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
