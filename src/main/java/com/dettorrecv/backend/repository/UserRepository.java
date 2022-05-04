package com.dettorrecv.backend.repository;

import com.dettorrecv.backend.model.Usuariobackmysql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando D'Ettorre
 */


@Repository

public interface UserRepository extends JpaRepository <Usuariobackmysql, Long>{

 Usuariobackmysql findById(int id);

  @Query(value ="SELECT id,username,password,email,eliminado FROM usuario WHERE eliminado=false", nativeQuery=true)
  Iterable<Usuariobackmysql> allUsers();

  @Query(value ="SELECT count(id) FROM usuario WHERE username=:usunombre", nativeQuery=true)
  int exiteUsuarioxNombre(String usunombre);

  @Query(value ="SELECT count(id) FROM usuario WHERE username=:usunombre AND password=:usupassword", nativeQuery=true)
  int exiteUsuarioxNombrexPasword(String usunombre, String usupassword);

  @Query(value ="SELECT count(id) FROM usuario WHERE email=:mail", nativeQuery=true)
  int exiteUsuarioxMail(String mail);
  
}