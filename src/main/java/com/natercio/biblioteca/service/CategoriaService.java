package com.natercio.biblioteca.service;

import java.util.List;
import java.util.Optional;

import com.natercio.biblioteca.dtos.CategoriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natercio.biblioteca.domain.Categoria;
import com.natercio.biblioteca.repositories.CategoriaRepository;
import com.natercio.biblioteca.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));

    }
    
    public List<Categoria> findAll(){
    	return repository.findAll();
    	
    }
    public Categoria create(Categoria obj) {
    	obj.setId(null);
    	return repository.save(obj);
    }

    public Categoria update(Integer id, CategoriaDTO objDto){

        Categoria obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());

        return repository.save(obj);

    }
}
