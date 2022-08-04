package ServicioHabitaciones;
import auxClasses.Cliente;

import java.util.Date;

public class ReservarHabitacion{

    public void hacerReserva(Cliente cliente, Date fecha, Habitacion habitacion, int numDias) {
        assert false;
        DatosReservaHabitacion reserva = new DatosReservaHabitacion(cliente, fecha, numDias);
        habitacion.addReserva(reserva);
    }
}
