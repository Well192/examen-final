package ServicioRestaurante;

public class MesaVIP extends Mesa implements BeneficioRestaurante{
    public MesaVIP(String tipo, Float precio) {
        super(tipo, precio);
    }
    public String getType() {
        return tipo;
    }

    @Override
    public void accept(VisitorRestaurante v) {
        v.visitMesaVIP(this);
    }
}
