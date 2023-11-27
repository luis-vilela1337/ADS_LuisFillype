package br.inatel.labs.padraoMVC.model.service;


import br.inatel.labs.padraoMVC.model.entity.Produto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private final List<Produto> listaProdutos = new ArrayList<Produto>();

    @PostConstruct
    private void setup(){
        Produto p1 = new Produto(1L, "Furadeira", 300.00);
        Produto p2 = new Produto(2L, "Lixadeira", 200.00);
        Produto p3 = new Produto(3L, "Serra circular", 500.00);
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }

    public List<Produto> findAll(){
        return this.listaProdutos;
    }
}
