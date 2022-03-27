package com.dettorrecv.backend.service;

import com.dettorrecv.backend.model.Habilidad;
import com.dettorrecv.backend.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando D'Ettorre
 */

@Service
public class HabilidadService implements IHabilidadService {

    @Autowired
    public HabilidadRepository habRepo;
    
    @Override
    public List<Habilidad> verHabilidad() {
       return habRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }
    
    @Override
    public void editarHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }

    
}
