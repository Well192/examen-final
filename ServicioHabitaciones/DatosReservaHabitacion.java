package ServicioHabitaciones;

import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaHabitacion extends DatosReserva {
    int numDias;

    public DatosReservaHabitacion(String nombre, String apellido, Date fecha, int numDias) {
        super(nombre, apellido, fecha);
        this.numDias = numDias;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + ", Apellido: " + super.getApellido()  + ", para el dia: " + super.getFecha() +
                ", para: " + numDias +" dias";
    }
}
