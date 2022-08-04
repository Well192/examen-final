package ServicioHabitaciones;
public class BrindarBeneficioHabitacion implements VisitorHabitacion {

    @Override
    public String visitEconomic(HabitacionEconomica habitacionEconomica) {
        return "No tiene beneficios";
    }
    @Override
    public String visitNormal(HabitacionNormal habitacionNormal) {
        return "Tendrá servicio a habitacion gratis un dia";
    }
    @Override
    public String visitPremium(HabitacionPremium habitacionPremium) {
        return "Tendrá servicio a habitación gratis cinco días";
    }
    @Override
    public String visitFamiliar(HabitacionFamiliar habitacionFamiliar) {
        return "Tendrá servicio a habitación gratis tres días";
    }
}
