package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        SeguroComponent hogar = new SeguroIndividual( 1000, "Hogar");
        SeguroComponent auto = new SeguroIndividual(2000, "Automóvil");
        SeguroComponent vida = new SeguroIndividual(3000, "Vida");

        PaqueteSeguros paqueteBasico = new PaqueteSeguros("Paquete Básico");
        paqueteBasico.agregar(hogar);
        paqueteBasico.agregar(auto);

        PaqueteSeguros paquetePremium = new PaqueteSeguros("Paquete Premium");
        paquetePremium.agregar(paqueteBasico);
        paquetePremium.agregar(vida);

        System.out.println("Costo del paquete básico: $" + paqueteBasico.calcularCosto());
        System.out.println("Costo del paquete premium: $" + paquetePremium.calcularCosto());

    }
}