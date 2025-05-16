/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */

public class RutaCarretera implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println(" Calculando ruta desde " + origen + " hasta " + destino + " para recorrer por carretera");
    }
}

