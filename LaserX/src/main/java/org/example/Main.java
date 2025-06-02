package org.example;

public class Main {
    public static void main (String[] args) {
        Empleado e1 = new Empleado("Empleado 1", 1000);
        Empleado e2 = new Empleado("Empleado 2", 1000);

        LiderProyecto lider = new LiderProyecto(1500);
        lider.agregarEmpleado(e1);
        lider.agregarEmpleado(e2);

        MandosMedios mando = new MandosMedios(2000);
        mando.agregarEmpleado(lider);

        Gerente gerente = new Gerente(2500);
        gerente.agregarEmpleado(mando);

        Director director = new Director(3000);
        director.agregarEmpleado(gerente);

        System.out.println("Total salarial: $" + director.TotalSalarial ());

    }
}