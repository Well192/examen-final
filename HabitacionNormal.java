public class HabitacionNormal extends Habitacion{

    public HabitacionNormal(float precio) {
        super(precio);
        type = "normal";
    }

    public String getType() {
        return type;
    }

    @Override
    public Habitacion clone() {
        return new HabitacionNormal(this.precio);
    }
}
