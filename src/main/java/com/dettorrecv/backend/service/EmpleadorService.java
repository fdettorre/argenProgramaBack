package com.dettorrecv.backend.service;

import com.dettorrecv.backend.model.Empleador;
import com.dettorrecv.backend.repository.EmpleadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando D'Ettorre
 */

@Service
public class EmpleadorService implements IEmpleadorService {

    @Autowired
            
    public EmpleadorRepository empleRepo;
    
    @Override
    public List<Empleador> verEmpleador() {
        return empleRepo.findAll();
    }

    @Override
    public void crearEmpleador(Empleador emp) {
        empleRepo.save(emp);
    }

    @Override
    public void editarEmpleador(Empleador emp) {
        empleRepo.save(emp);
    }

    @Override
    public void borrarEmpleador(Long id) {
        empleRepo.deleteById(id);
    }

    @Override
    public Empleador buscarEmpleador(Long id) {
        return empleRepo.findById(id).orElse(null);
    }
    
}
