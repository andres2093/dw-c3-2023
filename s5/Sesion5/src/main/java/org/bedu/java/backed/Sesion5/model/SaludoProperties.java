package org.bedu.java.backed.Sesion5.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoProperties {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
