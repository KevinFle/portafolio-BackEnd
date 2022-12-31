
package com.backend.portafolio.ServiceHeader;

import com.backend.portafolio.Model.header.Header;
import com.backend.portafolio.RepositoryHeader.HeaderRepository;
import com.backend.portafolio.RepositoryHeader.IHeaderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{
     @Autowired
    private HeaderRepository repositorio;
    

    @Override
    public List<Header> getHeader(){
        List<Header> listarHeader = repositorio.findAll();
        return listarHeader;
    }
    
    @Override
    public Header add(Header head) {
        return repositorio.save(head);
    }

    @Override
    public Header edit(Header head) {
        return repositorio.save(head);
    }
      
     @Override
    public Header delete(int id) {
        Header head = repositorio.findById(id).orElse(null);
        if(head!=null){
            repositorio.delete(head);
        }
       return head;
    }

     @Override
    public Header listarId(int id) {
        Header head = repositorio.findById(id).orElse(null);
        return head;
    }

    @Override
    public void saveHeader(Header head) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
