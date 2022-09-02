package com.natercio.biblioteca.dtos;

import com.natercio.biblioteca.domain.Livro;

import java.io.Serializable;

public class LivroDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
    private String titulo;

    public LivroDTO(){
        super();
    }

    public LivroDTO(Livro obj) {
        super();
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    

}
