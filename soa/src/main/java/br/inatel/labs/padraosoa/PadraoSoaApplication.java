package br.inatel.labs.padraosoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal responsável por iniciar a aplicação Spring Boot.
 *
 * Utiliza a anotação @SpringBootApplication para indicar que é uma aplicação Spring Boot.
 * Contém o método main() que inicia a aplicação.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
@SpringBootApplication
public class PadraoSoaApplication {

	/**
	 * Método principal que inicia a aplicação Spring Boot.
	 *
	 * @param args Argumentos de linha de comando (não utilizado neste caso).
	 */
	public static void main(String[] args) {
		SpringApplication.run(PadraoSoaApplication.class, args);
	}
}
