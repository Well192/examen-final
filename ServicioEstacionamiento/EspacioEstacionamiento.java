package ServicioEstacionamiento;

import auxClasses.Servicio;

import java.util.ArrayList;

public class EspacioEstacionamiento implements PrototypeEstacionamiento,Servicio, BeneficioEstacionamiento {
    private Float precio;
    private String tamano;
    private boolean Ocupado;
    private ArrayList<DatosReservaEstacionamiento> reservas;
    public EspacioEstacionamiento(String tamano, Float precio) {
        this.tamano = tamano;
        this.precio = precio;
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
    public PrototypeEstacionamiento clone() {
        return new EspacioEstacionamiento(this.tamano, this.precio);
    }

    @Override
    public void accept(VisitorEstacionamiento v) {
        v.visitEspacioEstacionamiento(this);
    }
}
