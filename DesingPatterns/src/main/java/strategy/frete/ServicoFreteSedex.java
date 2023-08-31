package strategy.frete;

/**
 * Esta classe implementa a interface Fretavel para o serviço de frete da Sedex.
 *
 * Calcula o valor do frete com base no peso em quilogramas, seguindo a política de precificação da Sedex.
 * Se o peso for inferior a 10.00 kg, o valor do frete é 50.00.
 * Para pesos entre 10.00 kg e 20.00 kg, o valor do frete é 70.00.
 * Para pesos maiores que 20.00 kg, o valor do frete é 90.00.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ServicoFreteSedex implements Fretavel {

    /**
     * Calcula o valor do frete baseado na política de precificação da Sedex.
     *
     * @param pesoEmKg O peso em quilogramas para o cálculo do frete.
     * @return O valor do frete calculado de acordo com a política da Sedex.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 10.00) {
            return 50.00;
        } else if (pesoEmKg < 20.00) {
            return 70.00;
        } else {
            return 90.00;
        }
    }
}
