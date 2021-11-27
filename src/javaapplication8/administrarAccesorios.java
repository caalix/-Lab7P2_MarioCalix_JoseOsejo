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
public class administrarAccesorios {
    
    private ArrayList<Accesorios> listaAccesorios = new ArrayList();
    private File archivo = null;

    public administrarAccesorios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Accesorios> getListaAccesorios() {
        return listaAccesorios;
    }

    public void setListaAccesorios(ArrayList<Accesorios> listaAccesorios) {
        this.listaAccesorios = listaAccesorios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    

    @Override
    public String toString() {
        return "listaAccesorios=" + listaAccesorios;
    }

    //extra mutador
    public void setAccesorios(Accesorios p) {
        this.listaAccesorios.add(p);
    }

    //String id, String nombre, int precio, int cantidad
    
    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Accesorios t : listaAccesorios) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getCantidad() + ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaAccesorios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaAccesorios.add(new Accesorios(sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
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
