package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


import com.example.demo.models.Produtos;
import com.example.demo.repository.ProdutosRepository;

@Configuration
public class config implements org.springframework.boot.CommandLineRunner {
    
    @Autowired
    private ProdutosRepository produtosRepository;

    public void run(String... args) throws Exception {
        Produtos p1 = new Produtos("Notebook", "adas", 1200.00, 10, "as", 20);
        Produtos p2 = new Produtos("Mouse", "sem marca", 80.00, 5, "as", 15);
        produtosRepository.save(p1);
        produtosRepository.save(p2);
    }
}
