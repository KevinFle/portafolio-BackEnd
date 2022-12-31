
package com.backend.portafolio.ServiceProyectos;

import com.backend.portafolio.Model.Proyectos.Proyectos;
import com.backend.portafolio.RepositoryProyectos.IProyectosService;
import com.backend.portafolio.RepositoryProyectos.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    private ProyectosRepository repositorio;
    

    @Override
    public List<Proyectos> getProyectos(){
        List<Proyectos> listarProyectos = repositorio.findAll();
        return listarProyectos;
    }
    
    @Override
    public Proyectos add(Proyectos proy) {
        return repositorio.save(proy);
    }

    @Override
    public Proyectos edit(Proyectos proy) {
        return repositorio.save(proy);
    }
      
     @Override
    public Proyectos delete(int id) {
        Proyectos proy = repositorio.findById(id).orElse(null);
        if(proy!=null){
            repositorio.delete(proy);
        }
       return proy;
    }

     @Override
    public Proyectos listarId(int id) {
        Proyectos proy = repositorio.findById(id).orElse(null);
        return proy;
    }

    @Override
    public void saveProyectos(Proyectos proy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
