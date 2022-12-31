
package com.backend.portafolio.ControllerHeader;

import com.backend.portafolio.Model.header.Header;
import com.backend.portafolio.RepositoryHeader.IHeaderService;
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
public class HeaderController {
    @Autowired
    IHeaderService service;
    
    @GetMapping("/header")
    public List<Header> getHeader(){
        return service.getHeader();
    }

    
    @PostMapping ("/header/agregar")
    public Header agregar(@RequestBody Header header){
        return service.add(header);
    }
    
   @GetMapping("/header/{id}")
    public Header listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/header/{id}"})
    public Header editar(@RequestBody Header header,@PathVariable("id") int id){
        header.setId(id);
        return service.edit(header);
    }
   
        @DeleteMapping(path = {"/header/{id}"})
    public Header delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
