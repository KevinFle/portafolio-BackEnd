
package com.backend.portafolio.RepositoryExperiencia;

import com.backend.portafolio.Model.Experiencia.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer>{
    void delete(Experiencia exp);
    Experiencia save(Experiencia exp);
}
