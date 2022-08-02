import java.util.ArrayList;
import java.util.Date;

public class EspacioEstacionamiento {
    private boolean estaOcupado;
    private ArrayList<Reserva> reservas;

    public EspacioEstacionamiento() {
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }

    public void addReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println("esta reservado estacionamiento para : " + reserva.toString());
    }

}
