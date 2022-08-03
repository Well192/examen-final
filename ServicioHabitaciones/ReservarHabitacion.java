package ServicioHabitaciones;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.Date;

public class ReservarHabitacion{

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Habitacion habitacion, int numDias) {
        assert false;
        DatosReservaHabitacion reserva = new DatosReservaHabitacion(Nombre, Apellido, fecha, numDias);
        habitacion.addReserva(reserva);
    }
}
