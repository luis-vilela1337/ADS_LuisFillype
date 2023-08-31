package strategy.frete;

/**
 * Esta classe implementa a interface Fretavel para o serviço de frete da JadLog.
 *
 * Calcula o valor do frete com base no peso em quilogramas, seguindo a política de precificação da JadLog.
 * Se o peso for inferior a 30.00 kg, o valor do frete é 0.00.
 * Para pesos iguais ou maiores que 30.00 kg, o valor do frete é fixado em 150.00.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ServicoFreteJadLog implements Fretavel {

    /**
     * Calcula o valor do frete baseado na política de precificação da JadLog.
     *
     * @param pesoEmKg O peso em quilogramas para o cálculo do frete.
     * @return O valor do frete calculado de acordo com a política da JadLog.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 30.00) {
            return 0.00;
        } else {
            return 150.00;
        }
    }
}
