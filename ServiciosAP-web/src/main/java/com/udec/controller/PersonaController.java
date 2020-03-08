/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controller;




import com.udec.entity.Persona;
import com.udec.interfaces.IPersona;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ASUS
 */
@Stateless
@Path("/personas")
public class PersonaController {
    
    @EJB
    IPersona persona;
    
    @GET
    @Path("/lista")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerLista(){
        //return persona.listaPersonas();
            return Response.status(Response.Status.OK).entity(persona.listaPersonas()).build();       
    }
    
    @POST
    @Path("/guardar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardarPersona(@Valid Persona persona){
        this.persona.guardarPersona(persona);
        return Response.status(Response.Status.CREATED).entity(persona).build();
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/obtener/{cedula}")
    public Response obtenerPersonaCedula(@PathParam("cedula") int cedula){
        Persona per;
        per=persona.obtenerPersona(cedula);
        return Response.status(Response.Status.OK).entity(per).build();
    }
    
    @DELETE
    @Path("/eliminar/{cedula}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminarPersona(@PathParam("cedula") int cedula){
      persona.eliminarPersona(cedula);
      return Response.status(Response.Status.NO_CONTENT).build();
        
    }
    
    @PUT
    @Path("/editar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editarPersona(Persona persona){
        this.persona.editarPersona(persona);
        return Response.status(Response.Status.OK).entity(persona).build();
    }
    
}
