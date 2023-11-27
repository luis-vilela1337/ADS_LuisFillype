package br.inatel.labs.padraoMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicia a aplicação Spring Boot.
 *
 * Essa classe contém o método principal (main) para iniciar a aplicação Spring Boot.
 * Utiliza a anotação @SpringBootApplication para configurar automaticamente a aplicação Spring.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
@SpringBootApplication
public class PadraoMvcApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     *
     * @param args Argumentos de linha de comando passados para a aplicação.
     */
    public static void main(String[] args) {
        SpringApplication.run(PadraoMvcApplication.class, args);
    }

}
