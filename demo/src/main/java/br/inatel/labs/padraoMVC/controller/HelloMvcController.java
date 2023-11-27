package br.inatel.labs.padraoMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Controlador responsável por lidar com a requisição relacionada à página "hello-mvc".
 *
 * Utiliza a anotação @Controller para indicar que é um controlador Spring MVC.
 * Mapeia a requisição GET para "/hello" para o método getHello().
 * Adiciona um atributo "luis" ao modelo para ser usado na visualização.
 * Retorna o nome da visualização "hello-mvc".
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
@Controller
public class HelloMvcController {

    /**
     * Manipula a requisição GET para "/hello" e retorna a visualização "hello-mvc".
     *
     * @param model O modelo que será usado pela visualização.
     * @return O nome da visualização "hello-mvc".
     */
    @GetMapping("/hello")
    public String getHello(Model model) {
        String luis = "Luis";
        model.addAttribute("usuairio", luis);
        return "hello-mvc";
    }
}
