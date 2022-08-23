package com.natercio.biblioteca;

import com.natercio.biblioteca.domain.Categoria;
import com.natercio.biblioteca.domain.Livro;
import com.natercio.biblioteca.repositories.CategoriaRepository;
import com.natercio.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	LivroRepository livroRepository;

	public static void main(String[] args) {

		SpringApplication.run(BibliotecaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

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

		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4));
		cat3.getLivros().addAll(Arrays.asList(L5,L6,L7));
		cat4.getLivros().addAll(Arrays.asList(L8));

		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,L5,L6,L7,L8));

	}
}
