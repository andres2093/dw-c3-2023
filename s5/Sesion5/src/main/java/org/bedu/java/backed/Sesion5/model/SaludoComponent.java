package org.bedu.java.backed.Sesion5.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SaludoComponent {
    private final String nombre;

    public SaludoComponent() {
        this.nombre = "Beto";
        System.out.println("Creando instancia!!!");
    }

    public String getNombre() {
        return nombre;
    }
}
