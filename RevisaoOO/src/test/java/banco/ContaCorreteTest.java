package banco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorreteTest {

    @Test
    void rentabilizar() {
        ContaCorrete contaCorrete = new ContaCorrete();

        contaCorrete.depositar(100.00);
        contaCorrete.sacar(50.00);
        contaCorrete.rentabilizar();

        assertEquals(contaCorrete.saldo, 50.00 *1.01);
    }
}