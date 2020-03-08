/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.excepciones;

import javax.ws.rs.NotAllowedException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author David Arias
 */
@Provider
public class NotAllowedExceptionHandler implements ExceptionMapper<NotAllowedException> {

    @Override
    public Response toResponse(NotAllowedException exception) {
        ErrorExceptionWrapper api = new ErrorExceptionWrapper("error NotAllowedException",
                "error NotAllowedException");
        return Response.status(Response.Status.METHOD_NOT_ALLOWED).entity(api).build();
    }

}