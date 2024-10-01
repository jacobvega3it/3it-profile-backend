package com.tresit.profile.tritianos.services;

import java.util.List;
import java.util.Optional;

import com.tresit.profile.tritianos.entities.Tritiano;

public interface TritianoService {

    List<Tritiano> obtenerTodo();

    Optional<Tritiano> obtenerPorId(Long id);

}
