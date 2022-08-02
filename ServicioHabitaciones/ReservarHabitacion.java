package ServicioHabitaciones;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.Date;

public class ReservarHabitacion{

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Servicio habitacion, int numDias) {
        assert false;
        habitacion.reservas.add(new DatosReservaHabitacion(Nombre, Apellido, fecha, numDias));
        habitacion.reservas.get(habitacion.reservas.size()).toString();
    }
}
