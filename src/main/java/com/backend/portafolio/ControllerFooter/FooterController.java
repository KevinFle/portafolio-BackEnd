
package com.backend.portafolio.ControllerFooter;

import com.backend.portafolio.Model.Footer.Footer;
import com.backend.portafolio.RepositoryFooter.IFooterService;
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
public class FooterController {
    @Autowired
    IFooterService service;
    
    @GetMapping("/footer")
    public List<Footer> getFooter(){
        return service.getFooter();
    }

    
    @PostMapping ("/footer/agregar")
    public Footer agregar(@RequestBody Footer footer){
        return service.add(footer);
    }
    
   @GetMapping("/footer/{id}")
    public Footer listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/footer/{id}"})
    public Footer editar(@RequestBody Footer footer,@PathVariable("id") int id){
        footer.setId(id);
        return service.edit(footer);
    }
   
        @DeleteMapping(path = {"/footer/{id}"})
    public Footer delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
