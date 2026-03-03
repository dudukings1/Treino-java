package com.example.demo.services;

import java.util.List;

import com.example.demo.repository.ProdutosRepository;

public class ProdutosService {
    
    private final ProdutosRepository repo;

    public ProdutosService(ProdutosRepository repo) {
        this.repo = repo;
    }

    public List<com.example.demo.models.Produtos> findAll() {
        return repo.findAll();
    }
}
