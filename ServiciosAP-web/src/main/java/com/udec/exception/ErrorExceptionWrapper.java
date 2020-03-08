/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.exception;

import java.util.Calendar;

/**
 *
 * @author ASUS-PC
 */

public class ErrorExceptionWrapper {
    
    private String error;
    
    private String descripcion;
    
    private Calendar fecha;
    
    private StackTraceElement[] tracer;

    public ErrorExceptionWrapper(String error, String descripcion, Calendar fecha, StackTraceElement[] tracer) {
        this.error = error;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tracer = tracer;
    }

    

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public StackTraceElement[] getTracer() {
        return tracer;
    }

    public void setTracer(StackTraceElement[] tracer) {
        this.tracer = tracer;
    }
    
    
    
    
    
}
