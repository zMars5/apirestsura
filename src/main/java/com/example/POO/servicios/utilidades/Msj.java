package com.example.POO.servicios.utilidades;

public enum Msj {

    ERROR_REGISTRO("Error al registrarse"),


    ;

    private String mensaje;

    Msj (String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
