package com.dam.practica04mongodb.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final XmlPinguinService xmlPinguinService;

    public DataLoader(XmlPinguinService xmlPinguinService) {
        this.xmlPinguinService = xmlPinguinService;
    }

    @Override
    public void run(String... args) throws Exception {
        xmlPinguinService.cargarDatosDesdeXml("src/main/resources/pinguinos.xml");
    }
}

