package ServicioHabitaciones;

import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaHabitacion extends DatosReserva {
    float numDias;

    public DatosReservaHabitacion(String nombre, String apellido, Date fecha, int numDias) {
        super(nombre, apellido, fecha);
        this.numDias = numDias;
    }
}
