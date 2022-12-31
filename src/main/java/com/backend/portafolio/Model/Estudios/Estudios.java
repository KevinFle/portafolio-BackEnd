
package com.backend.portafolio.Model.Estudios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudios")
public class Estudios {
         
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private String fechas;
    private String escuela;
    private String imagen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fechas;
    }

    public void setFecha(String fechas) {
        this.fechas = fechas;
    }
    public String getImagen()
    {
        return imagen;
    }
    public void setImagen(String imagen)
    {
        this.imagen = imagen;
    }
}
