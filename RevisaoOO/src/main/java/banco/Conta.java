package banco;

public abstract class Conta {
    Double saldo = 0.0;
    abstract void rentabilizar();

    void depositar(Double valor){
        this.saldo +=valor;
    }

    void sacar(Double valor){
        this.saldo -= valor;
    }
}
