package contabilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContabilidadeTest {
    @Test
    void testeEmpresaSimples_valorIR(){
        EmpresaSimples empresa  = new EmpresaSimples(20000.00);

        empresa.getValorIr();
    }

    @Test
    void testeEmpresaSimples_valorISS(){
        EmpresaSimples empresa  = new EmpresaSimples(20000.00);

        empresa.getValorISS();
    }
    @Test
    void testeEmpresaMEI_valorIR(){
        EmpresaMEI empresa  = new EmpresaMEI(20000.00);

        empresa.getValorIr();
    }

    @Test
    void testeEmpresaMEI_valorISS(){
        EmpresaSimples empresa  = new EmpresaSimples(20000.00);

        empresa.getValorISS();
    }
}