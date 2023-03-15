package org.bedu.java.backend.sesion6.controller;

import org.bedu.java.backend.sesion6.model.Direccion;
import org.bedu.java.backend.sesion6.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Usuario> creaUsuario(@RequestBody Usuario usuario){
        System.out.println("creaUsuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        Direccion direccion = new Direccion();
        direccion.setCalle("Córdoba");
        direccion.setNumero("56");
        direccion.setCodigoPostal("06700");

        usuario.setDireccion(direccion);

        return ResponseEntity.status(HttpStatus.CREATED).eTag("BETO").body(usuario);
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

    @PostMapping("/reto01")
    public String creaUsuarioReto1(@RequestBody Usuario usuario, @RequestParam long id, @RequestParam String rol){
        System.out.println("creaUsuarioReto01");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        return "Usuario " + id + " creado con el rol: " + rol;
    }
}
