package tests;

import ServicioEstacionamiento.EspacioEstacionamiento;
import ServicioEstacionamiento.PrototypeEstacionamiento;
import ServicioEstacionamiento.PrototypeRegistryEstacionamiento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeRegistryEstacionamientoTest {
    PrototypeRegistryEstacionamiento estacionamiento = new PrototypeRegistryEstacionamiento();
    @Test
    void get() {
        assertNotNull(estacionamiento.get("grande"));
    }

    @Test
    void addElement() {
        estacionamiento.addElement("normal", (new EspacioEstacionamiento("mediano",200.0F)));
        assertEquals("mediano", estacionamiento.get("normal").tamano());
    }
}