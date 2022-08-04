package auxClasses;

import java.util.Date;

public class DatosReserva {
    private final Cliente cliente;
    private final Date fecha;

    public DatosReserva(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Nombre: " + getCliente().getNombre() + ", Apellido: " + getCliente().getApellido() + ", fecha:" + fecha;
    }
}
