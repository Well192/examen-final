package ServicioEstacionamiento;

import java.util.Date;

public class ReservarEstacionamiento{

    public void hacerReserva(String Nombre, String Apellido, Date fecha, EspacioEstacionamiento estacionamiento, float tiempo) {
        assert false;
        DatosReservaEstacionamiento reserva = new DatosReservaEstacionamiento(Nombre, Apellido, fecha, tiempo);
        estacionamiento.addReserva(reserva);
    }
}
