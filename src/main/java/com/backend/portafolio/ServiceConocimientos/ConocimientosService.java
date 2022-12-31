
package com.backend.portafolio.ServiceConocimientos;

import com.backend.portafolio.Model.Conocimientos.Conocimientos;
import com.backend.portafolio.RepositoryConocimientos.ConocimientosRepository;
import com.backend.portafolio.RepositoryConocimientos.IConocimientosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocimientosService implements IConocimientosService{
     @Autowired
   private ConocimientosRepository repositorio;
  

    @Override
    public List<Conocimientos> getConocimientos(){
        List<Conocimientos> listarConocimientos = repositorio.findAll();
        return listarConocimientos;
    }
    
    @Override
    public Conocimientos add(Conocimientos con) {
        return repositorio.save(con);
    }

    @Override
    public Conocimientos edit(Conocimientos con) {
        return repositorio.save(con);
    }
      
     @Override
    public Conocimientos delete(int id) {
        Conocimientos con = repositorio.findById(id).orElse(null);
        if(con!=null){
            repositorio.delete(con);
        }
       return con;
    }

     @Override
    public Conocimientos listarId(int id) {
        Conocimientos con = repositorio.findById(id).orElse(null);
        return con;
    }

    @Override
    public void saveConocimientos(Conocimientos con) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
