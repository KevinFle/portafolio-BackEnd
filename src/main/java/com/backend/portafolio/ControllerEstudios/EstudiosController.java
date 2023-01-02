
package com.backend.portafolio.ControllerEstudios;

import com.backend.portafolio.Model.Estudios.Estudios;
import com.backend.portafolio.RepositoryEstudios.IEstudiosService;
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
public class EstudiosController {
    @Autowired
    IEstudiosService service;
   
    @GetMapping("/estudios")
    public List<Estudios> getEstudios(){
        return service.getEstudios();
    }

    
    @PostMapping ("/estudios/agregar")
    public Estudios agregar(@RequestBody Estudios estu){
        return service.add(estu);
    }
    
   @GetMapping("/estudios/{id}")
    public Estudios listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/estudios/{id}"})
    public Estudios editar(@RequestBody Estudios estu,@PathVariable("id") int id){
        estu.setId(id);
        return service.edit(estu);
    }
   
        @DeleteMapping(path = {"/estudios/{id}"})
    public Estudios delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
