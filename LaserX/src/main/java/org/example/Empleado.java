package org.example;

public class Empleado implements EmpleadosComponent{
    private String  nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    @Override
    public double TotalSalarial() {
        return this.salario;
    }
}
