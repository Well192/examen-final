import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private final HashMap<String , Prototype> habitaciones = new HashMap<>();
    public PrototypeRegistry() {
       HabitacionFamiliar habitacionFamiliar = new HabitacionFamiliar(350);
       HabitacionEconomica habitacionEconomica = new HabitacionEconomica(100);
       HabitacionNormal habitacionNormal = new HabitacionNormal(200);
       HabitacionPremium habitacionPremium = new HabitacionPremium(600);

       habitaciones.put("Familiar", habitacionFamiliar );
       habitaciones.put("Economica", habitacionEconomica);
       habitaciones.put("Normal", habitacionNormal);
       habitaciones.put("Premium", habitacionPremium);

    }

    public Prototype get(String key){
        return habitaciones.get(key).clone();
    }

    public void addElement(String key, Prototype element){
        habitaciones.put(key, element);
    }

}
