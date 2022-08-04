package ServicioRestaurante;

import auxClasses.Cliente;

import java.util.Date;

public class ReservarMesa {

    public void hacerReserva(Cliente cliente, Date fecha, Mesa mesa, int numPersonas) {
        DatosReservaMesa reserva = new DatosReservaMesa(cliente, fecha, numPersonas);
        mesa.addReserva(reserva);
    }
}
