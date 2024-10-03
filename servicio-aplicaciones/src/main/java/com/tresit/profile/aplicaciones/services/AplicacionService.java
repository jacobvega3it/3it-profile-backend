package com.tresit.profile.aplicaciones.services;

import java.util.List;
import java.util.Optional;

import com.tresit.profile.aplicaciones.models.Aplicacion;

public interface AplicacionService {

    List<Aplicacion> obtenerTodo();

    Optional<Aplicacion> obtenerPorId(Long id);

}
