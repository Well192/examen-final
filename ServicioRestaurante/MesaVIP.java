package ServicioRestaurante;

import ServicioHabitaciones.DatosReservaHabitacion;

public class MesaVIP extends Mesa implements BeneficioRestaurante{
    public MesaVIP(String tipo, Float precio) {
        super(tipo, precio);
    }

    @Override
    void addReserva(DatosReservaMesa reserva) {
        reservas.add(reserva);
        System.out.println("se esta reservando mesa VIP para:\n " + reserva.toString());
    }

    @Override
    public PrototypeMesa clone() {
        return new MesaVIP(this.tipo, this.precio);
    }

    @Override
    public void accept(VisitorRestaurante v) {
        v.visitMesaVIP(this);
    }
}
