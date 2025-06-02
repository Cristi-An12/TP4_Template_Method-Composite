package org.example;

import java.util.ArrayList;
import java.util.List;

public class compositeEmpleado implements EmpleadosComponent {
    private String nombreCargo;
    private List<EmpleadosComponent> empleadosACargo;
    private double salario;

    public compositeEmpleado (String nombreCargo, double salario) {
        this.nombreCargo = nombreCargo;
        this.salario = salario;
        this.empleadosACargo= new ArrayList<> ();
    }
    public void agregarEmpleado (EmpleadosComponent empleado) {
        empleadosACargo.add(empleado);
    }

    @Override
    public double TotalSalarial () {
        double total = salario;
        for (EmpleadosComponent e : empleadosACargo) {
            total += e.TotalSalarial ();
        }
        return total;
    }


}
