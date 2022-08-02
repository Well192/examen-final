package ServicioEstacionamiento;

import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaEstacionamiento extends DatosReserva {

    float tiempo;//tiempo en horas

    public DatosReservaEstacionamiento(String nombre, String apellido, Date fecha, float tiempo) {
        super(nombre, apellido, fecha);
        this.tiempo = tiempo;
    }
}
