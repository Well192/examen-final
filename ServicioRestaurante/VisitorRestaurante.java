package ServicioRestaurante;

public interface VisitorRestaurante {

    void visitMesaSimple(MesaSimple ms);
    void visitMesaVIP(MesaVIP mvip);
}
