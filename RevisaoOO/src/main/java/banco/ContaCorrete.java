package banco;

public class ContaCorrete extends Conta{
    @Override
    void rentabilizar() {
        this.saldo *= 1.01;
    }
}
