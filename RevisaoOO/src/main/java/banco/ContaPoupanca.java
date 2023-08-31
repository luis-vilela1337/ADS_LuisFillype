package banco;

/**
 * Esta classe representa uma conta poupança bancária, que estende a classe Conta.
 * Possui a capacidade de ser rentabilizada por meio da aplicação de uma taxa fixa.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ContaPoupanca extends Conta {
    /**
     * Calcula a rentabilização da conta poupança aplicando uma taxa fixa de 2% ao saldo.
     */
    @Override
    void rentabilizar() {
        this.saldo *= 1.02;
    }
}
