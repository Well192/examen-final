public abstract class Habitacion implements Prototype{
    int numero;
    float precio;
    boolean esOcupado = false;
    String type;

    public void setEsOcupado(boolean esOcupado) {
        this.esOcupado = esOcupado;
    }

    public Habitacion(float precio) {
        this.precio = precio;
    }

    public abstract Habitacion clone();

}
