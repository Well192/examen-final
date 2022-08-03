import ServicioEstacionamiento.EspacioEstacionamiento;
import ServicioEstacionamiento.ReservarEstacionamiento;
import ServicioHabitaciones.Habitacion;
import ServicioHabitaciones.ReservarHabitacion;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.ReservarMesa;
import auxClasses.Servicio;

import java.util.Date;

public class FachadaReservar {

    private ReservarHabitacion habitaciones = new ReservarHabitacion();
    private ReservarMesa mesas = new ReservarMesa();
    private ReservarEstacionamiento estacionamiento = new ReservarEstacionamiento();

    public void hacerReserva(String nombre, String apellido, Date fecha, float numero, Servicio servicio){

        if(servicio instanceof Habitacion){
            habitaciones.hacerReserva(nombre, apellido, fecha, (Habitacion) servicio, (int) numero);
        }

        if(servicio instanceof EspacioEstacionamiento){
            estacionamiento.hacerReserva(nombre, apellido, fecha, (EspacioEstacionamiento) servicio, numero);
        }

        if(servicio instanceof Mesa){
            mesas.hacerReserva(nombre, apellido, fecha, (Mesa) servicio, (int) numero);
        }
    }

}
