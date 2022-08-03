package ServicioEstacionamiento;

public class BrindarBeneficioEstacionamiento implements VisitorEstacionamiento{

    @Override
    public void visitEspacioEstacionamiento(EspacioEstacionamiento ee) {
        System.out.println("se otorga un descuento del 10% por alquilar más de 5hrs el estacionamiento");
    }
}
