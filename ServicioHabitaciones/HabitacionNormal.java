package ServicioHabitaciones;

public class HabitacionNormal extends Habitacion implements BeneficioHabitacion {

    public HabitacionNormal(float precio) {
        super(precio);
        type = "normal";
    }

    public String getType() {
        return type;
    }

    @Override
    public PrototypeHabitacion clone() {
        return new HabitacionNormal(this.precio);
    }


    @Override
    public void accept(VisitorHabitacion v) {
        v.visitNormal(this);
    }
}