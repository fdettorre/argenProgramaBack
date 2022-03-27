package com.dettorrecv.backend.repository;

import com.dettorrecv.backend.model.Empleador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando D'Ettorre
 */


@Repository
public interface EmpleadorRepository extends JpaRepository <Empleador, Long> {
    
}
