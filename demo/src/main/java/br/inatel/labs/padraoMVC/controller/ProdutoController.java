package br.inatel.labs.padraoMVC.controller;

import br.inatel.labs.padraoMVC.model.entity.Produto;
import br.inatel.labs.padraoMVC.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Controlador responsável por lidar com a requisição relacionada à página "tabela-de-produtos".
 *
 * Utiliza a anotação @Controller para indicar que é um controlador Spring MVC.
 * Mapeia a requisição GET para "/produtos" para o método getProdutos().
 * Usa a injeção de dependência (@Autowired) para obter uma instância de ProdutoService.
 * Adiciona uma lista de produtos ao modelo para ser usada na visualização "tabela-de-produtos".
 * Retorna o nome da visualização "tabela-de-produtos".
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    /**
     * Manipula a requisição GET para "/produtos" e retorna a visualização "tabela-de-produtos".
     *
     * @param model O modelo que será usado pela visualização.
     * @return O nome da visualização "tabela-de-produtos".
     */
    @GetMapping("/produtos")
    public String getProdutos(Model model) {
        List<Produto> listaProdutos = service.findAll();
        model.addAttribute("listaProdutos", listaProdutos);
        return "tabela-de-produtos";
    }
}
