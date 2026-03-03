package com.example.demo.services;

import com.example.demo.models.Produtos;
import com.example.demo.repository.ProdutosRepository;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    private final ProdutosRepository repo;

    public ProdutosService(ProdutosRepository repo) {
        this.repo = repo;
    }

    public List<Produtos> findAll() {
        return repo.findAll();
    }
    public Produtos save(Produtos produto) {
        return repo.save(produto);
    }
    public void delete(Long id) {
        repo.deleteById(id);
    }
    public Produtos findbyid(long id) {
        return repo.findById(id).orElse(null);
    }
    
}