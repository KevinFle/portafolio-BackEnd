
package com.backend.portafolio.RepositoryExperiencia;

import com.backend.portafolio.Model.Experiencia.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia>getExperiencia();
    public void saveExperiencia (Experiencia exp);
    public Experiencia listarId(int id);
    Experiencia edit(Experiencia exp);
    Experiencia delete(int id);
    public Experiencia add(Experiencia exp);
}
