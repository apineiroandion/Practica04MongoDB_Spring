package com.dam.practica04mongodb.controller;

import com.dam.practica04mongodb.model.Pinguin;
import com.dam.practica04mongodb.repository.PinguinRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pinguins")
public class PinguinController {

    private final PinguinRepository pinguinRepository;

    public PinguinController(PinguinRepository pinguinRepository) {
        this.pinguinRepository = pinguinRepository;
    }

    // Obtener todos los pingüinos
    @GetMapping
    public List<Pinguin> getAllPinguins() {
        return pinguinRepository.findAll();
    }

    // Obtener un pingüino por ID
    @GetMapping("/{id}")
    public Optional<Pinguin> getPinguinById(@PathVariable String id) {
        return pinguinRepository.findById(id);
    }

    // Guardar un nuevo pingüino
    @PostMapping
    public Pinguin createPinguin(@RequestBody Pinguin pinguin) {
        return pinguinRepository.save(pinguin);
    }

    // Actualizar un pingüino existente
    @PutMapping("/{id}")
    public Pinguin updatePinguin(@PathVariable String id, @RequestBody Pinguin updatedPinguin) {
        return pinguinRepository.findById(id).map(pinguin -> {
            pinguin.setNome(updatedPinguin.getNome());
            pinguin.setNomeCientifico(updatedPinguin.getNomeCientifico());
            pinguin.setHabitat(updatedPinguin.getHabitat());
            pinguin.setDescripcion(updatedPinguin.getDescripcion());
            pinguin.setAlimentacion(updatedPinguin.getAlimentacion());
            pinguin.setTamaño(updatedPinguin.getTamaño());
            pinguin.setPeso(updatedPinguin.getPeso());
            pinguin.setCaracteristicas(updatedPinguin.getCaracteristicas());
            return pinguinRepository.save(pinguin);
        }).orElseThrow(() -> new RuntimeException("Pinguino no encontrado con id: " + id));
    }

    // Eliminar un pingüino por ID
    @DeleteMapping("/{id}")
    public String deletePinguin(@PathVariable String id) {
        pinguinRepository.deleteById(id);
        return "Pingüino eliminado con éxito";
    }
}

