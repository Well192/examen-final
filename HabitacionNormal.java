public class HabitacionNormal extends Habitacion implements Servicio{

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


    @Override
    public void accept(Visitor v) {
        v.visitNormal(this);
    }
}