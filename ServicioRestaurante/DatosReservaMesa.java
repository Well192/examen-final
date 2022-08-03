package ServicioRestaurante;

import auxClasses.DatosReserva;
import java.util.Date;

public class DatosReservaMesa extends DatosReserva {
    int numPersonas;

    public DatosReservaMesa(String nombre, String apellido, Date fecha, int numPersonas) {
        super(nombre, apellido, fecha);
        this.numPersonas = numPersonas;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + ", Apellido: " + super.getApellido()  + ", para el dia: " + super.getFecha() +
                ", para: " + numPersonas +" personas";
    }

}
