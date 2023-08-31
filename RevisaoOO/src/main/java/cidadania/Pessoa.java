package cidadania;

/**
 * Esta classe representa uma pessoa genérica.
 * Contém informações básicas sobre uma pessoa, como nome, sexo e idade.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Pessoa {
    /**
     * O nome da pessoa.
     */
    String nome;

    /**
     * O sexo da pessoa.
     */
    String sexo;

    /**
     * A idade da pessoa.
     */
    Integer idade;

    /**
     * Construtor que inicializa as informações da pessoa.
     *
     * @param nome O nome da pessoa.
     * @param sexo O sexo da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
}
