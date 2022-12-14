package ServicioRestaurante;

import auxClasses.Servicio;
import java.util.ArrayList;

public abstract class Mesa implements Servicio, PrototypeMesa {
    String tipo;
    Float precio;
    private boolean Ocupado;
    protected ArrayList<DatosReservaMesa> reservas = new ArrayList<>();

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

    abstract void addReserva(DatosReservaMesa reserva);

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public abstract PrototypeMesa clone();
}
