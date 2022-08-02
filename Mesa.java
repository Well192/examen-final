import java.util.ArrayList;
import java.util.Date;

public class Mesa {
    boolean estaOcupado;
    ArrayList<Reserva> reservas;

    public Mesa() {
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }

    public void addReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println("se esta reservando mesa para: " + reserva.toString());
    }

}
