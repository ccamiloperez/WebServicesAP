/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.service;

import com.udec.entity.Persona;
import com.udec.interfaces.IPersona;
import com.udec.repository.ArchivoPlano;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class PersonaService implements IPersona{
    ArchivoPlano archivo= new ArchivoPlano();
    ArrayList<Persona> listado;
    
    @Override
    public String nombre() {
       return "hola mundo";
    }
    
    @Override
    public List<Persona> listaPersonas() {
        List<Persona> per;
        per=archivo.leerArchivo();
        return per;
    }
    
     @Override
    public void guardarPersona(Persona persona) {
        listado=archivo.leerArchivo();
        listado.add(persona);
        archivo.crearArchivo(listado);
        
    }

    @Override
    public Persona obtenerPersona(int cedula) {
        listado=archivo.leerArchivo();
        for(Persona per: listado){
            if(per.getCedula()==cedula){
                return per;
            }
        }
        return new Persona();
    }

    @Override
    public void eliminarPersona(int cedula) {
        try{
            listado=archivo.leerArchivo();
            for(Persona per: listado){
             if(per.getCedula()==cedula){
                listado.remove(per); 
             }
         }
        }catch(Exception e){
            archivo.crearArchivo(listado);
            System.out.println("Eliminado");
         }
    }

    @Override
    public void editarPersona(int cedula, Persona persona) {
        listado=archivo.leerArchivo();
        for(Persona per: listado){
            if(per.getCedula()==cedula){
                per.setCedula(persona.getCedula());
                per.setNombre(persona.getNombre());
            }
        }
         archivo.crearArchivo(listado);
        
    }

   

}
