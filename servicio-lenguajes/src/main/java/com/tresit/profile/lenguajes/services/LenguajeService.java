package com.tresit.profile.lenguajes.services;

import java.util.List;
import java.util.Optional;

import com.tresit.profile.lenguajes.models.Lenguaje;

public interface LenguajeService {

    List<Lenguaje> obtenerTodo();

    Optional<Lenguaje> obtenerPorId(Long id);

}
