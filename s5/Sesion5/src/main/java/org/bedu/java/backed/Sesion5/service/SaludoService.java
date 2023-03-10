package org.bedu.java.backed.Sesion5.service;

import org.bedu.java.backed.Sesion5.model.Saludo;
import org.bedu.java.backed.Sesion5.model.SaludoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    private final SaludoComponent saludoComponent;
    private final SaludoComponent otroSaludoComponent;

    @Autowired
    public SaludoService(SaludoComponent saludoComponent, SaludoComponent otroSaludoComponent) {
        this.saludoComponent = saludoComponent;
        this.otroSaludoComponent = otroSaludoComponent;

        System.out.println(saludoComponent == otroSaludoComponent);
    }

    public String saluda(){
        return "Ejemplo 02: Hola " + saludoComponent.getNombre();
    }
}
