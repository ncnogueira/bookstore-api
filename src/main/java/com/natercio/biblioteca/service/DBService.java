package com.natercio.biblioteca.service;

import com.natercio.biblioteca.domain.Categoria;
import com.natercio.biblioteca.domain.Livro;
import com.natercio.biblioteca.repositories.CategoriaRepository;
import com.natercio.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {


    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    LivroRepository livroRepository;

    public void instanciaBaseDeDados() {
        Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
        Categoria cat2 = new Categoria(null, "Dirieto", "Livros de Direito");
        Categoria cat3 = new Categoria(null, "Matemática", "Livros de Matemática");

        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren Ipsum", cat1);
        Livro l2 = new Livro(null, "Java Como Programar", "Deitel", "Loren Ipsum", cat1);

        Livro l4 = new Livro(null, "Direito Penal", "Edilson Farias", "Loren Ipsum", cat2);
        Livro l3 = new Livro(null, "Direito Constitucional", "Edilson", "Loren Ipsum", cat2);

        Livro l5 = new Livro(null, "Algebra e Geometria Analítica", "Fulano de Tal", "Loren Ipsum", cat3);
        Livro l6 = new Livro(null, "Trigonometria Avançada", "Cicrano", "Loren Ipsum", cat3);
        Livro l7 = new Livro(null, "Funções e suas variáveis", "Cicrano", "Loren Ipsum", cat3);
        Livro l8 = new Livro(null, "Geometria Espacial", "Rochedo", "Loren Ipsum", cat3);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4));
        cat3.getLivros().addAll(Arrays.asList(l5,l6,l7,l8));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2,cat3));
        livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4,l5,l6,l7,l8));
    }
}
