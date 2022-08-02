import ServicioEstacionamiento.EspacioEstacionamiento;
import ServicioEstacionamiento.ReservarEstacionamiento;
import ServicioHabitaciones.Habitacion;
import ServicioHabitaciones.ReservarHabitacion;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.ReservarMesa;
import auxClasses.Servicio;

import java.util.Date;

public class FachadaReservar {

    ReservarHabitacion habitacion = new ReservarHabitacion();
    ReservarMesa mesa = new ReservarMesa();
    ReservarEstacionamiento estacionamiento = new ReservarEstacionamiento();

    public void hacerReserva(String nombre, String apellido, Date fecha, float numero, Servicio servicio){

        if(servicio instanceof Habitacion){
            habitacion.hacerReserva(nombre, apellido, fecha, servicio, (int) numero);
        }

        if(servicio instanceof EspacioEstacionamiento){
            estacionamiento.hacerReserva(nombre, apellido, fecha, servicio, numero);
        }

        if(servicio instanceof Mesa){
            mesa.hacerReserva(nombre, apellido, fecha, servicio, (int) numero);
        }
    }

}
