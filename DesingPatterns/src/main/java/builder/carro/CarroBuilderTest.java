package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

    @Test
    public void dadoPartesValidas_quandoGetCarro_entaCarroEhConstruido() {
        //pantes valicam
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();
        //invocando CarroBuilder
        CarroBuilder builder = new CarroBuilder();
        builder.buildMotor (motorVTEC);
        builder.buildPortas( portas );
        builder.buildComputadorBordo( computadorBordoSiemens );
        builder.buildFreioABS(freioBosch);
        Carro carroPronto = builder.getCarro();
        //validando carro
        assertNotNull( carroPronto );
        assertNotNull( carroPronto.getPortas());
        assertNotNull( carroPronto.getMotor() );
        assertTrue( carroPronto.getPortas().length == 2);
        assertNotNull( carroPronto.getComputadorBordo() );
        assertNotNull( carroPronto.getFreioABS() );


    }
    public void dadoCarroSemMotor_lancaExcption() {
        //pantes valicam
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();
        //invocando CarroBuilder
        CarroBuilder builder = new CarroBuilder();
        //builder.buildMotor (motorVTEC);
        builder.buildPortas( portas );
        builder.buildComputadorBordo( computadorBordoSiemens );
        builder.buildFreioABS(freioBosch);

        try {
            Carro carroPronto = builder.getCarro();
            fail("Deveria ter lancado exception");
        }catch(IllegalStateException e) {
            System.out.println("Lancou Exption como esperado");
        }

    }
    public void dadoCarroSemPorta_lancaExcption() {
        //pantes valicam
        Motor motorVTEC = new Motor();
        Porta portaMotorista = new Porta();
        Porta portaPassageiro = new Porta();
        Porta[] portas = {portaMotorista, portaPassageiro};
        ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
        FreioABS freioBosch = new FreioABS();
        //invocando CarroBuilder
        CarroBuilder builder = new CarroBuilder();
        builder.buildMotor (motorVTEC);
        //builder.buildPortas( portas );
        builder.buildComputadorBordo( computadorBordoSiemens );
        builder.buildFreioABS(freioBosch);

        try {
            Carro carroPronto = builder.getCarro();
            fail("Deveria ter lancado exception");
        }catch(IllegalStateException e) {
            System.out.println("Lancou Exption como esperado");
        }

    }
}