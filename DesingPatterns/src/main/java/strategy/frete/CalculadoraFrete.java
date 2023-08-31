package strategy.frete;

/**
 * Esta classe representa a Calculadora de Frete, responsável por calcular o valor do frete
 * com base em diferentes estratégias implementadas pela interface Fretavel.
 *
 * A classe utiliza a estratégia definida pela interface Fretavel para calcular o valor do frete
 * com base no peso em quilogramas.
 *
 * Ela delega o cálculo para as classes que implementam a interface Fretavel.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class CalculadoraFrete {

    /**
     * Calcula o valor do frete com base na estratégia definida pela interface Fretavel.
     *
     * @param fretavel A estratégia de cálculo do frete.
     * @param pesoEmKg O peso em quilogramas para o cálculo do frete.
     * @return O valor do frete calculado com base na estratégia fornecida.
     */
    public double calcularValor(Fretavel fretavel, double pesoEmKg) {
        return fretavel.calcularValor(pesoEmKg);
    }
}
