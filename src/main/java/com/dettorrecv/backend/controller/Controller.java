package com.dettorrecv.backend.controller;

import com.dettorrecv.backend.model.Empleador;
import com.dettorrecv.backend.model.Estudios;
import com.dettorrecv.backend.model.Habilidad;
import com.dettorrecv.backend.service.IEmpleadorService;
import com.dettorrecv.backend.service.IEstudiosService;
import com.dettorrecv.backend.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fernando D'Ettorre
 */

@RestController
public class Controller {

    
    @Autowired
    private IEmpleadorService empleadorServ;
    

    /**
 *
 * Empleador
 */
   
    @CrossOrigin(origins = "http://localhost:4200") 
    @PostMapping ("/new/empleador")
        public void agregarEmpleador (@RequestBody Empleador emp){
        empleadorServ.crearEmpleador(emp);
        }
    
    @CrossOrigin(origins = "http://localhost:4200") 
    @PutMapping ("/edit/empleador")
        public void editarEmpleador (@RequestBody Empleador emp){
        empleadorServ.editarEmpleador(emp);
        }        
        
    @CrossOrigin(origins = "http://localhost:4200") 
    @GetMapping ("/ver/empleador")
    @ResponseBody
        public List<Empleador> verEmpleador() {
            return empleadorServ.verEmpleador();
        }
    
    @DeleteMapping ("/borraempleador/{id}")
        public void borrarEmpleador (@PathVariable Long id) {
            empleadorServ.borrarEmpleador(id);
        }

    
         /**
 *
 * Estudios
 */
          
    @Autowired    
    private IEstudiosService estuServ;
    
        
    @CrossOrigin(origins = "http://localhost:4200") 
    @PostMapping ("/new/estudios")
        public void agregarEstudios (@RequestBody Estudios est){
        estuServ.crearEstudios(est);
        }
    
    @CrossOrigin(origins = "http://localhost:4200") 
    @PutMapping ("/edit/estudios")
        public void editarEstudios (@RequestBody Estudios est){
        estuServ.editarEstudios(est);
        }        
        
           
    @CrossOrigin(origins = "http://localhost:4200") 
    @GetMapping ("/ver/estudios")
    @ResponseBody
        public List<Estudios> verEstudios   () {
            return estuServ.verEstudios();
        }
    
    @DeleteMapping ("/borraestudio/{id}")
        public void borrarEstudios (@PathVariable Long id) {
            estuServ.borrarEstudios(id);
        }



 /**
 *
 * Habilidad
 */
   

    @Autowired    
    private IHabilidadService habServ;

    @CrossOrigin(origins = "http://localhost:4200") 
    @PostMapping ("/new/habilidad")
        public void agregarHabilidad (@RequestBody Habilidad hab){
        habServ.crearHabilidad(hab);
        }
    
    @CrossOrigin(origins = "http://localhost:4200") 
    @PutMapping ("/edit/habilidad")
        public void editarHabilidad (@RequestBody Habilidad hab){
        habServ.crearHabilidad(hab);
        }    
        
    @CrossOrigin(origins = "http://localhost:4200") 
    @GetMapping ("/ver/habilidad")
    @ResponseBody
        public List<Habilidad> verHabilidad   () {
            return habServ.verHabilidad();
        }
    
    @DeleteMapping ("/borrahabilidad/{id}")
        public void borrarHabilidad (@PathVariable Long id) {
            habServ.borrarHabilidad(id);
        }

   /**
 *
 * Autenticación
 */    




}