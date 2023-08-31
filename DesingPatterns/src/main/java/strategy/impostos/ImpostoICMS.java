package strategy.impostos;

/**
 * Esta classe implementa a interface Tributavel para cálculo de imposto utilizando o ICMS.
 *
 * Calcula o imposto com base em uma alíquota fixa de ICMS sobre o valor total da nota fiscal.
 *
 * A alíquota padrão é de 10% (0.10), conforme determinado pelo ICMS.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ImpostoICMS implements Tributavel {
    private static final double ALIQUOTA_ICMS = 0.10;

    /**
     * Calcula o valor do imposto com base na alíquota do ICMS sobre o valor total da nota fiscal.
     *
     * @param valorTotalNF O valor total da nota fiscal.
     * @return O valor do imposto calculado com base na alíquota do ICMS.
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ICMS;
    }
}
