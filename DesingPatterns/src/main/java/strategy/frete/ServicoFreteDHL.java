package strategy.frete;

/**
 * Esta classe implementa a interface Fretavel para o serviço de frete da DHL.
 *
 * Calcula o valor do frete com base no peso em quilogramas, aplicando a política de precificação da DHL.
 * Se o peso for inferior a 20.00 kg, o valor do frete é 100.00. Caso contrário, é 90.00.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ServicoFreteDHL implements Fretavel {

    /**
     * Calcula o valor do frete baseado na política de precificação da DHL.
     *
     * @param pesoEmKg O peso em quilogramas para o cálculo do frete.
     * @return O valor do frete calculado de acordo com a política da DHL.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.00) {
            return 100.00;
        } else {
            return 90.00;
        }
    }
}
