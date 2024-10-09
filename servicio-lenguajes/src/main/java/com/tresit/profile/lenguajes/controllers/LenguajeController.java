package com.tresit.profile.lenguajes.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tresit.profile.lenguajes.models.Lenguaje;
import com.tresit.profile.lenguajes.services.LenguajeService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LenguajeController {

    private final LenguajeService service;

    public LenguajeController(LenguajeService service){
        this.service = service;
    }

    @GetMapping
    public List<Lenguaje> list(@RequestParam(name="name", required = false) String name, 
            @RequestHeader(name="token-request", required = false) String token) {
                System.out.println(name);
                System.out.println(token);
        return service.obtenerTodo();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> details(@PathVariable Long id) {
        Optional<Lenguaje> lenguajeOptional = this.service.obtenerPorId(id);
        if (lenguajeOptional.isPresent()){
            return ResponseEntity.ok(lenguajeOptional.get());
        }
        return ResponseEntity.status(404).body(Collections.singletonMap("message", "No existe el tritiano indicado"));
    }
    
}
