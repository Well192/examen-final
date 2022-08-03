package ServicioRestaurante;

import ServicioHabitaciones.DatosReservaHabitacion;

import java.util.Date;

public class ReservarMesa {

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Mesa mesa, int numPersonas) {
        assert false;
        DatosReservaMesa reserva = new DatosReservaMesa(Nombre, Apellido, fecha, numPersonas);
        mesa.addReserva(reserva);
    }
}
