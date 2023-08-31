package esporte;

/**
 * Esta classe representa um ciclista, estendendo a classe Atleta.
 * Herda informações de um atleta e inclui métodos específicos para ciclistas,
 * como o método para pedalar.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Ciclista extends Atleta {
    /**
     * Construtor que inicializa as informações do ciclista.
     *
     * @param nome O nome do ciclista.
     * @param idade A idade do ciclista.
     * @param peso O peso do ciclista.
     * @param aposentado Indica se o ciclista está aposentado.
     */
    public Ciclista(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de pedalar.
     */
    void pedalar() {
        System.out.println("Está pedalando.");
    }
}
