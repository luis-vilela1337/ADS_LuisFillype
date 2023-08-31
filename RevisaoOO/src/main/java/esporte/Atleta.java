package esporte;

/**
 * Esta classe representa um atleta, estendendo a classe Pessoa.
 * Contém informações específicas sobre o atleta, como peso e estado de aposentadoria,
 * além das informações básicas de uma pessoa.
 *
 * Fornece métodos para realizar aquecimento e para marcar o atleta como aposentado.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Atleta extends Pessoa {
    /**
     * O peso do atleta.
     */
    Integer peso;

    /**
     * Um valor booleano que indica se o atleta está aposentado ou não.
     */
    Boolean aposentado;

    /**
     * Construtor que inicializa as informações do atleta.
     *
     * @param nome O nome do atleta.
     * @param idade A idade do atleta.
     * @param peso O peso do atleta.
     * @param aposentado Indica se o atleta está aposentado.
     */
    public Atleta(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade);
        this.peso = peso;
        this.aposentado = aposentado;
    }

    /**
     * Realiza o aquecimento do atleta.
     */
    void aquecer() {
        System.out.println("Está aquecido.");
    }

    /**
     * Marca o atleta como aposentado.
     */
    void aposentar() {
        this.aposentado = true;
    }
}
