
package com.backend.portafolio.RepositorySobre;

import com.backend.portafolio.Model.Sobre.Sobre;
import java.util.List;


public interface ISobreService {
    public List<Sobre>getSobre();
    public void saveSobre (Sobre sob);
    public Sobre listarId(int id);
    Sobre edit(Sobre sob);
}
