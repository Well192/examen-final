package ServicioRestaurante;

import ServicioHabitaciones.DatosReservaHabitacion;

import java.util.Date;

public class ReservarMesa {

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Mesa mesa, int numPersonas) {
        assert false;
        DatosReservaHabitacion reserva = new DatosReservaHabitacion(Nombre, Apellido, fecha, numPersonas);
        mesa.addReserva(reserva);
    }
}
