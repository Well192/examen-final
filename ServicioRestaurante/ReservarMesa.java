package ServicioRestaurante;

import java.util.Date;

public class ReservarMesa {

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Mesa mesa, int numPersonas) {
        DatosReservaMesa reserva = new DatosReservaMesa(Nombre, Apellido, fecha, numPersonas);
        mesa.addReserva(reserva);
    }
}
