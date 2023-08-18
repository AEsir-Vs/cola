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
public class Persona extends Base {
    
    private String nombreP;

    /**
     * Get the value of nombreP
     *
     * @return the value of nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Set the value of nombreP
     *
     * @param nombreP new value of nombreP
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    private String correoP;

    /**
     * Get the value of correoP
     *
     * @return the value of correoP
     */
    public String getCorreoP() {
        return correoP;
    }

    /**
     * Set the value of correoP
     *
     * @param correoP new value of correoP
     */
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }

    private String numeroP;

    /**
     * Get the value of numeroP
     *
     * @return the value of numeroP
     */
    public String getNumeroP() {
        return numeroP;
    }

    /**
     * Set the value of numeroP
     *
     * @param numeroP new value of numeroP
     */
    public void setNumeroP(String numeroP) {
        this.numeroP = numeroP;
    }

    public Persona(String nombreP, String correoP, String numeroP) {
        this.nombreP = nombreP;
        this.correoP = correoP;
        this.numeroP = numeroP;
    }

    @Override
    public String toString() {
        return "Persona{" + nombreP + "," + correoP + "," + numeroP + '}';
    }

    @Override
    public Base copy() {
        return new Persona(nombreP, correoP, numeroP);
    }

}
