package ServicioRestaurante;

import java.util.HashMap;

public class PrototypeRegistryMesa {
    private final HashMap<String, PrototypeMesa> mesas = new HashMap<>();

    public PrototypeRegistryMesa() {
        MesaSimple mesaPequeno = new MesaSimple("pequeno", 50.0F);
        MesaSimple mesaGrande = new MesaSimple("grande", 100.0F);
        MesaVIP mesaPrivada= new MesaVIP("vip", 200.0F);

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
