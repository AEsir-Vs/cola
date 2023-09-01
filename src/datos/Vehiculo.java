/*
 *  @author esteban.vargas@uao.edu.co, Esteban Vargas Sanchez, Codigo 2221675
 *  @author emmanuel.carrera@uao.edu.co, Emmanuel Carrera Cardona, Codigo 2221577
 *  @author carlos_andres.garzon@uao.edu.co, Carlos Andres Garzon Guerrero, Codigo 2220968
 *  @author joan.salcedo@uao.edu.co, Joan Sebastian Salcedo Obando, Codigo 2220769
 *  @date 31 /Agosto/2023
 *  @version 1.0
 */
package datos;

import modelo.Base;

/**
 *
 * @author Esteban V 
 * @author Joan Salcedo 2220769 joan.salcedo@uao.edu.co
 * @author Carlos Garzon 2220968 carlos_andres.garzon@uao.edu.co
 * @author Emmanuel Carrera
 */
public class Vehiculo extends Base {
    
    private String modelo;
    private String nombreDuenoV;
    private int tiempoEspera;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String nombreDuenoV, int tiempoEspera) {
        this.modelo = modelo;
        this.nombreDuenoV = nombreDuenoV;
        this.tiempoEspera = tiempoEspera;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombreDuenoV() {
        return nombreDuenoV;
    }

    public void setNombreDuenoV(String nombreDuenoV) {
        this.nombreDuenoV = nombreDuenoV;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public String toString() {
        return  modelo + "," + nombreDuenoV + "," + tiempoEspera ;
    }

    @Override
    public Base copy() {
        return new Vehiculo(modelo, nombreDuenoV, tiempoEspera);
    }

}
