package com.ws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/saludo")
public class HolaMundo {

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Saludo decirHola() {
        return new Saludo("¡Hola Mundo desde Java REST!");
    }

    // Clase interna para estructurar el JSON
    public static class Saludo {
        private String mensaje;

        public Saludo(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    }
}
