package ServicioEstacionamiento;

public class BrindarBeneficioEstacionamiento implements VisitorEstacionamiento{

    @Override
    public String visitEspacioEstacionamiento(EspacioEstacionamiento ee) {
        return "se otorga un descuento del 10% por alquilar más de 5hrs el estacionamiento";
    }
}
