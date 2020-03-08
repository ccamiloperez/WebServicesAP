/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.repository;

import com.udec.entity.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class ArchivoPlano {
    File archivo = new File("personas.txt");
    
    public void crearArchivo(Object listapersonas){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(listapersonas);
            System.out.println("Entro al metodo");
        } catch (Exception e) {
             e.getStackTrace();
        }
    }
    
    public ArrayList<Persona> leerArchivo(){
        ArrayList<Persona> lista= new ArrayList();
        try {
            archivo.getName();
            if(archivo.exists()){
            FileInputStream document = new FileInputStream(archivo);
            ObjectInputStream leer = new ObjectInputStream(document);
            lista=(ArrayList<Persona>)leer.readObject();
            return lista;
                
            }else{
                crearArchivo(lista);
                return lista;
            }
            
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    
    }
    
   
    
    
}
