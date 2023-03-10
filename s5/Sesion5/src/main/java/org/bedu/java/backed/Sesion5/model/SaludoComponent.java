package org.bedu.java.backed.Sesion5.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoComponent {
    private final String nombre;

    public SaludoComponent() {
        this.nombre = "Beto";
    }

    public String getNombre() {
        return nombre;
    }
}
