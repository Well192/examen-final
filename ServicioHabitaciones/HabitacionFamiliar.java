package ServicioHabitaciones;

public class HabitacionFamiliar extends Habitacion implements BeneficioHabitacion {
    public HabitacionFamiliar(float precio) {
        super(precio);
        super.type = "familiar";
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public Habitacion clone() {
        return new HabitacionFamiliar(this.precio);
    }

    @Override
    public void accept(VisitorHabitacion v) {
        v.visitFamiliar(this);
    }
}
