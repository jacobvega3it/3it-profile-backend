package com.tresit.profile.aplicaciones.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.tresit.profile.aplicaciones.models.Aplicacion;
import com.tresit.profile.aplicaciones.models.Tritiano;

@Service
public class AplicacionServiceWebClient implements AplicacionService {

    private final WebClient.Builder client;

    public AplicacionServiceWebClient(Builder client) {
        this.client = client;
    }

    @Override
    public List<Aplicacion> obtenerTodo() {
        return this.client.build()
            .get()
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToFlux(Tritiano.class)
            .map(tritiano -> new Aplicacion((long) (new Random().nextInt(10) + 1), tritiano, "Aplicación", "Básico"))
            .collectList()
            .block();
    }

    @Override
    public Optional<Aplicacion> obtenerPorId(Long id) {
        Map<String, Long> params = new HashMap<>();
        params.put("id", id);

        try {
            return Optional.of(
                client.build().get().uri("/{id}", params)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve() 
                .bodyToMono(Tritiano.class)
                .map(tritiano -> new Aplicacion((long) (new Random().nextInt(10) + 1), tritiano, "Aplicación detalle", "Básico detalle"))
                .block()
            );                
        } catch (WebClientResponseException e) {
            return Optional.empty();
        }

    }

}
