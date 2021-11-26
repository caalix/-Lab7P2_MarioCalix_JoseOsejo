/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class UsuarioComprador extends Usuarios
{
private ArrayList<Accesorios>accesorios; 
private int cantidadDinero;

    public UsuarioComprador(int cantidadDinero, String usuario, String contrasena, String edad) {
        super(usuario, contrasena, edad);
        this.cantidadDinero = cantidadDinero;
    }

    public ArrayList<Accesorios> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<Accesorios> accesorios) {
        this.accesorios = accesorios;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    @Override
    public String toString() {
        return "UsuarioComprador{" + "accesorios=" + accesorios + ", cantidadDinero=" + cantidadDinero + '}';
    }

    

}
