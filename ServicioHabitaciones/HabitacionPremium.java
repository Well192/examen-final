package ServicioHabitaciones;

public class HabitacionPremium extends Habitacion implements BeneficioHabitacion {
    public HabitacionPremium(float precio) {
        super(precio);
        super.type = "premium";
    }

    @Override
    void addReserva(DatosReservaHabitacion reserva) {
        reservas.add(reserva);
        System.out.println("Se hizo la reserva de la habitacion premium para:\n" + reserva.toString());
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public PrototypeHabitacion clone() {
        return new HabitacionPremium(this.precio);
    }

    @Override
    public String accept(VisitorHabitacion v) {
        return v.visitPremium(this);
    }
}
