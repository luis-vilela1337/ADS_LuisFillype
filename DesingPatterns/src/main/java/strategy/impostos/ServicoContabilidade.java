package strategy.impostos;

import java.util.List;

/**
 * Esta classe fornece serviços contábeis, incluindo a totalização de impostos de uma Nota Fiscal.
 *
 * Oferece métodos para totalizar os impostos de uma Nota Fiscal utilizando uma lista de impostos vigentes.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ServicoContabilidade {

    /**
     * Totaliza os impostos de uma Nota Fiscal utilizando uma lista de impostos vigentes.
     *
     * @param nf A Nota Fiscal para a qual os impostos serão totalizados.
     * @param listaImpostosVigentes A lista de impostos tributáveis vigentes.
     * @return O valor total dos impostos calculados para a Nota Fiscal.
     */
    public double totalizarImpostos(NotaFiscal nf, List<Tributavel> listaImpostosVigentes){
        double valorTotalNF = nf.getValorTotal();

        return listaImpostosVigentes.stream()
                .map(t -> t.calcularImposto(valorTotalNF))
                .reduce(0.0, Double::sum);
    }
}
