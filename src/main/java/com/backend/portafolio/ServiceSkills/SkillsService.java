
package com.backend.portafolio.ServiceSkills;

import com.backend.portafolio.Model.Skills.Skills;
import com.backend.portafolio.RepositorySkills.ISkillsService;
import com.backend.portafolio.RepositorySkills.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{
    @Autowired
    private SkillsRepository repositorio;
    

    @Override
    public List<Skills> getSkills(){
        List<Skills> listarSkills = repositorio.findAll();
        return listarSkills;
    }
    
    @Override
    public Skills add(Skills skills) {
        return repositorio.save(skills);
    }

    @Override
    public Skills edit(Skills skills) {
        return repositorio.save(skills);
    }
      
     @Override
    public Skills delete(int id) {
        Skills skills = repositorio.findById(id).orElse(null);
        if(skills!=null){
            repositorio.delete(skills);
        }
       return skills;
    }

     @Override
    public Skills listarId(int id) {
        Skills skills = repositorio.findById(id).orElse(null);
        return skills;
    }

    @Override
    public void saveSkills(Skills skills) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
