
package com.backend.portafolio.RepositoryEstudios;

import com.backend.portafolio.Model.Estudios.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios, Integer>{
    void delete(Estudios estu);
    Estudios save(Estudios estu);
}
