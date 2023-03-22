package org.bedu.java.backend.sesion08.runners;

import org.bedu.java.backend.sesion08.model.Etapa;
import org.bedu.java.backend.sesion08.persistence.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EtapasVentaRunner implements CommandLineRunner {

    private final EtapaRepository etapaRepository;

    private static final boolean createCatalogs = false;

    @Autowired
    public EtapasVentaRunner(EtapaRepository etapaRepository) {
        this.etapaRepository = etapaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Etapa> etapas = new ArrayList<>();
        etapas.add(crearEtapa("1", 1));
        etapas.add(crearEtapa("2", 2));
        etapas.add(crearEtapa("3", 3));
        etapas.add(crearEtapa("4", 4));
        etapas.add(crearEtapa("5", 5));
        etapas.add(crearEtapa("6", 6));

        try {
            if (createCatalogs) {
                etapaRepository.saveAll(etapas);
            }
        } catch (Exception e){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Catalogo creado!!!");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

    }

    private Etapa crearEtapa(String nombre, Integer orden){
        Etapa etapa = new Etapa();
        etapa.setNombre(nombre);
        etapa.setOrden(orden);
        return etapa;
    }
}
