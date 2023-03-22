package org.bedu.java.backend.sesion08.persistence;

import org.bedu.java.backend.sesion08.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

