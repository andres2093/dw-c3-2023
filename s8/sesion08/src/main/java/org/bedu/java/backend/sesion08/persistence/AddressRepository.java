package org.bedu.java.backend.sesion08.persistence;

import org.bedu.java.backend.sesion08.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
