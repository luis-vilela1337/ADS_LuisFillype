package strategy.frete;

/**
 * Esta classe implementa a interface Fretavel para o serviço de frete da FedEx.
 *
 * Calcula o valor do frete com base no peso em quilogramas, aplicando a política de precificação da FedEx.
 * Se o peso for inferior a 20.00 kg, o valor do frete é 0.00.
 * Para pesos entre 20.00 kg e 40.00 kg, o valor do frete é 45.00.
 * Caso contrário, para pesos maiores que 40.00 kg, o valor do frete é 75.00.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ServicoFreteFedEx implements Fretavel {

    /**
     * Calcula o valor do frete baseado na política de precificação da FedEx.
     *
     * @param pesoEmKg O peso em quilogramas para o cálculo do frete.
     * @return O valor do frete calculado de acordo com a política da FedEx.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.00) {
            return 0.00;
        } else if (pesoEmKg < 40.0) {
            return 45.00;
        } else {
            return 75.00;
        }
    }
}
