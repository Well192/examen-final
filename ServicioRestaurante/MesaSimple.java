package ServicioRestaurante;

import javax.swing.*;

public class MesaSimple extends Mesa implements  BeneficioRestaurante{

    public MesaSimple(String tipo, Float precio) {
        super(tipo, precio);
    }

    @Override
    void addReserva(DatosReservaMesa reserva) {
        super.reservas.add(reserva);
        System.out.println("se esta reservando una simple " + this.getType() + " para:\n " + reserva.toString());
        JOptionPane.showMessageDialog(null,
                "se esta reservando mesa simple " + this.getType() + " para:\n " + reserva.toString());
    }

    public String getType() {
        return tipo;
    }

    public PrototypeMesa clone(){
        return new MesaSimple(this.tipo,this.precio);
    }

    @Override
    public String accept(VisitorRestaurante v) {
       return v.visitMesaSimple(this);
    }
}
