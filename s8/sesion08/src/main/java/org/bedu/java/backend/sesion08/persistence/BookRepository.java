package org.bedu.java.backend.sesion08.persistence;

import org.bedu.java.backend.sesion08.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

