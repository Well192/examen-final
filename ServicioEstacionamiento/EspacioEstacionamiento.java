package ServicioEstacionamiento;

import auxClasses.DatosReserva;
import auxClasses.Servicio;

import java.util.ArrayList;

public class EspacioEstacionamiento implements Servicio {
    private boolean Ocupado;
    private ArrayList<DatosReservaEstacionamiento> reservas;

    public EspacioEstacionamiento() {
    }

    public boolean isOcupado() {
        return Ocupado;
    }

    public void setOcupado(boolean estaOcupado) {
        this.Ocupado = estaOcupado;
    }

    public void addReserva(DatosReservaEstacionamiento reserva){
        reservas.add(reserva);
        System.out.println("esta reservado estacionamiento para : " + reserva.toString());
    }

}
