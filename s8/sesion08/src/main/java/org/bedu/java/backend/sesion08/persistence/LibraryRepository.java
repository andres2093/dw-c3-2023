package org.bedu.java.backend.sesion08.persistence;

import org.bedu.java.backend.sesion08.model.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends CrudRepository<Library, Long> {
}
