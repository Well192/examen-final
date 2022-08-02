public interface Visitor {

    void visitEconomic(HabitacionEconomica he);
    void visitNormal(HabitacionNormal hn);
    void visitPremium(HabitacionPremium hp);
    void visitFamiliar(HabitacionFamiliar hf);
}
