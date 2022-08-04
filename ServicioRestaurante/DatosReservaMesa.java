package ServicioRestaurante;

import auxClasses.Cliente;
import auxClasses.DatosReserva;
import java.util.Date;

public class DatosReservaMesa extends DatosReserva {
    int numPersonas;

    public DatosReservaMesa(Cliente cliente, Date fecha, int numPersonas) {
        super(cliente, fecha);
        this.numPersonas = numPersonas;
    }

    @Override
    public String toString() {
        return "nombre: " + getCliente().getNombre() + ", Apellido: " + getCliente().getApellido()  + ", para el dia: " + super.getFecha() +
                ", para: " + numPersonas +" personas";
    }

}
