/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class administrarUsuarios {
    
    private ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo = null;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuarios> listaCelulares) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    

    @Override
    public String toString() {
        return "ListaUsuarios=" + listaUsuarios;
    }

    //extra mutador
    public void setUsuarios(Usuarios p) {
        this.listaUsuarios.add(p);
    }

    //String usuario, String contrasena, String edad
    
    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaUsuarios) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContrasena() + ";");
                bw.write(t.getEdad() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsuarios.add(new Usuarios(sc.next(),
                                    sc.next(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
        
    }
    
    
    
}
