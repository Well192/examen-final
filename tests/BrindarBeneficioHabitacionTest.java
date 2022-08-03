package tests;

import ServicioHabitaciones.*;

import static org.junit.jupiter.api.Assertions.*;

class BrindarBeneficioHabitacionTest {
    BrindarBeneficioHabitacion bbf = new BrindarBeneficioHabitacion();

    @org.junit.jupiter.api.Test
    void visitEconomic() {

        HabitacionEconomica he = new HabitacionEconomica(250f);
        System.out.println(he.accept(bbf));
        assertEquals("No tiene beneficios",he.accept(bbf));

    }

    @org.junit.jupiter.api.Test
    void visitNormal() {

        HabitacionNormal hn = new HabitacionNormal(300f);
        System.out.println(hn.accept(bbf));
        assertEquals("Tendrá servicio a habitacion gratis un dia",hn.accept(bbf));

    }

    @org.junit.jupiter.api.Test
    void visitPremium() {

        HabitacionPremium hp = new HabitacionPremium(1550f);
        System.out.println(hp.accept(bbf));
        assertEquals("Tendrá servicio a habitación gratis cinco días",hp.accept(bbf));

    }

    @org.junit.jupiter.api.Test
    void visitFamiliar() {

        HabitacionFamiliar hf = new HabitacionFamiliar(800f);
        System.out.println(hf.accept(bbf));
        assertEquals("Tendrá servicio a habitación gratis tres días",hf.accept(bbf));

    }

}