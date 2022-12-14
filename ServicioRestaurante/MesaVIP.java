package ServicioRestaurante;

import javax.swing.*;

public class MesaVIP extends Mesa implements BeneficioRestaurante{
    public MesaVIP(String tipo, Float precio) {
        super(tipo, precio);
    }

    @Override
    void addReserva(DatosReservaMesa reserva) {
        reservas.add(reserva);
        System.out.println("se esta reservando mesa VIP " + super.tipo + " para:\n " + reserva.toString());
        JOptionPane.showMessageDialog(null,
                "se esta reservando mesa VIP " + super.tipo + " para:\n " + reserva.toString());
    }

    @Override
    public PrototypeMesa clone() {
        return new MesaVIP(this.tipo, this.precio);
    }

    @Override
    public String accept(VisitorRestaurante v) {
        return v.visitMesaVIP(this);
    }
}
