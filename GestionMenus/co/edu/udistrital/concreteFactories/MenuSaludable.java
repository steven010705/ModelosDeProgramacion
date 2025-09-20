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

import co.edu.udistrital.concreteProducts.EntradaSaludable;
import co.edu.udistrital.concreteProducts.PlatoPrincipalSaludable;
import co.edu.udistrital.concreteProducts.PostreSaludable;
import co.edu.udistrital.concreteProducts.BebidaSaludable;

/**
 *
 * @author bethods
 */
public class MenuSaludable implements MenuFactory {
    
    @Override
    public Entrada prepararEntrada() {
        return new EntradaSaludable();
    }
    @Override
    public PlatoPrincipal prepararPlatoPrincipal() {
        return new PlatoPrincipalSaludable();
    }
    @Override
    public Bebida prepararBebida() {
        return new BebidaSaludable();
    }
    @Override
    public Postre prepararPostre() {
        return new PostreSaludable();
    }
}
