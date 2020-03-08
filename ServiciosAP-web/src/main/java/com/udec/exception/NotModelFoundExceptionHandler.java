/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.exception;

import java.util.Calendar;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author ASUS-PC
 */
@Provider
public class NotModelFoundExceptionHandler implements ExceptionMapper<NotModelFoundException> {

    @Override
    public Response toResponse(NotModelFoundException exe) {
        ErrorExceptionWrapper ex = new ErrorExceptionWrapper((exe.toString()!=null) ? exe.getMessage():"NotModelFoundException", 
            (exe.getCause().getMessage()!=null)? exe.getMessage():"No encontrado",
                Calendar.getInstance().getTime().toString(),
                exe.getStackTrace());
        return Response.status(Response.Status.NOT_FOUND).entity(ex).build();
    }
    
}
