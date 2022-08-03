package ServicioRestaurante;

import ServicioHabitaciones.DatosReservaHabitacion;
import auxClasses.Servicio;

import java.util.ArrayList;

public abstract class Mesa implements Servicio, PrototypeMesa {
    private boolean Ocupado;
    private ArrayList<DatosReservaHabitacion> reservas = new ArrayList<DatosReservaHabitacion>();
    String tipo;
     Float precio;
    public Mesa(String tipo, Float precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public boolean isOcupado() {
        return Ocupado;
    }

    public void setOcupado(boolean estaOcupado) {
        this.Ocupado = estaOcupado;
    }

    public void addReserva(DatosReservaHabitacion reserva){
        reservas.add(reserva);
        System.out.println("se esta reservando mesa para:\n " + reserva.toString());
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public abstract PrototypeMesa clone();


}
