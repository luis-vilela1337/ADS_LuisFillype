package banco;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void rentabilizar() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(100.00);
        contaPoupanca.sacar(50.00);
        contaPoupanca.rentabilizar();


        assertEquals(contaPoupanca.saldo, 50*1.01);
    }
}