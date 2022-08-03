package ServicioHabitaciones;

import java.util.HashMap;

public class PrototypeRegistryHabitacion {

    private final HashMap<String, PrototypeHabitacion> habitaciones = new HashMap<>();
    public PrototypeRegistryHabitacion() {
       HabitacionFamiliar habitacionFamiliar = new HabitacionFamiliar(350);
       HabitacionEconomica habitacionEconomica = new HabitacionEconomica(100);
       HabitacionNormal habitacionNormal = new HabitacionNormal(200);
       HabitacionPremium habitacionPremium = new HabitacionPremium(600);

       habitaciones.put("Familiar", habitacionFamiliar );
       habitaciones.put("Economica", habitacionEconomica);
       habitaciones.put("Normal", habitacionNormal);
       habitaciones.put("Premium", habitacionPremium);
    }
    public PrototypeHabitacion get(String key){
        return habitaciones.get(key).clone();
    }

    public void addElement(String key, PrototypeHabitacion element){
        habitaciones.put(key, element);
    }

}
