/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Cola;
import datos.Vehiculo;

/**
 *
 * @author Esteban V
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cola<Vehiculo> colaVehiculo = new Cola<>();
        colaVehiculo.encolar(new Vehiculo("tvs", "Joan", 0));
        colaVehiculo.encolar(new Vehiculo("suzuki", "Marco", 0));
        colaVehiculo.encolar(new Vehiculo("Nissan", "Aristides", 0));
        Cola<Vehiculo> colaDuplicada= modelo.OperacionesCola.duplicarCola(colaVehiculo);
        colaVehiculo.desenColar();
       
        System.out.println("Cola original "+colaVehiculo);
        System.out.println("Cola duplicada "+colaDuplicada);
    }
    
}
