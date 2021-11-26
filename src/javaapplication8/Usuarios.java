/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author mario
 */
public class Usuarios {
    private String usuario, contrasena, edad;

    public Usuarios() {
    }

    public Usuarios(String usuario, String contrasena, String edad) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", edad=" + edad + '}';
    }
    
    
    
}
