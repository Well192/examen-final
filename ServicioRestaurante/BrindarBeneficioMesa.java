package ServicioRestaurante;

public class BrindarBeneficioMesa implements VisitorRestaurante{

    @Override
    public String visitMesaSimple(MesaSimple mesaSimple) {
        return "Entrada gratis";
    }

    @Override
    public String visitMesaVIP(MesaVIP mesaVIP) {
        return "Postres gratis con entrada";
    }
}
