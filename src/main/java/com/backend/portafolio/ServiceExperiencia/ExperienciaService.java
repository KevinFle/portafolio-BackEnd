
package com.backend.portafolio.ServiceExperiencia;

import com.backend.portafolio.Model.Experiencia.Experiencia;
import com.backend.portafolio.RepositoryExperiencia.ExperienciaRepository;
import com.backend.portafolio.RepositoryExperiencia.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private ExperienciaRepository repositorio;
    
    @Override
    public List<Experiencia> getExperiencia(){
        List<Experiencia> listarExperiencia = repositorio.findAll();
        return listarExperiencia;
    }
    
    @Override
    public Experiencia add(Experiencia exp) {
        return repositorio.save(exp);
    }

    @Override
    public Experiencia edit(Experiencia exp) {
        return repositorio.save(exp);
    }
      
     @Override
    public Experiencia delete(int id) {
        Experiencia exp = repositorio.findById(id).orElse(null);
        if(exp!=null){
            repositorio.delete(exp);
        }
       return exp;
    }

     @Override
    public Experiencia listarId(int id) {
        Experiencia exp = repositorio.findById(id).orElse(null);
        return exp;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
