package com.natercio.biblioteca.resources;

import com.natercio.biblioteca.domain.Categoria;
import com.natercio.biblioteca.domain.Livro;
import com.natercio.biblioteca.dtos.LivroDTO;
import com.natercio.biblioteca.repositories.LivroRepository;
import com.natercio.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroResource {

    @Autowired
    private LivroService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Integer id){
        Livro obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }

    @GetMapping
    public ResponseEntity<List<LivroDTO>> findAll(@RequestParam(value = "categoria", defaultValue = "0") Integer id_cat){
        List<Livro> list = service.findAll(id_cat);
    }

}
