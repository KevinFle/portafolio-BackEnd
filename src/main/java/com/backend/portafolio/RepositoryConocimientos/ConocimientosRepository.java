
package com.backend.portafolio.RepositoryConocimientos;

import com.backend.portafolio.Model.Conocimientos.Conocimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientosRepository extends JpaRepository <Conocimientos, Integer>{
    
    void delete(Conocimientos con);
    Conocimientos save(Conocimientos con);
}
