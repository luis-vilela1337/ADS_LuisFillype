package strategy.frete;

/**
 * Esta interface representa um contrato para cálculo de valor de frete baseado no peso em quilogramas.
 *
 * Classes que implementam esta interface devem fornecer uma implementação para calcular o valor do frete
 * com base no peso fornecido em quilogramas.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public interface Fretavel {

    /**
     * Calcula o valor do frete com base no peso em quilogramas.
     *
     * @param pesoEmKg O peso em quilogramas para o cálculo do frete.
     * @return O valor do frete calculado com base no peso fornecido.
     */
    public double calcularValor(double pesoEmKg);
}
