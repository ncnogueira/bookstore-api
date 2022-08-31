package com.natercio.biblioteca.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natercio.biblioteca.domain.Categoria;
import com.natercio.biblioteca.domain.Livro;
import com.natercio.biblioteca.repositories.CategoriaRepository;
import com.natercio.biblioteca.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	CategoriaRepository categoriaRepository;	
	@Autowired
	LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática","Livros de TI");
		Categoria cat2 = new Categoria(null, "Dirieto","Livros de Direito");
		Categoria cat3 = new Categoria(null, "Ficção Científica","Livros de Ficção Científica");
		Categoria cat4 = new Categoria(null, "Física", "Livros de Física");

		Livro l1 = new Livro(null,"Clean Code", "Robert Martin", "Loren Ipsum", cat1);
		Livro l2 = new Livro(null,"Java Como Programar", "Deitel", "Loren Ipsum", cat1);
		Livro l3 = new Livro(null,"Direito Constitucional", "Edilson", "Loren Ipsum", cat2);
		Livro l4 = new Livro(null,"Direito Penal", "Edilson Farias", "Loren Ipsum", cat2);
		Livro L5 = new Livro(null,"Vinte mil léguas submarinas", "Júlio Verne", "Loren Ipsum", cat3);
		Livro L6 = new Livro(null,"A búsula dourada", "Phillip Pullman", "Loren Ipsum", cat3);
		Livro L7 = new Livro(null,"A Luneta Ambar", "Phillip Pullman", "Loren Ipsum", cat3);
		Livro L8 = new Livro(null,"Uma breve história do tempo", "Stephen Hawking", "Loren Ipsum", cat4);
		Livro L9 = new Livro(null,"A faca sutil", "Phillip Pullman", "Loren Ipsum", cat3);
		Livro L10 = new Livro(null,"A volta ao mundo em 80 dias", "Cicrano das Tantas", "Loren Ipsum 10", cat2);
		Livro L11 = new Livro(null,"Viagem ao Centro da terra", "Beutrano das Tantas e Tal", "Loren Ipsum 11", cat1);
		Livro L12 = new Livro(null,"Fundamentos de Eletricidade", "Zeutrano de Tal e Tantas", "Loren Ipsum 12", cat4);
		Livro L13 = new Livro(null,"Termondinâmica", "Zeutrano de Tal e Tantas", "Loren Ipsum 13", cat4);
		Livro L14 = new Livro(null,"Optica, estudo dos espelhos e lentes", "Zeutrano de Tal e Tantas", "Loren Ipsum 14", cat4);
		Livro L15 = new Livro(null,"Dinâmica, o estudo dos movimentos", "Zeutrano de Tal e Tantas", "Loren Ipsum 15", cat4);

		cat1.getLivros().addAll(Arrays.asList(l1,l2,L11));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,L10));
		cat3.getLivros().addAll(Arrays.asList(L5,L6,L7,L9));
		cat4.getLivros().addAll(Arrays.asList(L8,L12,L13,L14,L15));

		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
		livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15));
		
	}
	
	
	

}
