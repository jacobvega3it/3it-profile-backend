package com.tresit.profile.tritianos.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tresit.profile.tritianos.entities.Tritiano;
import com.tresit.profile.tritianos.repositories.TritianoRepository;

@Service
public class TritianoServiceImpl implements TritianoService {

    final private TritianoRepository repository;

    final private Environment environment;

    public TritianoServiceImpl(TritianoRepository repository, Environment environment){
        this.repository = repository;
        this.environment = environment;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tritiano> obtenerTodo() {
        return ((List<Tritiano>) repository.findAll()).stream().map(tritiano -> {
            tritiano.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            return tritiano;
        }).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Tritiano> obtenerPorId(Long id) {
        return repository.findById(id).map(tritiano -> {
            tritiano.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            return tritiano;
        });
    }

}
