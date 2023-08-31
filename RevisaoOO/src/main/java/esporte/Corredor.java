package esporte;

/**
 * Esta classe representa um corredor, estendendo a classe Atleta.
 * Herda informações de um atleta e inclui métodos específicos para corredores,
 * como o método para correr.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Corredor extends Atleta {
    /**
     * Construtor que inicializa as informações do corredor.
     *
     * @param nome O nome do corredor.
     * @param idade A idade do corredor.
     * @param peso O peso do corredor.
     * @param aposentado Indica se o corredor está aposentado.
     */
    public Corredor(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de correr.
     */
    void correr() {
        System.out.println("Está correndo.");
    }
}
