package com.example.necflis.Utils;

public class Apis {

    public static final String URL_001="http://192.168.0.1:8080/personas/";

    public static ClientesService getPersonaService(){
        return  ClientesRETRO.getClient(URL_001).create(ClientesService.class);

    }
}