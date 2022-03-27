package com.dettorrecv.backend.service;

import com.dettorrecv.backend.model.Empleador;
import java.util.List;

/**
 *
 * @author Fernando D'Ettorre
 */
public interface IEmpleadorService {

    public List<Empleador> verEmpleador();
    public void crearEmpleador (Empleador emp);
    public void editarEmpleador (Empleador emp);
    public void borrarEmpleador (Long id);
    public Empleador buscarEmpleador (Long id);
    
}
