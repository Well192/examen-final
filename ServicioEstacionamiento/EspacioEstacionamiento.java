package ServicioEstacionamiento;

import auxClasses.Servicio;

import java.util.ArrayList;

public class EspacioEstacionamiento implements PrototypeEstacionamiento,Servicio {
    private Float precious;
    private String tamano;
    private boolean Ocupado;
    private ArrayList<DatosReservaEstacionamiento> reservas;


    public EspacioEstacionamiento(String tamano, Float precious) {
        this.tamano = tamano;
        this.precious = precious;
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

    @Override
    public String tamano() {
        return this.tamano;
    }


    @Override
    public EspacioEstacionamiento clone() {
        return new EspacioEstacionamiento(this.tamano, this.precious);
    }


}
