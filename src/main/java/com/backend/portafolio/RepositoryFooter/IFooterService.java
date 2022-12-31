
package com.backend.portafolio.RepositoryFooter;

import com.backend.portafolio.Model.Footer.Footer;
import java.util.List;

public interface IFooterService {
    public List<Footer>getFooter();
    public void saveFooter (Footer foot);
    public Footer listarId(int id);
    Footer edit(Footer foot);
    Footer delete(int id);
    public Footer add(Footer foot);
}
