package com.ws;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("api") // Sin la barra inicial aquí, solo "api"
public class RestConfig extends Application { }