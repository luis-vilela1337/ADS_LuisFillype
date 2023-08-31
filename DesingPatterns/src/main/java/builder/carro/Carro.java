package builder.carro;

/**
 * Esta classe representa um objeto Carro que pode ser construído através do padrão Builder.
 *
 * Contém informações sobre as peças que compõem um carro, como portas, motor, computador de bordo e freio ABS.
 *
 * Fornece métodos para acessar e definir as peças do carro.
 *
 * Esta classe pode ser utilizada em conjunto com um padrão de construção (Builder pattern)
 * para criar instâncias de carro de maneira mais flexível e controlada.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Carro {
    private Porta[] portas;
    private Motor motor;
    private ComputadorBordo computadorBordo;
    private FreioABS freioABS;

    public Porta[] getPortas() {
        return portas;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ComputadorBordo getComputadorBordo() {
        return computadorBordo;
    }

    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    public FreioABS getFreioABS() {
        return freioABS;
    }

    public void setFreioABS(FreioABS freioABS) {
        this.freioABS = freioABS;
    }
}
