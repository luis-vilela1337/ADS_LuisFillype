package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {
    @Test
    public void deveCalcularFreteParaDHL() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteDHL();
        double valorAtual = calculadora.calcularValor(fretavel, 10.0);
        double valorEsperado = 100.00;

        assertEquals(valorEsperado, valorAtual);
    }
    @Test
    public void deveCalcularFreteParaSedex() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteSedex();
        double valorAtual = calculadora.calcularValor(fretavel, 5.0);
        double valorEsperado = 50.00;

        assertEquals(valorEsperado, valorAtual);
    }
    @Test
    public void deveCalcularFreteParaJadLog() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteJadLog();
        double valorAtual = calculadora.calcularValor(fretavel, 25.00);
        double valorEsperado = 0.00;

        assertEquals(valorEsperado, valorAtual);
    }
    @Test
    public void deveCalcularFreteParaFedEx() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteJadLog();
        double valorAtual = calculadora.calcularValor(fretavel, 5.00);
        double valorEsperado = 0.00;

        assertEquals(valorEsperado, valorAtual);
    }

}