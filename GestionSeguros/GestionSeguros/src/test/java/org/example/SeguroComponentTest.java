package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeguroComponentTest {

    @Test
    public void testSeguroIndividual () {
        SeguroIndividual vida = new SeguroIndividual(3000, "Vida");
        assertEquals(3000, vida.calcularCosto(), 01);
    }

    @Test
    public void testPaqueteConDescuento() {
        SeguroIndividual auto = new SeguroIndividual(2000, "Auto");
        SeguroIndividual hogar = new SeguroIndividual(1000, "Hogar");
        PaqueteSeguros paquete = new PaqueteSeguros("Combo");
        paquete.agregar(auto);
        paquete.agregar(hogar);
        assertEquals(2700, paquete.calcularCosto(), 0.01);  // 10% descuento
    }

}