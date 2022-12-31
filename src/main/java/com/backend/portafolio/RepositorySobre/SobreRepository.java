
package com.backend.portafolio.RepositorySobre;

import com.backend.portafolio.Model.Sobre.Sobre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreRepository extends JpaRepository<Sobre, Integer>{
    void delete(Sobre sob);
    Sobre save(Sobre sob);
}
