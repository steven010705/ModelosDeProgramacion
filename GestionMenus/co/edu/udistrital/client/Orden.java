/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.client;

import co.edu.udistrital.abstractProducts.Entrada;
import co.edu.udistrital.abstractProducts.PlatoPrincipal;
import co.edu.udistrital.abstractProducts.Postre;
import co.edu.udistrital.abstractProducts.Bebida;

/**
 *
 * @author bethods
 */
public class Orden {
    
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Bebida bebida;
    private Postre postre;

    public Orden(Entrada entrada, PlatoPrincipal platoPrincipal, Bebida bebida, Postre postre) {
        this.entrada = entrada;
        this.platoPrincipal = platoPrincipal;
        this.bebida = bebida;
        this.postre = postre;
    }

    public void mostrarOrden() {
        System.out.println("=== Orden del Cliente ===");
        System.out.println("Entrada: " + entrada.getDescripcion());
        System.out.println("Plato Principal: " + platoPrincipal.getDescripcion());
        System.out.println("Bebida: " + bebida.getDescripcion());
        System.out.println("Postre: " + postre.getDescripcion());
    }
    
}
