package auxClasses;

import ServicioEstacionamiento.PrototypeRegistryEstacionamiento;
import ServicioHabitaciones.PrototypeRegistryHabitacion;
import ServicioRestaurante.PrototypeRegistryMesa;

import java.util.Date;

public class Cliente {
    private final String nombre;
    private final String apellido;
    private final String numDNI;

    public Cliente(String nombre, String apellido, String numDNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDNI = numDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumDNI() {
        return numDNI;
    }

    public static void main (String[] args){
        Cliente uno = new Cliente("Armando Alberto", "Lluen Gallardo", "33333333");
        FachadaReservar fachada = new FachadaReservar();
        Date fechaActual = new Date();
        PrototypeRegistryHabitacion habitacion = new PrototypeRegistryHabitacion();
        PrototypeRegistryEstacionamiento estacionamiento = new PrototypeRegistryEstacionamiento();
        PrototypeRegistryMesa mesa = new PrototypeRegistryMesa();

        System.out.println("Reservado servicion economicos -----------------------------------------------------");
        //reserva los 3 servicios a traves de la fachada mas economicos para hoy
        fachada.hacerReserva(uno,fechaActual, 2f,(Servicio) habitacion.get("Economica"));
        fachada.hacerReserva(uno,fechaActual, 12f,(Servicio) estacionamiento.get("pequeno"));
        fachada.hacerReserva(uno,fechaActual, 4f,(Servicio) mesa.get("pequeno"));

        System.out.println("\n\nReservado servicion lujosos -----------------------------------------------------");
        //reserva los 3 servicios a traves de la fachada mas caros para hoy
        fachada.hacerReserva(uno,fechaActual, 2f,(Servicio) habitacion.get("Premium"));
        fachada.hacerReserva(uno,fechaActual, 12f,(Servicio) estacionamiento.get("grande"));
        fachada.hacerReserva(uno,fechaActual, 4f,(Servicio) mesa.get("vipGrande"));

        System.out.println("\n\nReservando los otros tipos de habitaciones -----------------------------------------------------");
        //reserva los 3 servicios a traves de la fachada mas caros para hoy
        fachada.hacerReserva(uno,fechaActual, 2f,(Servicio) habitacion.get("Familiar"));
        fachada.hacerReserva(uno,fechaActual, 2f,(Servicio) habitacion.get("Normal"));

    }

}
