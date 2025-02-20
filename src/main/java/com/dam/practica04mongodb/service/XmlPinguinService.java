package com.dam.practica04mongodb.service;

import com.dam.practica04mongodb.model.Pinguin;
import com.dam.practica04mongodb.model.Pinguins;
import com.dam.practica04mongodb.repository.PinguinRepository;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class XmlPinguinService {

    @Autowired
    private PinguinRepository pinguinRepository;

    public void cargarDatosDesdeXml(String rutaXml) {
        try {
            // Crear el contexto JAXB
            JAXBContext context = JAXBContext.newInstance(Pinguins.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Leer el archivo XML
            File file = new File(rutaXml);
            Pinguins pinguins = (Pinguins) unmarshaller.unmarshal(file);

            // Guardar los pingüinos en la base de datos
            List<Pinguin> listaPinguins = pinguins.getPinguins();
            pinguinRepository.saveAll(listaPinguins);

            System.out.println("Datos cargados correctamente en MongoDB");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

