package ServicioHabitaciones;

import auxClasses.Servicio;
import java.util.ArrayList;

public abstract class Habitacion implements PrototypeHabitacion, Servicio {
    int numero;
    float precio;
    boolean esOcupado = false;
    String type;
    protected ArrayList<DatosReservaHabitacion> reservas = new ArrayList<>();

    public void setEsOcupado(boolean esOcupado) {
        this.esOcupado = esOcupado;
    }

    public Habitacion(float precio) {
        this.precio = precio;
    }

    abstract void addReserva(DatosReservaHabitacion reserva);

    public abstract PrototypeHabitacion clone();

}
