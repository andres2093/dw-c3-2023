package org.bedu.java.backend.sesion08.model;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    @RestResource(path = "libraryAddress", rel="address")
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
