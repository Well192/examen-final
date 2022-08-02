package ServicioRestaurante;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.Date;

public class ReservarMesa {

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Servicio mesa, int numDias) {
        assert false;
        mesa.reservas.add(new DatosReservaMesa(Nombre, Apellido, fecha, numDias));
        mesa.reservas.get(mesa.reservas.size()).toString();
    }
}
