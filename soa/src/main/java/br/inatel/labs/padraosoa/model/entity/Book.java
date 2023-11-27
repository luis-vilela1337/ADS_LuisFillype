package br.inatel.labs.padraosoa.model.entity;

import java.util.Objects;

/**
 * Classe que representa a entidade Book.
 *
 * Um livro (Book) possui um identificador único (id), um título e uma categoria.
 * Implementa métodos equals() e hashCode() baseados no id para comparação e geração de código hash.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Book {

    private Long id;
    private String title;
    private String category;

    /**
     * Construtor que inicializa um livro com um id, um título e uma categoria.
     *
     * @param id O identificador único do livro.
     * @param title O título do livro.
     * @param category A categoria do livro.
     */
    public Book(Long id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    /**
     * Obtém o identificador único do livro.
     *
     * @return O id do livro.
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtém o título do livro.
     *
     * @return O título do livro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Obtém a categoria do livro.
     *
     * @return A categoria do livro.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define o identificador único do livro.
     *
     * @param id O id a ser definido para o livro.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Define o título do livro.
     *
     * @param title O título a ser definido para o livro.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Define a categoria do livro.
     *
     * @param category A categoria a ser definida para o livro.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Compara este livro com outro objeto para verificar a igualdade.
     *
     * @param o O objeto a ser comparado.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    /**
     * Gera um código hash baseado no id do livro.
     *
     * @return O código hash gerado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
