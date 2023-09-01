/*
 *  @author esteban.vargas@uao.edu.co, Esteban Vargas Sanchez, Codigo 2221675
 *  @author emmanuel.carrera@uao.edu.co, Emmanuel Carrera Cardona, Codigo 2221577
 *  @author carlos_andres.garzon@uao.edu.co, Carlos Andres Garzon Guerrero, Codigo 2220968
 *  @author joan.salcedo@uao.edu.co, Joan Sebastian Salcedo Obando, Codigo 2220769
 *  @date 31 /Agosto/2023
 *  @version 1.0
 */
package vista;
import modelo.Cola;
import datos.Vehiculo;

/**
 *
 * @author Esteban V 
 * @author Joan Salcedo 2220769 joan.salcedo@uao.edu.co
 * @author Carlos Garzon 2220968 carlos_andres.garzon@uao.edu.co
 * @author Emmanuel Carrera
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
