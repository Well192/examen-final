package ServicioEstacionamiento;

import auxClasses.DatosReserva;

import java.util.Date;

public class DatosReservaEstacionamiento extends DatosReserva {

    float tiempo;//tiempo en horas

    public DatosReservaEstacionamiento(String nombre, String apellido, Date fecha, float tiempo) {
        super(nombre, apellido, fecha);
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + ", Apellido: " + super.getApellido()  + ", para el dia: " + super.getFecha() +
                ", para: " + tiempo +" horas";
    }

}
