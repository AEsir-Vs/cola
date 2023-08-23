/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author Esteban V
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
