package com.natercio.biblioteca.service;

import com.natercio.biblioteca.domain.Categoria;
import com.natercio.biblioteca.domain.Livro;
import com.natercio.biblioteca.repositories.CategoriaRepository;
import com.natercio.biblioteca.repositories.LivroRepository;
import com.natercio.biblioteca.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id: " + id + ", Tipo: " + Livro.class.getName()));

    }

    public List<Livro> findAll(Integer id_cat) {
    }
}
