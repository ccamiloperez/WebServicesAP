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
public class ExceptionHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception ex) {
        ErrorExceptionWrapper api = new ErrorExceptionWrapper(ex.getMessage(),
                "");
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(api).build();
    }

}
