package auxClasses;

import ServicioEstacionamiento.EspacioEstacionamiento;
import ServicioEstacionamiento.ReservarEstacionamiento;
import ServicioHabitaciones.Habitacion;
import ServicioHabitaciones.ReservarHabitacion;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.ReservarMesa;

import java.util.Date;

public class FachadaReservar {

    private final ReservarHabitacion habitaciones = new ReservarHabitacion();
    private final ReservarMesa mesas = new ReservarMesa();
    private final ReservarEstacionamiento estacionamiento = new ReservarEstacionamiento();

    public void hacerReserva(Cliente cliente, Date fecha, float numero, Servicio servicio){

        if(servicio instanceof Habitacion){
            habitaciones.hacerReserva(cliente, fecha, (Habitacion) servicio, (int) numero);
        }

        if(servicio instanceof EspacioEstacionamiento){
            estacionamiento.hacerReserva(cliente, fecha, (EspacioEstacionamiento) servicio, numero);
        }

        if(servicio instanceof Mesa){
            mesas.hacerReserva(cliente, fecha, (Mesa) servicio, (int) numero);
        }
    }

}
