/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.interfaces;

import com.udec.entity.Persona;
import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author ASUS
 */
@Local
public interface IPersona {
   public String nombre();
   public List<Persona> listaPersonas();
   public Persona obtenerPersona(int cedula);
   public void guardarPersona(Persona persona);
   public void editarPersona(int cedula, Persona persona);
   public void eliminarPersona(int cedula);
   
   
   
}
