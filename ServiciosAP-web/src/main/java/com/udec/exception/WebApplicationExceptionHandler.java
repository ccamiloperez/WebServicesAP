/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.exception;

import java.util.Calendar;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author ASUS-PC
 */
@Provider
public class WebApplicationExceptionHandler implements ExceptionMapper<WebApplicationException>{

    @Override
    public Response toResponse(WebApplicationException ex) {      
        ErrorExceptionWrapper api = new ErrorExceptionWrapper( (ex.getMessage() !=null)? ex.getMessage():" WebApplicationException",
                "Error no encontro",Calendar.getInstance().getTime().toString(),ex.getCause().getStackTrace());
        return Response.status(Response.Status.NOT_FOUND).entity(api).build();        
    }
    
}
   