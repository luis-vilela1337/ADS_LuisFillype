package strategy.impostos;

/**
 * Esta classe implementa a interface Tributavel para calcular o Imposto sobre o Valor Acrescentado (IVA).
 *
 * Calcula o imposto com base em uma alíquota fixa de IVA sobre o valor total da nota fiscal.
 *
 * A alíquota padrão é de 5% (0.05), conforme determinado pelo IVA.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ImpostoIVA implements Tributavel {
    private static final double ALIQUOTA_IVA = 0.05;

    /**
     * Calcula o valor do imposto com base na alíquota do IVA sobre o valor total da nota fiscal.
     *
     * @param valorTotalNF O valor total da nota fiscal.
     * @return O valor do imposto calculado com base na alíquota do IVA.
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_IVA;
    }
}
