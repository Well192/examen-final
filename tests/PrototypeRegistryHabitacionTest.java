package tests;

import ServicioEstacionamiento.EspacioEstacionamiento;
import ServicioEstacionamiento.PrototypeRegistryEstacionamiento;
import ServicioHabitaciones.HabitacionEconomica;
import ServicioHabitaciones.PrototypeRegistryHabitacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeRegistryHabitacionTest {
    PrototypeRegistryHabitacion habitaciones = new PrototypeRegistryHabitacion();

    @Test
    void get() {
        assertNotNull(habitaciones.get("Familiar"));
    }

    @Test
    void addElement() {
        habitaciones.addElement("Economica", (new HabitacionEconomica(200.0F)));
        assertEquals("economica", habitaciones.get("Economica").getType());
    }
}