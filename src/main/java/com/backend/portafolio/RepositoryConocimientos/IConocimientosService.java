
package com.backend.portafolio.RepositoryConocimientos;

import com.backend.portafolio.Model.Conocimientos.Conocimientos;
import java.util.List;


public interface IConocimientosService {
    public List<Conocimientos>getConocimientos();
    public void saveConocimientos (Conocimientos con);
    public Conocimientos listarId(int id);
    Conocimientos edit(Conocimientos con);
    Conocimientos delete(int id);
    public Conocimientos add(Conocimientos con);
}
