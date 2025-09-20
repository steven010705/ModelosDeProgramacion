/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.abstractFactory;

import co.edu.udistrital.abstractProducts.Bebida;
import co.edu.udistrital.abstractProducts.Entrada;
import co.edu.udistrital.abstractProducts.PlatoPrincipal;
import co.edu.udistrital.abstractProducts.Postre;

/**
 *
 * @author bethods
 */
public interface MenuFactory {
    Entrada prepararEntrada();
    PlatoPrincipal prepararPlatoPrincipal();
    Bebida prepararBebida();
    Postre prepararPostre();
}
