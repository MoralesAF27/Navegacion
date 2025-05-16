/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */

public abstract class PlanificadorTemplate {
    protected String origen;
    protected String destino;
    protected EstrategiaRuta estrategia;

    public PlanificadorTemplate(String origen, String destino, EstrategiaRuta estrategia) {
        this.origen = origen;
        this.destino = destino;
        this.estrategia = estrategia;
    }

    public final void planificarRuta() {
        prepararDatos();
        calcularRuta();
        mostrarRuta();
        iniciarNavegacion();
    }

    protected void prepararDatos() {
        System.out.println("Preparando datos de navegación...");
    }

    protected void calcularRuta() {
        estrategia.calcularRuta(origen, destino);
    }

    protected void mostrarRuta() {
        System.out.println("Mostrando ruta en el mapa...");
    }

    protected void iniciarNavegacion() {
        System.out.println("Iniciando navegación hacia el destino...");
    }
}

