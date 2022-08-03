package tests;

import ServicioRestaurante.BrindarBeneficioMesa;
import ServicioRestaurante.MesaSimple;
import ServicioRestaurante.MesaVIP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrindarBeneficioMesaTest {

    BrindarBeneficioMesa bbm = new BrindarBeneficioMesa();
    @Test
    void visitMesaSimple() {
        MesaSimple ms = new MesaSimple("simple",50.0f);
        System.out.println(ms.accept(bbm));
        assertEquals("Entrada gratis",ms.accept(bbm));
    }

    @Test
    void visitMesaVIP() {
        MesaVIP mvip = new MesaVIP("vip",550.5f);
        System.out.println(mvip.accept(bbm));
        assertEquals("Postres gratis con entrada",mvip.accept(bbm));
    }
}