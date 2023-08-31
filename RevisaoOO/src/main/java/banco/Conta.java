package banco;

/**
 * Esta classe abstrata representa uma conta bancária genérica.
 * Contém operações básicas de gerenciamento de saldo, como depositar e sacar,
 * bem como um método abstrato para rentabilização específica de cada tipo de conta.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public abstract class Conta {
    /**
     * O saldo da conta.
     */
    Double saldo = 0.0;

    /**
     * Método abstrato para calcular a rentabilização da conta.
     * O cálculo específico será implementado nas subclasses.
     */
    abstract void rentabilizar();

    /**
     * Deposita um valor na conta, aumentando o saldo.
     *
     * @param valor O valor a ser depositado.
     */
    void depositar(Double valor) {
        this.saldo += valor;
    }

    /**
     * Saca um valor da conta, diminuindo o saldo.
     *
     * @param valor O valor a ser sacado.
     */
    void sacar(Double valor) {
        this.saldo -= valor;
    }
}
