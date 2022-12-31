
package com.backend.portafolio.RepositorySkills;

import com.backend.portafolio.Model.Skills.Skills;
import java.util.List;

public interface ISkillsService {
    public List<Skills>getSkills();
    public void saveSkills (Skills skills);
    public Skills listarId(int id);
    Skills edit(Skills skills);
    Skills delete(int id);
    public Skills add(Skills skills);
}
