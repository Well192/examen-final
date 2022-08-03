package ServicioHabitaciones;

public interface VisitorHabitacion{

    String visitEconomic(HabitacionEconomica he);
    String visitNormal(HabitacionNormal hn);
    String visitPremium(HabitacionPremium hp);
    String visitFamiliar(HabitacionFamiliar hf);
}
