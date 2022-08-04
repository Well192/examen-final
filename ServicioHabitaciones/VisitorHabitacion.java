package ServicioHabitaciones;

public interface VisitorHabitacion{

    String visitEconomic(HabitacionEconomica habitacionEconomica);
    String visitNormal(HabitacionNormal habitacionNormal);
    String visitPremium(HabitacionPremium habitacionPremium);
    String visitFamiliar(HabitacionFamiliar habitacionFamiliar);
}
