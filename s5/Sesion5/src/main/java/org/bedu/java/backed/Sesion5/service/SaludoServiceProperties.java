package org.bedu.java.backed.Sesion5.service;

import org.bedu.java.backed.Sesion5.model.SaludoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SaludoServiceProperties {

    private final SaludoProperties saludoProperties;

    @Autowired
    public SaludoServiceProperties(SaludoProperties saludoProperties) {
        this.saludoProperties = saludoProperties;
    }

    @PostConstruct
    public void init(){
        saludoProperties.setNombre("Beto");
    }

    public String saluda(){
        return "Ejemplo 03: Hola " + saludoProperties.getNombre();
    }
}
