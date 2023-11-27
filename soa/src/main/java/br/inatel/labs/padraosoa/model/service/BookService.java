package br.inatel.labs.padraosoa.model.service;

import br.inatel.labs.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Serviço responsável por gerenciar operações relacionadas a livros.
 *
 * Utiliza a anotação @Service para indicar que é um serviço Spring.
 * Contém métodos para recuperar todos os livros, recuperar um livro por ID e criar um novo livro.
 * Inicializa uma lista de livros durante a fase de pós-construção usando a anotação @PostConstruct.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
@Service
public class BookService {

    private List<Book> bookList = new ArrayList<>();

    /**
     * Inicializa a lista de livros durante a fase de pós-construção.
     */
    @PostConstruct
    private void setup(){
        Book b1 = new Book(1L, "Delphin Blanco", "Contos");
        Book b2 = new Book(2L, "Python com Matemática", "Programação");
        Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");

        this.bookList.add(b1);
        this.bookList.add(b2);
        this.bookList.add(b3);
    }

    /**
     * Recupera todos os livros.
     *
     * @return Uma lista contendo todos os livros.
     */
    public List<Book> findAll(){
        return this.bookList;
    }

    /**
     * Recupera um livro por ID.
     *
     * @param id O ID do livro a ser recuperado.
     * @return Um Optional contendo o livro correspondente ao ID fornecido, se encontrado.
     */
    public Optional<Book> findById(Long id){
        return this.bookList.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }

    /**
     * Cria um novo livro.
     *
     * @param book O livro a ser criado.
     * @return O livro recém-criado.
     */
    public Book create(Book book){
        long idGerado = new Random().nextLong();
        book.setId(idGerado);
        this.bookList.add(book);
        return book;
    }
}
