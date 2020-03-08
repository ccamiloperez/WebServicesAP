/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.exception;

import java.util.Calendar;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author ASUS
 */
@Provider
public class NotFoundExceptionHandler implements ExceptionMapper<NotFoundException>{

    @Override
    public Response toResponse(NotFoundException exception) {
         ErrorExceptionWrapper ex = new ErrorExceptionWrapper((exception.toString()!=null) ? exception.getMessage():"NotFoundException", 
            (exception.getCause().getMessage()!=null)? exception.getMessage():"No encontrado",
                 Calendar.getInstance().getTime(),exception.getStackTrace());
        return Response.status(Response.Status.NOT_FOUND).entity(ex).build();
    }
    
}
