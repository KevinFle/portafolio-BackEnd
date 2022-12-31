
package com.backend.portafolio.ServiceFooter;

import com.backend.portafolio.Model.Footer.Footer;
import com.backend.portafolio.RepositoryFooter.FooterRepository;
import com.backend.portafolio.RepositoryFooter.IFooterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooterService implements IFooterService{
    @Autowired
    private FooterRepository repositorio;
    

    @Override
    public List<Footer> getFooter(){
        List<Footer> listarFooter = repositorio.findAll();
        return listarFooter;
    }
    
    @Override
    public Footer add(Footer foot) {
        return repositorio.save(foot);
    }

    @Override
    public Footer edit(Footer foot) {
        return repositorio.save(foot);
    }
      
     @Override
    public Footer delete(int id) {
        Footer foot = repositorio.findById(id).orElse(null);
        if(foot!=null){
            repositorio.delete(foot);
        }
       return foot;
    }

     @Override
    public Footer listarId(int id) {
        Footer foot = repositorio.findById(id).orElse(null);
        return foot;
    }

    @Override
    public void saveFooter(Footer foot) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
