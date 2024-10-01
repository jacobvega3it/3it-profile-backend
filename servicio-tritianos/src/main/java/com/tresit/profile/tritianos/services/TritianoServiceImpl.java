package com.tresit.profile.tritianos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tresit.profile.tritianos.entities.Tritiano;
import com.tresit.profile.tritianos.repositories.TritianoRepository;

@Service
public class TritianoServiceImpl implements TritianoService {

    final private TritianoRepository repository;

    public TritianoServiceImpl(TritianoRepository repository){
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tritiano> obtenerTodo() {
        return (List<Tritiano>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Tritiano> obtenerPorId(Long id) {
        return repository.findById(id);
    }

}
