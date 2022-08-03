package ServicioRestaurante;

public class BrindarBeneficioMesa implements VisitorRestaurante{

    @Override
    public String visitMesaSimple(MesaSimple ms) {
        return "Entrada gratis";
    }

    @Override
    public String visitMesaVIP(MesaVIP mvip) {
        return "Postres gratis con entrada";
    }
}
