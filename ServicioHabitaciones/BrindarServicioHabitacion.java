package ServicioHabitaciones;

public class BrindarServicioHabitacion implements VisitorHabitacion {

    @Override
    public void visitEconomic(HabitacionEconomica he) {
        System.out.println("este es un servicio economico");
    }

    @Override
    public void visitNormal(HabitacionNormal hn) {
        System.out.println("este es un servicio normal");
    }

    @Override
    public void visitPremium(HabitacionPremium hp) {
        System.out.println("este es un servicio premium");
    }

    @Override
    public void visitFamiliar(HabitacionFamiliar hf) {
        System.out.println("este es un servicio familiar");
    }

}
