package ServicioHabitaciones;

public interface PrototypeHabitacion {
    String getType();
    PrototypeHabitacion clone();
}
