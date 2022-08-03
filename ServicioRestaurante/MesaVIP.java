package ServicioRestaurante;

public class MesaVIP extends Mesa implements BeneficioRestaurante{
    public MesaVIP(String tipo, Float precio) {
        super(tipo, precio);
    }

    @Override
    public PrototypeMesa clone() {
        return new MesaVIP(this.tipo, this.precio);
    }

    @Override
    public void accept(VisitorRestaurante v) {
        v.visitMesaVIP(this);
    }
}
