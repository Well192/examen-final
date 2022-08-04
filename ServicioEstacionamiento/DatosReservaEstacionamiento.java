package ServicioEstacionamiento;

import auxClasses.Cliente;
import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaEstacionamiento extends DatosReserva {

    float tiempo;//tiempo en horas

    public DatosReservaEstacionamiento(Cliente cliente, Date fecha, float tiempo) {
        super(cliente, fecha);
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "nombre: " + getCliente().getNombre() + ", Apellido: " + getCliente().getApellido()  + ", para el dia: " + super.getFecha() +
                ", para: " + tiempo +" horas";
    }

}
