package ServicioHabitaciones;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.ArrayList;

public abstract class Habitacion implements Prototype, Servicio {
    int numero;
    float precio;
    boolean esOcupado = false;
    String type;

    ArrayList<DatosReserva> reservas;

    public void setEsOcupado(boolean esOcupado) {
        this.esOcupado = esOcupado;
    }

    public Habitacion(float precio) {
        this.precio = precio;
    }

    public abstract Prototype clone();

}
