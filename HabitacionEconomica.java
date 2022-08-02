public class HabitacionEconomica extends Habitacion implements Servicio {
    public HabitacionEconomica(float precio) {
        super(precio);
        super.type = "economica";
    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public Habitacion clone() {
        return new HabitacionEconomica(this.precio);
    }

    @Override
    public void accept(Visitor v) {
        v.visitEconomic(this);
    }
}
