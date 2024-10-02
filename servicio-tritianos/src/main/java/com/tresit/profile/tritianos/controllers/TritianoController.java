package com.tresit.profile.tritianos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tresit.profile.tritianos.entities.Tritiano;
import com.tresit.profile.tritianos.services.TritianoService;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;


@RestController
//@RequestMapping("/api/tritianos")
public class TritianoController {

    final private TritianoService service;
    
    public TritianoController (TritianoService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(this.service.obtenerTodo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> details(@PathVariable Long id) {
        Optional<Tritiano> tritianoOptional = this.service.obtenerPorId(id);

        if (tritianoOptional.isPresent()){
            return ResponseEntity.ok(tritianoOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }

}
