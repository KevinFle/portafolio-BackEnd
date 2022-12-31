
package com.backend.portafolio.Model.header;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "header")
public class Header 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String imagen;
    private String titulo;
    private String instagram;
    private String facebook;
    private String banner;
    private String github;
    private String linkedlin;
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getImagen()
    {
        return this.imagen;
    }
    public void setImagen(String imagen)
    {
        this.imagen = imagen;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getInstagram()
    {
        return this.instagram;
    }
    public void setInstagram(String instagram)
    {
        this.instagram = instagram;
    }
    
    public String getFacebook()
    {
        return this.facebook;
    }
    public void setFacebook(String facebook)
    {
        this.facebook = facebook;
    }
    public String getBanner()
    {
        return this.banner;
    }
    public void setBanner(String banner)
    {
        this.banner = banner;
    }
    public String getGithub()
    {
        return this.github;
    }
    public void setGithub(String github)
    {
        this.github = github;
    }
    public String getLinkedlin()
    {
        return this.linkedlin;
    }
    public void setlinkedlin(String link)
    {
        this.linkedlin = link;
    }
}
