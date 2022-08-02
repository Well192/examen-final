package ServicioRestaurante;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.ArrayList;

public class Mesa implements Servicio {
    boolean Ocupado;
    ArrayList<DatosReserva> reservas;

    public Mesa() {
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

}
