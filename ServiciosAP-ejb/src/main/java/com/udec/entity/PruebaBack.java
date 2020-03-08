package com.udec.entity;


import com.udec.entity.Persona;
import com.udec.repository.ArchivoPlano;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PruebaBack {

    public void escribir(){
        ArrayList<Persona> b= new ArrayList();
        Persona nueva=new Persona("pedro", 1070926558);
        Persona nueva2=new Persona("juan", 107092);
        b=leer();
        b.add(nueva2);
        b.add(nueva);
        ArchivoPlano a= new ArchivoPlano();
        a.crearArchivo(b);
        System.out.println("creado");
    
    }
    
    public ArrayList<Persona> leer(){
  
        ArchivoPlano a= new ArchivoPlano();
        return a.leerArchivo();
        
    
    }
    public void eliminar(){
         ArrayList<Persona> b= new ArrayList();
         b=leer();
         for(Persona a:b){
             if(a.getCedula()==107092){
                 b.remove(a);
             }
         }
         ArchivoPlano a= new ArchivoPlano();
        a.crearArchivo(b);
        System.out.println("eliminado");
    }
    
    
    public static void main(String[] args) {
      PruebaBack a= new PruebaBack();
      //a.escribir();
      ArrayList<Persona> listado= new ArrayList();
        listado=a.leer();
        for(Persona m: listado){
          System.out.println(m.getNombre()+" "+m.getCedula());
      }
        System.out.println("holi");
      
     // a.eliminar();
      
    }
    
}
