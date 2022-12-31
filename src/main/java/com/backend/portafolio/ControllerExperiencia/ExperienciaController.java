
package com.backend.portafolio.ControllerExperiencia;

import com.backend.portafolio.Model.Experiencia.Experiencia;
import com.backend.portafolio.RepositoryExperiencia.IExperienciaService;
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
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    IExperienciaService service;
   
    @GetMapping("/experiencia")
    public List<Experiencia> getExperiencia(){
        return service.getExperiencia();
    }

    
    @PostMapping ("/experiencia/agregar")
    public Experiencia agregar(@RequestBody Experiencia exp){
        return service.add(exp);
    }
    
   @GetMapping("/experiencia/{id}")
    public Experiencia listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/experiencia/{id}"})
    public Experiencia editar(@RequestBody Experiencia exp,@PathVariable("id") int id){
        exp.setId(id);
        return service.edit(exp);
    }
   
        @DeleteMapping(path = {"/experiencia/{id}"})
    public Experiencia delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
