package ServicioHabitaciones;

public class HabitacionPremium extends Habitacion implements BeneficioHabitacion {

    public HabitacionPremium(float precio) {
        super(precio);
        super.type = "premium";
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public Habitacion clone() {
        return new HabitacionPremium(this.precio);
    }

    @Override
    public void accept(VisitorHabitacion v) {
        v.visitPremium(this);
    }
}
