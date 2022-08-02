package ServicioRestaurante;

import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaMesa extends DatosReserva {

    int numPersonas;

    public DatosReservaMesa(String nombre, String apellido, Date fecha, int numPersonas) {
        super(nombre, apellido, fecha);
        this.numPersonas = numPersonas;
    }
}
