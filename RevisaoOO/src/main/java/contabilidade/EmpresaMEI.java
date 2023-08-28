package contabilidade;

public class EmpresaMEI implements Tributavel {
    Double faturamentoMensal;

    public EmpresaMEI(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    @Override
    public Double getValorIr() {
        return this.faturamentoMensal*0.275;
    }

    @Override
    public Double getValorISS() {
        return this.faturamentoMensal;
    }
}
