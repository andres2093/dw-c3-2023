package org.bedu.java.backend.sesion08.controller;

import org.bedu.java.backend.sesion08.model.Producto;
import org.bedu.java.backend.sesion08.persistence.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping
    public ResponseEntity<Void> creaProducto(@RequestBody Producto producto){
        Producto productoDB = productoRepository.save(producto);
        return ResponseEntity.created(URI.create(productoDB.getId().toString())).build();
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos(){
        List<Producto> productosDB = productoRepository.findAll();
        return ResponseEntity.ok(productosDB);
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long productoId){
        Optional<Producto> productoDB = productoRepository.findById(productoId);
        System.out.println(productoDB.isPresent());
        if(!productoDB.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto especificado no existe!!!");
        }
        return ResponseEntity.ok(productoDB.get());
    }
}
