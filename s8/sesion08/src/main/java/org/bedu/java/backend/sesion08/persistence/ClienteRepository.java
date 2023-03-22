package org.bedu.java.backend.sesion08.persistence;

import org.bedu.java.backend.sesion08.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
