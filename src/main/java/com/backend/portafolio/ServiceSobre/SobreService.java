
package com.backend.portafolio.ServiceSobre;

import com.backend.portafolio.Model.Sobre.Sobre;
import com.backend.portafolio.RepositorySobre.ISobreService;
import com.backend.portafolio.RepositorySobre.SobreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobreService implements ISobreService{
    @Autowired
   private SobreRepository repositorio;
 
 
    @Override
    public List<Sobre> getSobre(){
        List<Sobre> listarSobre = repositorio.findAll();
        return listarSobre;
    }
    
   @Override
   public void saveSobre(Sobre sob){
       repositorio.save(sob);
   }
   
    @Override
    public Sobre listarId(int id) {
        Sobre sob = repositorio.findById(id).orElse(null);
        return sob;
    }

    @Override
    public Sobre edit(Sobre sob) {
        return repositorio.save(sob);
    }
}
