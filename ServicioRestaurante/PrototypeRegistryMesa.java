package ServicioRestaurante;

import ServicioRestaurante.PrototypeMesa;

import java.util.HashMap;

public class PrototypeRegistryMesa {
    private final HashMap<String, PrototypeMesa> mesas = new HashMap<>();

    public PrototypeRegistryMesa() {
        Mesa mesaPequeno = new Mesa("pequeno", 50.0F);
        Mesa mesaGrande = new Mesa("grande", 100.0F);
        Mesa mesaPrivada= new Mesa("privada", 200.0F);

        mesas.put("pequeno", mesaPequeno);
        mesas.put("grande", mesaGrande);
        mesas.put("privada", mesaPrivada);

    }
    public PrototypeMesa get(String key){
        return mesas.get(key).clone();
    }

    public void addElement(String key, PrototypeMesa element){
        mesas.put(key, element);
    }
}
