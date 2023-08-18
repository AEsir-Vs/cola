/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Cola;
import datos.Persona;

/**
 *
 * @author Esteban V
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Persona> colaPersonas=new Cola<>();
        
        colaPersonas.encolar(new Persona("David", "david@uao", "222"));
        colaPersonas.encolar(new Persona("Davod", "davod@uao", "223"));
        colaPersonas.encolar(new Persona("Daved", "daved@uao", "224"));
        colaPersonas.encolar(new Persona("Davud", "davud@uao", "225"));
        colaPersonas.encolar(new Persona("Juan", "juan@uao", "333"));
        
        System.out.println("El contenido de la cola es "+ colaPersonas.toString());
        
        colaPersonas.desencolar();
        
        System.out.println("El contenido de la cola es "+ colaPersonas.toString());
    }
    
}
