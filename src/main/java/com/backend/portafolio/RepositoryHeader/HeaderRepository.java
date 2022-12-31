
package com.backend.portafolio.RepositoryHeader;

import com.backend.portafolio.Model.header.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository <Header, Integer>{
    void delete(Header head);
    Header save(Header head);
}
