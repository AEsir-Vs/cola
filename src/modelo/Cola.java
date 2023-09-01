/*
 *  @author esteban.vargas@uao.edu.co, Esteban Vargas Sanchez, Codigo 2221675
 *  @author emmanuel.carrera@uao.edu.co, Emmanuel Carrera Cardona, Codigo 2221577
 *  @author carlos_andres.garzon@uao.edu.co, Carlos Andres Garzon Guerrero, Codigo 2220968
 *  @author joan.salcedo@uao.edu.co, Joan Sebastian Salcedo Obando, Codigo 2220769
 *  @date 31 /Agosto/2023
 *  @version 1.0
 */
package modelo;

import java.util.LinkedList;

/*
 *
 * @author Esteban V 
 * @author Joan Salcedo 2220769 joan.salcedo@uao.edu.co
 * @author Carlos Garzon 2220968 carlos_andres.garzon@uao.edu.co
 * @author Emmanuel Carrera
 */
public class Cola <T extends Base>{
    LinkedList<T> elems;

    
    
    public Cola() {
        elems=new LinkedList<>();
    }
    
    
    
    public void encolar(T elemento){
        elems.addLast(elemento);
    }
    
    public T desenColar(){
        
        return elems.removeFirst();
    }
    
    public boolean estaVacia(){
        return elems.isEmpty(); //es verdadera cuando esta vacia
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{");
        for(T elemento : elems){
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
