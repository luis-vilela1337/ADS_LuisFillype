package contabilidade;

/**
 * Esta classe representa uma Empresa do tipo MEI (Microempreendedor Individual),
 * que implementa a interface Tributavel.
 * Contém informações sobre o faturamento mensal da empresa e calcula os valores
 * de Imposto de Renda (IR) e Imposto sobre Serviços (ISS) a serem pagos.
 *
 * Implementa os métodos da interface Tributavel para fornecer os cálculos corretos
 * dos impostos.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class EmpresaMEI implements Tributavel {
    /**
     * O faturamento mensal da empresa.
     */
    Double faturamentoMensal;

    /**
     * Construtor que inicializa o faturamento mensal da empresa.
     *
     * @param faturamentoMensal O faturamento mensal da empresa.
     */
    public EmpresaMEI(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    /**
     * Calcula o valor do Imposto de Renda (IR) para a empresa MEI.
     * O cálculo é baseado em uma taxa fixa de 27.5% do faturamento mensal.
     *
     * @return O valor do Imposto de Renda a ser pago.
     */
    @Override
    public Double getValorIr() {
        return this.faturamentoMensal * 0.275;
    }

    /**
     * Calcula o valor do Imposto sobre Serviços (ISS) para a empresa MEI.
     * O cálculo é baseado no próprio faturamento mensal da empresa.
     *
     * @return O valor do ISS a ser pago.
     */
    @Override
    public Double getValorISS() {
        return this.faturamentoMensal;
    }
}
