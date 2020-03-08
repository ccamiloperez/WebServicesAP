/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.exception;

import java.util.Calendar;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author ASUS-PC
 */
@Provider
public class ConstraintViolationHandler implements ExceptionMapper<ConstraintViolationException>{


    @Override
    public Response toResponse(ConstraintViolationException ex) {
        ErrorExceptionWrapper api = new ErrorExceptionWrapper((ex.getMessage() !=null)? ex.getMessage():"ConstraintViolationException " , 
                prepareMessage(ex),Calendar.getInstance(),ex.getStackTrace());
        return Response.status(Response.Status.BAD_REQUEST).entity(api).build();
    }
    
     private String prepareMessage(ConstraintViolationException exception) {
        String msg = "";
        for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
            msg+=cv.getPropertyPath()+" "+cv.getMessage()+"\n";
        }
        return msg;
    }    
    
}