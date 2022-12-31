
package com.backend.portafolio.RepositoryFooter;

import com.backend.portafolio.Model.Footer.Footer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooterRepository extends JpaRepository <Footer, Integer>{
    void delete(Footer foot);
    Footer save(Footer foot);
}
