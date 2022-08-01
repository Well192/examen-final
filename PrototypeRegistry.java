import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private final HashMap<String , Habitacion> habitaciones = new HashMap<>();
    public PrototypeRegistry() {
       HabitacionFamiliar habitacionFamiliar = new HabitacionFamiliar(350);
       HabitacionEconomica habitacionEconomica = new HabitacionEconomica(100);
       HabitacionNormal habitacionNormal = new HabitacionNormal(200);
       HabitacionPremium habitacionPremium = new HabitacionPremium(1000);

       habitaciones.put("Familiar", habitacionFamiliar );
       habitaciones.put("Economica", habitacionEconomica);
       habitaciones.put("Normal", habitacionNormal);
       habitaciones.put("Habitacion Premium", habitacionPremium);

    }

    public Habitacion get(String key){
        return habitaciones.get(key).clone();
    }


}
