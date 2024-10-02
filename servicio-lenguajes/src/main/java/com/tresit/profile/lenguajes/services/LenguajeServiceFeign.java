package com.tresit.profile.lenguajes.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresit.profile.lenguajes.clients.TritianoFeignClient;
import com.tresit.profile.lenguajes.models.Lenguaje;
import com.tresit.profile.lenguajes.models.Tritiano;

@Service
public class LenguajeServiceFeign implements LenguajeService {

    @Autowired
    private TritianoFeignClient client;

    @Override
    public List<Lenguaje> obtenerTodo() {
        return client.list()
                .stream()
                .map(tritiano -> new Lenguaje((long) (new Random().nextInt(10) + 1), tritiano, "Lenguaje", "Básico"))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Lenguaje> obtenerPorId(Long id) {

        try {
            Tritiano tritiano = client.details(id);            
            return Optional.of(new Lenguaje((long) (new Random().nextInt(10) + 1), tritiano, "Lenguaje detalle", "Nivel detalle"));
        } catch (Exception e) {
            return Optional.empty();
        }

    }

}
