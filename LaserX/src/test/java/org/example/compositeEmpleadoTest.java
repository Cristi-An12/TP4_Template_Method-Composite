package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class compositeEmpleadoTest {
    @Test
    public void testSalarioTotalSimple() {
        Empleado e1 = new Empleado("Empleado", 1000);
        assertEquals(1000, e1.TotalSalarial (), 0.01);
    }

    @Test
    public void testSalarioJerarquico() {
        Empleado e1 = new Empleado("Empleado", 1000);
        LiderProyecto lider = new LiderProyecto(1500);
        lider.agregarEmpleado(e1);
        assertEquals(2500, lider.TotalSalarial (), 0.01);
    }
}