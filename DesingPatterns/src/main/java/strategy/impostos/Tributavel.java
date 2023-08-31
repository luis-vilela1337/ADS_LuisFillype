package strategy.impostos;

/**
 * Esta interface define o contrato para objetos tributáveis, ou seja, objetos que são passíveis de cálculo de impostos.
 *
 * Classes que implementam esta interface devem fornecer uma implementação para o cálculo de impostos sobre um valor total de nota fiscal.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public interface Tributavel {

    /**
     * Calcula o valor do imposto com base no valor total da nota fiscal.
     *
     * @param valorTotalNF O valor total da nota fiscal para o cálculo do imposto.
     * @return O valor do imposto calculado.
     */
    public double calcularImposto(double valorTotalNF);
}
