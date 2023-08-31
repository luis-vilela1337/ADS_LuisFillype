package esporte;

/**
 * Esta classe representa um nadador, estendendo a classe Atleta.
 * Herda informações de um atleta e inclui métodos específicos para nadadores,
 * como o método para nadar.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Nadador extends Atleta {
    /**
     * Construtor que inicializa as informações do nadador.
     *
     * @param nome O nome do nadador.
     * @param idade A idade do nadador.
     * @param peso O peso do nadador.
     * @param aposentado Indica se o nadador está aposentado.
     */
    public Nadador(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de nadar.
     */
    void nadar() {
        System.out.println("Está nadando.");
    }
}
