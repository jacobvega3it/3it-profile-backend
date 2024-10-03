package com.tresit.profile.aplicaciones.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tresit.profile.aplicaciones.models.Aplicacion;
import com.tresit.profile.aplicaciones.services.AplicacionService;

@RestController
public class AplicacionController {

    private final AplicacionService service;

    public AplicacionController(AplicacionService service){
        this.service = service;
    }

    @GetMapping
    public List<Aplicacion> list() {
        return this.service.obtenerTodo();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> details(@PathVariable Long id) {
        Optional<Aplicacion> aplicacionOptional = this.service.obtenerPorId(id);
        if (aplicacionOptional.isPresent()){
            return ResponseEntity.ok(aplicacionOptional.get());
        }
        return ResponseEntity.status(404).body(Collections.singletonMap("message", "No existe el tritiano indicado"));
    }

}
