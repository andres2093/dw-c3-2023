package org.bedu.java.backed.sesion4.controllers;

import org.bedu.java.backed.sesion4.model.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saluda(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo!!!");
        return saludo;
    }

    @GetMapping("/saludo/{nombre}")
    public Saludo saludaConParam(@PathVariable String nombre){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo!!!");
        saludo.setNombre(nombre);
        return saludo;
    }

    @PostMapping("/saludo")
    public Saludo saludaPost(@RequestBody Saludo saludo){
        return saludo;
    }
}
