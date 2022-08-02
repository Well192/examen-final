package ServicioEstacionamiento;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.Date;

public class ReservarEstacionamiento{

    public void hacerReserva(String Nombre, String Apellido, Date fecha, Servicio estacionamiento, float tiempo) {
        assert false;
        estacionamiento.reservas.add(new DatosReservaEstacionamiento(Nombre, Apellido, fecha, tiempo));
        estacionamiento.reservas.get(estacionamiento.reservas.size()).toString();
    }
}
