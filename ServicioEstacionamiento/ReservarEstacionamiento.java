package ServicioEstacionamiento;

import auxClasses.Cliente;

import java.util.Date;

public class ReservarEstacionamiento{

    public void hacerReserva(Cliente cliente, Date fecha, EspacioEstacionamiento estacionamiento, float tiempo) {
        assert false;
        DatosReservaEstacionamiento reserva = new DatosReservaEstacionamiento(cliente, fecha, tiempo);
        estacionamiento.addReserva(reserva);
    }
}
