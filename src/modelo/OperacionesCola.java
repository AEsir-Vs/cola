/*
 *  @author esteban.vargas@uao.edu.co, Esteban Vargas Sanchez, Codigo 2221675
 *  @author emmanuel.carrera@uao.edu.co, Emmanuel Carrera Cardona, Codigo 2221577
 *  @author carlos_andres.garzon@uao.edu.co, Carlos Andres Garzon Guerrero, Codigo 2220968
 *  @author joan.salcedo@uao.edu.co, Joan Sebastian Salcedo Obando, Codigo 2220769
 *  @date 31 /Agosto/2023
 *  @version 1.0
 */
package modelo;


/**
 *
 * @author Esteban V 
 * @author Joan Salcedo 2220769 joan.salcedo@uao.edu.co
 * @author Carlos Garzon 2220968 carlos_andres.garzon@uao.edu.co
 * @author Emmanuel Carrera
 */
public class OperacionesCola <T extends Base> {
    
    public static <T extends Base> Cola<T> duplicarCola(Cola<T> C01){
        Cola<T> colaAux=new Cola<>();
        Cola<T> colaDuplicada=new Cola<>();
        
        while (!C01.estaVacia()){
            
            T elemento = C01.desenColar();
            colaAux.encolar(elemento);
            
        }
        
        while (!colaAux.estaVacia()){
            
            T elemento = colaAux.desenColar();
            T elementoCopiado = (T) elemento.copy();
            
            C01.encolar(elemento);
            colaDuplicada.encolar(elementoCopiado);
            
        }
        
        return colaDuplicada;
    }

    
}
