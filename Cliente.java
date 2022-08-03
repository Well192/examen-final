import ServicioEstacionamiento.PrototypeRegistryEstacionamiento;
import ServicioHabitaciones.PrototypeRegistryHabitacion;
import ServicioRestaurante.PrototypeRegistryMesa;
import auxClasses.Servicio;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellido;
    private String numDNI;

    public Cliente(String nombre, String apellido, String numDNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDNI = numDNI;
    }

    public static void main (String[] args){
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        FachadaReservar fachada = new FachadaReservar();
        Date fechaActual = new Date();
        PrototypeRegistryHabitacion habitacion = new PrototypeRegistryHabitacion();
        PrototypeRegistryEstacionamiento estacionamiento = new PrototypeRegistryEstacionamiento();
        PrototypeRegistryMesa mesa = new PrototypeRegistryMesa();

        //reserva los 3 servicios a traves de la fachada mas economicos para hoy
        fachada.hacerReserva(uno.nombre, uno.apellido,fechaActual, 2f,(Servicio) habitacion.get("Economica"));
        fachada.hacerReserva(uno.nombre, uno.apellido,fechaActual, 12f,(Servicio) estacionamiento.get("pequeno"));
        fachada.hacerReserva(uno.nombre, uno.apellido,fechaActual, 4f,(Servicio) mesa.get("pequeno"));

    }

}
