package contabilidade;

/**
 * Esta interface define os métodos para cálculo de impostos de entidades tributáveis.
 * As classes que implementam esta interface devem fornecer implementações para calcular
 * o valor do Imposto de Renda (IR) e o valor do Imposto sobre Serviços (ISS).
 *
 * Os métodos definidos nesta interface permitem que diferentes tipos de entidades, como
 * empresas, possam calcular seus impostos de maneira apropriada.
 *
 * Implementado por: EmpresaMEI, EmpresaSimples (exemplos)
 *
 * @see EmpresaMEI
 * @see EmpresaSimples
 * @version 1.0
 */
public interface Tributavel {
    /**
     * Calcula o valor do Imposto de Renda (IR) da entidade tributável.
     *
     * @return O valor do Imposto de Renda a ser pago.
     */
    Double getValorIr();

    /**
     * Calcula o valor do Imposto sobre Serviços (ISS) da entidade tributável.
     *
     * @return O valor do ISS a ser pago.
     */
    Double getValorISS();
}
