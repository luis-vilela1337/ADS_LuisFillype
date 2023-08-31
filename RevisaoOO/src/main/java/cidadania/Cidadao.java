package cidadania;

/**
 * Esta classe representa um cidadão, estendendo a classe Pessoa.
 * Contém informações específicas sobre o cidadão, como o CPF,
 * além das informações básicas de uma pessoa.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Cidadao extends Pessoa {
    /**
     * O CPF do cidadão.
     */
    String cpf;

    /**
     * Construtor que inicializa as informações do cidadão.
     *
     * @param nome O nome do cidadão.
     * @param sexo O sexo do cidadão.
     * @param idade A idade do cidadão.
     * @param cpf O CPF do cidadão.
     */
    public Cidadao(String nome, String sexo, Integer idade, String cpf) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }
}
