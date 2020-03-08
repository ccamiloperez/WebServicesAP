/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.exception;

import java.util.Date;

/**
 *
 * @author ASUS-PC
 */

public class ErrorExceptionWrapper {
    
    private String error;
    
    private String descripcion;
    
    private Date fecha;
    
    private StackTraceElement[] tracer;

    public ErrorExceptionWrapper(String error, String descripcion, Date fecha, StackTraceElement[] tracer) {
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

    public StackTraceElement[] getTracer() {
        return tracer;
    }

    public void setTracer(StackTraceElement[] tracer) {
        this.tracer = tracer;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
