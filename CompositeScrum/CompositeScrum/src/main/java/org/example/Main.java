package org.example;

public class Main {
    public static void main(String[] args) {
        Tarea t1 = new Tarea("Implementar login", 8);
        Tarea t2 = new Tarea("Crear servicio", 16);
        Spike s1 = new Spike("Investigar", 4);

        HistoriaUsuario historiaLogin = new HistoriaUsuario("Historia: Login");
        historiaLogin.agregarItem (s1);
        historiaLogin.agregarItem (t1);

        HistoriaUsuario historiaApi = new HistoriaUsuario("Historia: API");
        historiaApi.agregarItem (t2);

        ProyectoRoot proyecto = new ProyectoRoot ("Proyecto SCRUM X");
        proyecto.agregarItem(historiaLogin);
        proyecto.agregarItem(historiaApi);

        System.out.println("Tiempo total proyecto: " + proyecto.tiempoEstimado() + "h");

    }
}
