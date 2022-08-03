package ServicioRestaurante;

public class MesaSimple extends Mesa implements  BeneficioRestaurante{

    public MesaSimple(String tipo, Float precio) {
        super(tipo, precio);
    }
    public String getType() {
        return tipo;
    }

    public Mesa clone(){
        return new Mesa(this.tipo,this.precio);
    }


    @Override
    public void accept(VisitorRestaurante v) {
        v.visitMesaSimple(this);
    }
}
