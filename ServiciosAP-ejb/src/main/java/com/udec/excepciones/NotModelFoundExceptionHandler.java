/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.excepciones;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author David Arias
 */
@Provider
public class NotModelFoundExceptionHandler implements ExceptionMapper<NotModelFoundException> {

    @Override
    public Response toResponse(NotModelFoundException exception) {
        ErrorExceptionWrapper ex = new ErrorExceptionWrapper(exception.getMessage(), "");
        return Response.status(Response.Status.NOT_FOUND).entity(ex).build();
    }
    
}
