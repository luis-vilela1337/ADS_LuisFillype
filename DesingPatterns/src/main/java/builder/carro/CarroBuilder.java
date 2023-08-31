package builder.carro;

/**
 * Esta classe é responsável por construir um objeto Carro de forma controlada e flexível
 * usando o padrão Builder.
 *
 * Constrói um carro configurando as partes individuais, como portas, motor, computador de bordo e freio ABS.
 * Também realiza validações para garantir que o carro está sendo construído corretamente.
 *
 * Ao finalizar a construção, utiliza o método `getCarro()` para retornar o objeto Carro construído.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class CarroBuilder {

    private Carro carro = new Carro();

    public void buildPortas(Porta[] portas) {
        carro.setPortas(portas);
    }

    public void buildMotor(Motor m) {
        carro.setMotor(m);
    }

    public void buildComputadorBordo(ComputadorBordo cb) {
        carro.setComputadorBordo(cb);
    }

    public void buildFreioABS(FreioABS f) {
        carro.setFreioABS(f);
    }

    private void validarMotor() {
        if (carro.getMotor() == null) {
            throw new IllegalStateException("Nao tem motor");
        }
    }

    private void validarPortas() {
        if (carro.getPortas() == null) {
            throw new IllegalStateException("Nao tem portas");
        }

        int nroPortas = carro.getPortas().length;
        if (nroPortas != 2 && nroPortas != 4) {
            throw new IllegalStateException("Numero de portas invalido");
        }
    }

    /**
     * Obtém o carro construído após as configurações.
     * Realiza validações para garantir que o carro está sendo construído corretamente.
     *
     * @return O objeto Carro construído.
     * @throws IllegalStateException Se as validações para as partes do carro falharem.
     */
    public Carro getCarro() {
        validarPortas();
        validarMotor();
        return carro;
    }
}
