package tests;

import ServicioEstacionamiento.BrindarBeneficioEstacionamiento;
import ServicioEstacionamiento.EspacioEstacionamiento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrindarBeneficioEstacionamientoTest {

    BrindarBeneficioEstacionamiento bbe = new BrindarBeneficioEstacionamiento();

    @Test
    void visitEspacioEstacionamiento() {

        EspacioEstacionamiento ee = new EspacioEstacionamiento("8",1200f);
        System.out.println(ee.accept(bbe));

        assertEquals("se otorga un descuento del 10% por alquilar más de 5hrs el estacionamiento",ee.accept(bbe));

    }
}