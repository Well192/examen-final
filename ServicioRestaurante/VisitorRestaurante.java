package ServicioRestaurante;

public interface VisitorRestaurante {

    String visitMesaSimple(MesaSimple ms);
    String visitMesaVIP(MesaVIP mvip);
}
