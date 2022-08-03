package ServicioRestaurante;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.ArrayList;

public class Mesa implements Servicio, PrototypeMesa {
    boolean Ocupado;
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
    public PrototypeMesa clone() {
        return new Mesa(this.tipo, this.precio);
    }


}
