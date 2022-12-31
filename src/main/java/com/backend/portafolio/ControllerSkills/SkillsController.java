
package com.backend.portafolio.ControllerSkills;

import com.backend.portafolio.Model.Skills.Skills;
import com.backend.portafolio.RepositorySkills.ISkillsService;
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
public class SkillsController {
    @Autowired
    ISkillsService service;
    
    @GetMapping("/skills")
    public List<Skills> getProyectos(){
        return service.getSkills();
    }

    
    @PostMapping ("/skills/agregar")
    public Skills agregar(@RequestBody Skills skills){
        return service.add(skills);
    }
    
   @GetMapping("/skills/{id}")
    public Skills listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/skills/{id}"})
    public Skills editar(@RequestBody Skills skills,@PathVariable("id") int id){
        skills.setId(id);
        return service.edit(skills);
    }
   
        @DeleteMapping(path = {"/skills/{id}"})
    public Skills delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
