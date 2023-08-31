package strategy.impostos;

/**
 * Esta classe implementa a interface Tributavel para cálculo de imposto utilizando o ISS (Imposto sobre Serviços).
 *
 * Calcula o imposto com base em uma alíquota fixa de ISS sobre o valor total da nota fiscal.
 *
 * A alíquota padrão é de 2% (0.02), conforme determinado pelo ISS.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ImpostoISS implements Tributavel {
    private static final double ALIQUOTA_ISS = 0.02;

    /**
     * Calcula o valor do imposto com base na alíquota do ISS sobre o valor total da nota fiscal.
     *
     * @param valorTotalNF O valor total da nota fiscal.
     * @return O valor do imposto calculado com base na alíquota do ISS.
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ISS;
    }
}
