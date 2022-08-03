package ServicioRestaurante;

public class BrindarBeneficioMesa implements VisitorRestaurante{

    @Override
    public void visitMesaSimple(MesaSimple ms) {
        System.out.println("Entrada gratis");
    }

    @Override
    public void visitMesaVIP(MesaVIP mvip) {
        System.out.println("Postres gratis con entrada");
    }
}
