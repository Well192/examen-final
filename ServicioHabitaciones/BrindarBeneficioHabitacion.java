package ServicioHabitaciones;
public class BrindarBeneficioHabitacion implements VisitorHabitacion {

    @Override
    public String visitEconomic(HabitacionEconomica he) {
        return "No tiene beneficios";
    }
    @Override
    public String visitNormal(HabitacionNormal hn) {
        return "Tendrá servicio a habitacion gratis un dia";
    }
    @Override
    public String visitPremium(HabitacionPremium hp) {
        return "Tendrá servicio a habitación gratis cinco días";
    }
    @Override
    public String visitFamiliar(HabitacionFamiliar hf) {
        return "Tendrá servicio a habitación gratis tres días";
    }
}
