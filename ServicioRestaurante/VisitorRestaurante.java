package ServicioRestaurante;

public interface VisitorRestaurante {

    String visitMesaSimple(MesaSimple mesaSimple);
    String visitMesaVIP(MesaVIP mesaVIP);
}
