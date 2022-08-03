package ServicioRestaurante;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.ArrayList;

public abstract class Mesa implements Servicio, PrototypeMesa {
    private boolean Ocupado;
    ArrayList<DatosReserva> reservas;
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

    public void addReserva(DatosReserva reserva){
        reservas.add(reserva);
        System.out.println("se esta reservando mesa para: " + reserva.toString());
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public abstract PrototypeMesa clone();


}
