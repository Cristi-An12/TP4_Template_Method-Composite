package org.example;

public class SeguroIndividual implements SeguroComponent{
    private String TipoSeguro;
    private double Costo;

    public SeguroIndividual (double costo, String tipoSeguro) {
        Costo = costo;
        TipoSeguro = tipoSeguro;
    }

    @Override
    public double calcularCosto () {
        return Costo;
    }
}
