package contabilidade;

public class EmpresaSimples implements Tributavel{
    Double faturamentoMensal;

    public EmpresaSimples(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    @Override
    public Double getValorIr() {
        return this.faturamentoMensal*0.15;
    }

    @Override
    public Double getValorISS() {
        return this.faturamentoMensal*0.08;
    }
}
