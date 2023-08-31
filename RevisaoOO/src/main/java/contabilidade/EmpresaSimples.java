package contabilidade;

/**
 * Esta classe representa uma Empresa do tipo Simples, que implementa a interface Tributavel.
 * Contém informações sobre o faturamento mensal da empresa e calcula os valores
 * de Imposto de Renda (IR) e Imposto sobre Serviços (ISS) a serem pagos.
 *
 * Implementa os métodos da interface Tributavel para fornecer os cálculos corretos
 * dos impostos.
 *
 * O cálculo de Imposto de Renda é baseado em uma taxa fixa de 15% do faturamento mensal,
 * enquanto o cálculo de Imposto sobre Serviços é baseado em uma taxa fixa de 8% do faturamento mensal.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class EmpresaSimples implements Tributavel {
    /**
     * O faturamento mensal da empresa.
     */
    Double faturamentoMensal;

    /**
     * Construtor que inicializa o faturamento mensal da empresa.
     *
     * @param faturamentoMensal O faturamento mensal da empresa.
     */
    public EmpresaSimples(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    /**
     * Calcula o valor do Imposto de Renda (IR) para a empresa do tipo Simples.
     * O cálculo é baseado em uma taxa fixa de 15% do faturamento mensal.
     *
     * @return O valor do Imposto de Renda a ser pago.
     */
    @Override
    public Double getValorIr() {
        return this.faturamentoMensal * 0.15;
    }

    /**
     * Calcula o valor do Imposto sobre Serviços (ISS) para a empresa do tipo Simples.
     * O cálculo é baseado em uma taxa fixa de 8% do faturamento mensal.
     *
     * @return O valor do ISS a ser pago.
     */
    @Override
    public Double getValorISS() {
        return this.faturamentoMensal * 0.08;
    }
}
