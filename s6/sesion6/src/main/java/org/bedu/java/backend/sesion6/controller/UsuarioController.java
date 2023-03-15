package org.bedu.java.backend.sesion6.controller;

import org.bedu.java.backend.sesion6.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @PostMapping
    public String creaUsuario(@RequestBody Usuario usuario){
        System.out.println("creaUsuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        return "Usuario creado!!!";
    }

    @PostMapping("/{id}")
    public String creaUsuarioParams(@RequestBody Usuario usuario, @PathVariable("id") long id){
        System.out.println("creaUsuarioParams");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        return "Usuario " + id + " creado!!!";
    }
}
