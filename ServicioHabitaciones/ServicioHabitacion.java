package ServicioHabitaciones;

import ServicioHabitaciones.VisitorHabitacion;

public interface ServicioHabitacion {
    void accept(VisitorHabitacion v);
}
