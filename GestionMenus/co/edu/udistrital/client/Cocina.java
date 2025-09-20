/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.client;

import co.edu.udistrital.client.Orden;
import co.edu.udistrital.abstractFactory.MenuFactory;
import co.edu.udistrital.abstractProducts.Entrada;
import co.edu.udistrital.abstractProducts.PlatoPrincipal;
import co.edu.udistrital.abstractProducts.Postre;
import co.edu.udistrital.abstractProducts.Bebida;

/**
 *
 * @author bethods
 */
public class Cocina {
    
    private MenuFactory menu;

    public Cocina(MenuFactory menu) {
        this.menu = menu;
    }

    public Orden prepararMenu() {
        Entrada entrada = menu.prepararEntrada();
        PlatoPrincipal plato = menu.prepararPlatoPrincipal();
        Bebida bebida = menu.prepararBebida();
        Postre postre = menu.prepararPostre();
        return new Orden(entrada, plato, bebida, postre);
    }
    
}
