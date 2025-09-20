/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.concreteFactories;

import co.edu.udistrital.abstractFactory.MenuFactory;
import co.edu.udistrital.abstractProducts.Entrada;
import co.edu.udistrital.abstractProducts.PlatoPrincipal;
import co.edu.udistrital.abstractProducts.Postre;
import co.edu.udistrital.abstractProducts.Bebida;

import co.edu.udistrital.concreteProducts.EntradaVegetariana;
import co.edu.udistrital.concreteProducts.PlatoPrincipalVegetariano;
import co.edu.udistrital.concreteProducts.PostreVegetariano;
import co.edu.udistrital.concreteProducts.BebidaVegetariana;

/**
 *
 * @author bethods
 */
public class MenuVegetariano implements MenuFactory {
    
    @Override
    public Entrada prepararEntrada() {
        return new EntradaVegetariana();
    }
    @Override
    public PlatoPrincipal prepararPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }
    @Override
    public Bebida prepararBebida() {
        return new BebidaVegetariana();
    }
    @Override
    public Postre prepararPostre() {
        return new PostreVegetariano();
    }
    
}
