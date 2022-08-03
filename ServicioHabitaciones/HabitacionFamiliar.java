package ServicioHabitaciones;

public class HabitacionFamiliar extends Habitacion implements BeneficioHabitacion {
    public HabitacionFamiliar(float precio) {
        super(precio);
        super.type = "familiar";
    }

    @Override
    void addReserva(DatosReservaHabitacion reserva) {
        reservas.add(reserva);
        System.out.println("Se hizo la reserva de la habitacion familiar para:\n" + reserva.toString());
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public PrototypeHabitacion clone() {
        return new HabitacionFamiliar(this.precio);
    }

    @Override
    public String accept(VisitorHabitacion v) {
       return v.visitFamiliar(this);
    }
}
