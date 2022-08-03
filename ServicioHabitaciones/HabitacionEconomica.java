package ServicioHabitaciones;

public class HabitacionEconomica extends Habitacion implements BeneficioHabitacion {
    public HabitacionEconomica(float precio) {
        super(precio);
        super.type = "economica";
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public PrototypeHabitacion clone() {
        return new HabitacionEconomica(this.precio);
    }

    @Override
    public void accept(VisitorHabitacion v) {
        v.visitEconomic(this);
    }
}
