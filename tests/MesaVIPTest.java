package tests;

import ServicioHabitaciones.DatosReservaHabitacion;
import ServicioHabitaciones.HabitacionPremium;
import ServicioHabitaciones.PrototypeRegistryHabitacion;
import ServicioRestaurante.DatosReservaMesa;
import ServicioRestaurante.MesaVIP;
import ServicioRestaurante.PrototypeRegistryMesa;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MesaVIPTest {
    MesaVIP mesavip = new MesaVIP("vip", 200F);
    @Test
    void testClone() {
        assertNotNull(mesavip.clone());
    }
}