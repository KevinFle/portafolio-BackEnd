
package com.backend.portafolio.ControllerProyectos;

import com.backend.portafolio.Model.Proyectos.Proyectos;
import com.backend.portafolio.RepositoryProyectos.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://argentinaprograma-c5128.web.app")
public class ProyectosController {
    @Autowired
    IProyectosService service;
   
    @GetMapping("/proyectos")
    public List<Proyectos> getProyectos(){
        return service.getProyectos();
    }

    
    @PostMapping ("/proyectos/agregar")
    public Proyectos agregar(@RequestBody Proyectos proy){
        return service.add(proy);
    }
    
   @GetMapping("/proyectos/{id}")
    public Proyectos listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/proyectos/{id}"})
    public Proyectos editar(@RequestBody Proyectos proy,@PathVariable("id") int id){
        proy.setId(id);
        return service.edit(proy);
    }
   
        @DeleteMapping(path = {"/proyectos/{id}"})
    public Proyectos delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
