package br.inatel.labs.padraosoa.controller;

import br.inatel.labs.padraosoa.model.entity.Book;
import br.inatel.labs.padraosoa.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * Controlador REST responsável por lidar com as operações relacionadas a livros.
 *
 * Utiliza a anotação @RestController para indicar que é um controlador Spring REST.
 * Mapeia as requisições para o caminho "/book".
 * Fornece operações para recuperar todos os livros, recuperar um livro por ID e criar um novo livro.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    /**
     * Recupera todos os livros.
     *
     * @return Uma lista contendo todos os livros.
     */
    @GetMapping
    public List<Book> getAllBooks(){
        List<Book> books = this.service.findAll();
        return books;
    }

    /**
     * Recupera um livro por ID.
     *
     * @param bookId O ID do livro a ser recuperado.
     * @return O livro correspondente ao ID fornecido.
     * @throws ResponseStatusException Se o livro não for encontrado, retorna uma resposta HTTP 404 (NOT FOUND).
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long bookId){
        Optional<Book> opBook = this.service.findById(bookId);

        if(opBook.isPresent()) {
            return opBook.get();
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    /**
     * Cria um novo livro.
     *
     * @param book O livro a ser criado, fornecido no corpo da requisição.
     * @return O livro recém-criado.
     */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Book postBook(@RequestBody Book book){
        book = this.service.create(book);
        return book;
    }
}
