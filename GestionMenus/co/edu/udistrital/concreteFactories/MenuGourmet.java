/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.concreteFactories;

import co.edu.udistrital.abstractFactory.MenuFactory;
import co.edu.udistrital.abstractProducts.Entrada;
import co.edu.udistrital.abstractProducts.PlatoPrincipal;
import co.edu.udistrital.abstractProducts.Bebida;
import co.edu.udistrital.abstractProducts.Postre;

import co.edu.udistrital.concreteProducts.EntradaGourmet;
import co.edu.udistrital.concreteProducts.PlatoPrincipalGourmet;
import co.edu.udistrital.concreteProducts.PostreGourmet;
import co.edu.udistrital.concreteProducts.BebidaGourmet;

/**
 *
 * @author bethods
 */
public class MenuGourmet implements MenuFactory {
    
    @Override
    public Entrada prepararEntrada() {
        return new EntradaGourmet(); 
    }
    @Override
    public PlatoPrincipal prepararPlatoPrincipal() {
        return new PlatoPrincipalGourmet();
    }
    @Override
    public Bebida prepararBebida() {
        return new BebidaGourmet();
    }
    @Override
    public Postre prepararPostre() {
        return new PostreGourmet();
    }
    
}
