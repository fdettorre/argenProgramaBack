package com.dettorrecv.backend.service;

import com.dettorrecv.backend.model.Estudios;
import com.dettorrecv.backend.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando D'Ettorre
 */

@Service

public class EstudiosService implements IEstudiosService {

    @Autowired
    
    public EstudiosRepository estuRepo;
    
    @Override
    public List<Estudios> verEstudios() {
        return estuRepo.findAll();    
    }

    @Override
    public void crearEstudios(Estudios est) {
        estuRepo.save(est);
    }

    @Override
    public void editarEstudios(Estudios est) {
        estuRepo.save(est);
    }
    
    @Override
    public void borrarEstudios(Long id) {
        estuRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudios(Long id) {
        return estuRepo.findById(id).orElse(null);
    }
    
}
