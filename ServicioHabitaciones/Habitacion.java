package ServicioHabitaciones;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.ArrayList;

public abstract class Habitacion implements PrototypeHabitacion, Servicio {
    int numero;
    float precio;
    boolean esOcupado = false;
    String type;

    private ArrayList<DatosReservaHabitacion> reservas = new ArrayList<>();

    public void setEsOcupado(boolean esOcupado) {
        this.esOcupado = esOcupado;
    }

    public Habitacion(float precio) {
        this.precio = precio;
    }

    public void addReserva(DatosReservaHabitacion reserva){
        reservas.add(reserva);
        System.out.println("Se hizo la reserva de la habitacion para:\n" + reserva.toString());
    }

    public abstract PrototypeHabitacion clone();

}
