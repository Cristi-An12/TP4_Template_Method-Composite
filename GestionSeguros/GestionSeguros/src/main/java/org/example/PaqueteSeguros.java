package org.example;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros implements SeguroComponent{
    public static final double CINCODESCUENTO = 0.05;
    private String Descripcion;
    private List<SeguroComponent> seguros;

    public PaqueteSeguros (String descripcion) {
        Descripcion = descripcion;
        seguros = new ArrayList<> ();
    }

    public void agregar (SeguroComponent seguro) {
        seguros.add (seguro);
    }


    @Override
    public double calcularCosto () {
        double costoTotal=0;
        int cantidad =0;
        for (SeguroComponent seguro : seguros) {
            costoTotal += seguro.calcularCosto ();
            cantidad++;
        }
        double descuento= cantidad * CINCODESCUENTO; // 5% de descuento por cada seguro
        return costoTotal* (1 - descuento); // Aplicar descuento al costo total
    }
}
