package ServicioEstacionamiento;

import java.util.HashMap;

public class PrototypeRegistryEstacionamiento {
    private final HashMap<String, PrototypeEstacionamiento> estacionamientos = new HashMap<>();

    public PrototypeRegistryEstacionamiento() {
        EspacioEstacionamiento espacioPequeno = new EspacioEstacionamiento("pequeno", 50.0F);
        EspacioEstacionamiento espacioGrande = new EspacioEstacionamiento("grande", 100.0F);

        estacionamientos.put("pequeno", espacioPequeno);
        estacionamientos.put("grande", espacioGrande);

    }
    public PrototypeEstacionamiento get(String key){
        return estacionamientos.get(key).clone();
    }

    public void addElement(String key, PrototypeEstacionamiento element){
        estacionamientos.put(key, element);
    }
}
