/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.client;

import co.edu.udistrital.concreteFactories.MenuSaludable;
import co.edu.udistrital.concreteFactories.MenuGourmet;
import co.edu.udistrital.concreteFactories.MenuVegetariano;
import java.util.Scanner;

/**
 *
 * @author bethods
 */
public class Restaurante {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.println("¿Qué desea ordenar?");
        System.out.println("1. Menú vegetariano");
        System.out.println("2. Menú gourmet");
        System.out.println("3. Menú saludable");
        
        String eleccion = sc.nextLine();
        System.out.println("\n");
        
        switch (eleccion){
            case "1": {
                // Cliente pide un menú vegetariano
                Cocina cocinaVegetariana = new Cocina(new MenuVegetariano());
                Orden ordenVegetariana = cocinaVegetariana.prepararMenu();
                ordenVegetariana.mostrarOrden();
            }
            break;
            
            case "2": {
                // Cliente pide un menú gourmet
                Cocina cocinaGourmet = new Cocina(new MenuGourmet());
                Orden ordenGourmet = cocinaGourmet.prepararMenu();
                ordenGourmet.mostrarOrden();
            }
            break;
            
            case "3": {
                // Cliente pide un menú saludable
                Cocina cocinaSaludable = new Cocina(new MenuSaludable());
                Orden ordenSaludable = cocinaSaludable.prepararMenu();
                ordenSaludable.mostrarOrden();
            }
            break;
        }
    }
}
