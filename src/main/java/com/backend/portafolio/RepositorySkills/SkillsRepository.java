
package com.backend.portafolio.RepositorySkills;

import com.backend.portafolio.Model.Skills.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepository extends JpaRepository <Skills, Integer>{
    void delete(Skills skills);
    Skills save(Skills skills);
}
