package org.example;


public class Tarea implements ProyectoItem{
    private String Comentario;
    private int tiempo;

    public Tarea(String comentario, int tiempoEstimado) {
        this.Comentario = comentario;
        this.tiempo = tiempoEstimado;
    }

    @Override
    public int tiempoEstimado () {
        return tiempo;
    }
}
