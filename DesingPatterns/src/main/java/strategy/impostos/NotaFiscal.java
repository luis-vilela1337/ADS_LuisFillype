package strategy.impostos;

import java.time.LocalDate;

/**
 * Esta classe representa uma Nota Fiscal, contendo informações como número, data de emissão e valor total.
 *
 * É utilizada para armazenar os detalhes de uma nota fiscal, incluindo seu número, data de emissão e valor total.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class NotaFiscal {

    private Long numero; // Número da nota fiscal
    private LocalDate dataEmissao; // Data de emissão da nota fiscal
    private double valorTotal; // Valor total da nota fiscal

    /**
     * Construtor para criar uma instância de NotaFiscal.
     *
     * @param numero Número da nota fiscal.
     * @param dataEmissao Data de emissão da nota fiscal.
     * @param valorTotal Valor total da nota fiscal.
     */
    public NotaFiscal(Long numero, LocalDate dataEmissao, double valorTotal) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    /**
     * Obtém o número da nota fiscal.
     *
     * @return O número da nota fiscal.
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * Obtém a data de emissão da nota fiscal.
     *
     * @return A data de emissão da nota fiscal.
     */
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Obtém o valor total da nota fiscal.
     *
     * @return O valor total da nota fiscal.
     */
    public double getValorTotal() {
        return valorTotal;
    }
}
