
package com.backend.portafolio.RepositoryHeader;

import com.backend.portafolio.Model.header.Header;
import java.util.List;


public interface IHeaderService {
    public List<Header>getHeader();
    public void saveHeader (Header head);
    public Header listarId(int id);
    Header edit(Header head);
    Header delete(int id);
    public Header add(Header head);
}
