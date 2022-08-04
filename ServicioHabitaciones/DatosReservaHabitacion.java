package ServicioHabitaciones;

import auxClasses.Cliente;
import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaHabitacion extends DatosReserva {
    int numDias;

    public DatosReservaHabitacion(Cliente cliente, Date fecha, int numDias) {
        super(cliente, fecha);
        this.numDias = numDias;
    }

    @Override
    public String toString() {
        return "nombre: " + getCliente().getNombre() + ", Apellido: " + getCliente().getApellido()  + ", para el dia: " + super.getFecha() +
                ", para: " + numDias +" dias";
    }
}
