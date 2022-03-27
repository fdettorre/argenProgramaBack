package com.dettorrecv.backend.service;

import com.dettorrecv.backend.model.Estudios;
import java.util.List;

/**
 *
 * @author Fernando D'Ettorre
 */
public interface IEstudiosService {

    public List<Estudios> verEstudios();
    public void crearEstudios (Estudios est);
    public void editarEstudios (Estudios est);
    public void borrarEstudios (Long id);
    public Estudios buscarEstudios (Long id);
}
