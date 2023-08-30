/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
