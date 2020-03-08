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
public class NullPointerExceptionHandler implements ExceptionMapper<NullPointerException> {

    @Override
    public Response toResponse(NullPointerException ex) {
        ErrorExceptionWrapper api = new ErrorExceptionWrapper((ex.getMessage() != null)? ex.getMessage():"NullPointerException",
                "No se ha inicializado un objeto\n"+ex.getCause().getMessage(),Calendar.getInstance(), ex.getCause().getStackTrace());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(api).build();
    }

}
