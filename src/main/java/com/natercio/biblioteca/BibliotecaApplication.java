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

		Livro l1 = new Livro(null,"Clean Code", "Robert Martin", "Loren Ipsum", cat1);
		Livro l2 = new Livro(null,"Java Como Programar", "Deitel", "Loren Ipsum", cat1);
		Livro l3 = new Livro(null,"Direito Constitucional", "Edilson", "Loren Ipsum", cat2);
		Livro l4 = new Livro(null,"Direito Penal", "Edilson Farias", "Loren Ipsum", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4));

		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4));

	}
}
