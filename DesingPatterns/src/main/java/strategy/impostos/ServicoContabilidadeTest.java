package strategy.impostos;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Esta classe contém testes para o Serviço de Contabilidade, incluindo a totalização de impostos de uma Nota Fiscal.
 *
 * Testa o método de totalização de impostos da classe ServicoContabilidade.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ServicoContabilidadeTest {

    /**
     * Testa o método de totalização de impostos de uma Nota Fiscal.
     */
    @Test
    public void devoTotalizarImpostosDaNotaFiscal(){
        // nota fiscal
        NotaFiscal nf = new NotaFiscal(1L, LocalDate.of(2023, Month.OCTOBER, 24), 1000.0);
        // receita federal
        ReceitaFederal receitaFederal = new ReceitaFederal();
        List<Tributavel> impostosVigentes = receitaFederal.buscarListaImpostosVigentes();
        // contabilidade
        ServicoContabilidade servicoContabilidade = new ServicoContabilidade();
        double impostosTotalizados = servicoContabilidade.totalizarImpostos(nf, impostosVigentes);

        double impostosTotalizadosEsperado = 170.0;

        assertEquals(impostosTotalizadosEsperado, impostosTotalizados);
    }
}
