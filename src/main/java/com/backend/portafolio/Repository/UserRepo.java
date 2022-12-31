
package com.backend.portafolio.Repository;

import com.backend.portafolio.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Usuario, String>{
    Usuario findByUserId(String userId);
}
