/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.entity;

import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ASUS-PC
 */
    public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    @Size(min = 3, max = 10, message = "Minimo 3 caracteres y maximo 10")
    @NotNull
    private String nombre;
    
    @Min(value = 99999,  message = "La cédula debe ser mayor a 99999")
    private int cedula;
    
    

    public Persona(){
    
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
