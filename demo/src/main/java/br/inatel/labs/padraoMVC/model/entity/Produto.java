package br.inatel.labs.padraoMVC.model.entity;

import java.util.Objects;

/**
 * Esta classe representa a entidade Produto.
 *
 * Um Produto possui um identificador único (id), uma descrição e um preço.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Produto {

    private Long id;
    private String descricao;
    private Double preco;

    /**
     * Construtor que inicializa um Produto com um id, uma descrição e um preço.
     *
     * @param id O identificador único do Produto.
     * @param descricao A descrição do Produto.
     * @param preco O preço do Produto.
     */
    public Produto(Long id, String descricao, Double preco) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Obtém o identificador único do Produto.
     *
     * @return O id do Produto.
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtém a descrição do Produto.
     *
     * @return A descrição do Produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Obtém o preço do Produto.
     *
     * @return O preço do Produto.
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o identificador único do Produto.
     *
     * @param id O id a ser definido para o Produto.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Define a descrição do Produto.
     *
     * @param descricao A descrição a ser definida para o Produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Define o preço do Produto.
     *
     * @param preco O preço a ser definido para o Produto.
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * Sobrescreve o método hashCode para gerar um código hash baseado no id do Produto.
     *
     * @return O código hash gerado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
