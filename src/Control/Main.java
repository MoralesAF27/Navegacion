/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author andre
 */ 

import Modelo.*;

public class Main {
    public static void main(String[] args) {
        EstrategiaRuta carretera = new RutaCarretera();
        EstrategiaRuta aPie = new RutaAPie();
        EstrategiaRuta publico = new RutaTransportePublico();

        PlanificadorTemplate planificador;

        System.out.println("Ruta en Carretera");
        planificador = new PlanificadorConcreto("Bogotá", "Medellín", carretera);
        planificador.planificarRuta();

        System.out.println("\nRuta a Pie");
        planificador = new PlanificadorConcreto("Parque", "Biblioteca", aPie);
        planificador.planificarRuta();

        System.out.println("\nRuta en Transporte Público");
        planificador = new PlanificadorConcreto("Estación Norte", "Universidad", publico);
        planificador.planificarRuta();
    }
}

