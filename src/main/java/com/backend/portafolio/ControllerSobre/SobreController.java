
package com.backend.portafolio.ControllerSobre;

import com.backend.portafolio.Model.Sobre.Sobre;
import com.backend.portafolio.RepositorySobre.ISobreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SobreController {
    @Autowired
    private ISobreService service;
    
    @GetMapping("/sobre")
    public List<Sobre> getSobre(){
        return service.getSobre();
    }

     @PostMapping ("/sobre/agregar")
    public String agregar(@RequestBody Sobre sob){
        service.saveSobre(sob);
        return "Fue creada correctamente";
        }
    
   @GetMapping("/sobre/{id}")
    public Sobre listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/sobre/{id}"})
    public Sobre editar(@RequestBody Sobre sob,@PathVariable("id") int id){
        sob.setId(id);
        return service.edit(sob);
    }
}
