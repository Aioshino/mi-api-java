package com.ws;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/saludo")
public class HolaMundo {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String decirHola() {
        return "¡Hola Mundo desde Java REST!";
    }
}