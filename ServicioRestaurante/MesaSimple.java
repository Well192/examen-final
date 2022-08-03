package ServicioRestaurante;

import ServicioHabitaciones.DatosReservaHabitacion;

public class MesaSimple extends Mesa implements  BeneficioRestaurante{

    public MesaSimple(String tipo, Float precio) {
        super(tipo, precio);
    }

    @Override
    void addReserva(DatosReservaMesa reserva) {
        super.reservas.add(reserva);
        System.out.println("se esta reservando una mesa " + this.getType() + " simple para:\n " + reserva.toString());
    }

    public String getType() {
        return tipo;
    }

    public PrototypeMesa clone(){
        return new MesaSimple(this.tipo,this.precio);
    }


    @Override
    public void accept(VisitorRestaurante v) {
        v.visitMesaSimple(this);
    }
}
