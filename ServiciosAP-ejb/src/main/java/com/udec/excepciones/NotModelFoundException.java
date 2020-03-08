/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.excepciones;

/**
 *
 * @author David Arias
 */
public class NotModelFoundException extends RuntimeException{
    
    public NotModelFoundException(String mensaje){
        super(mensaje);
    }
    
}
