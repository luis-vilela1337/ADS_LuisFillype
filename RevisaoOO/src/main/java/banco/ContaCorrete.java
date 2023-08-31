package banco;

/**
 * Esta classe representa uma conta corrente bancária, que estende a classe Conta.
 * Possui a capacidade de ser rentabilizada por meio da aplicação de uma taxa fixa.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ContaCorrete extends Conta {
    /**
     * Calcula a rentabilização da conta corrente aplicando uma taxa fixa de 1% ao saldo.
     */
    @Override
    void rentabilizar() {
        this.saldo *= 1.01;
    }
}
