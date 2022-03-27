package com.dettorrecv.backend.service;

import com.dettorrecv.backend.model.Habilidad;
import java.util.List;

/**
 *
 * @author Fernando D'Ettorre
 */


public interface IHabilidadService {

    public List<Habilidad> verHabilidad();
    public void crearHabilidad (Habilidad hab);
    public void editarHabilidad (Habilidad hab);
    public void borrarHabilidad (Long id);
    public Habilidad buscarHabilidad (Long id);
    
    
}
