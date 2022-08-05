package ServicioHabitaciones;

import javax.swing.*;

public class HabitacionEconomica extends Habitacion implements BeneficioHabitacion {
    public HabitacionEconomica(float precio) {
        super(precio);
        super.type = "economica";
    }

    @Override
    void addReserva(DatosReservaHabitacion reserva) {
        reservas.add(reserva);
        System.out.println("Se hizo la reserva de la habitacion economica para:\n" + reserva.toString());
        JOptionPane.showMessageDialog(null,
                "Se hizo la reserva de la habitacion economica para:\n" + reserva.toString());
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
    public String accept(VisitorHabitacion v) {
        return v.visitEconomic(this);
    }
}
