package ServicioHabitaciones;

import javax.swing.*;

public class HabitacionNormal extends Habitacion implements BeneficioHabitacion {

    public HabitacionNormal(float precio) {
        super(precio);
        type = "normal";
    }

    @Override
    void addReserva(DatosReservaHabitacion reserva) {
        reservas.add(reserva);
        System.out.println("Se hizo la reserva de la habitacion normal para:\n" + reserva.toString());
        JOptionPane.showMessageDialog(null,
                "Se hizo la reserva de la habitacion normal para:\n" + reserva.toString());
    }

    public String getType() {
        return type;
    }

    @Override
    public PrototypeHabitacion clone() {
        return new HabitacionNormal(this.precio);
    }

    @Override
    public String accept(VisitorHabitacion v) {
        return v.visitNormal(this);
    }
}