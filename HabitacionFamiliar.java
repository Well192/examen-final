public class HabitacionFamiliar extends Habitacion implements Servicio{
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
    public void accept(Visitor v) {
        v.visitFamiliar(this);
    }
}
