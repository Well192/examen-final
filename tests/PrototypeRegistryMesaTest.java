package tests;

import ServicioHabitaciones.HabitacionEconomica;
import ServicioRestaurante.MesaSimple;
import ServicioRestaurante.PrototypeRegistryMesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeRegistryMesaTest {
    PrototypeRegistryMesa mesas = new PrototypeRegistryMesa();
    @Test
    void get() {
        assertNotNull(mesas.get("grande"));
    }

    @Test
    void addElement() {
        mesas.addElement("pequena", (new MesaSimple("simple",100F)));
        assertEquals("simple", mesas.get("pequena").getTipo());
    }
}