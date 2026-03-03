package com.example.demo.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.models.Produtos;
import com.example.demo.services.ProdutosService;


@RestController
@RequestMapping("/produtos")
public class ProdtosResources {
    
    private final ProdutosService service;

    public ProdtosResources(ProdutosService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Produtos>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Produtos> cadastrar(@RequestBody Produtos produto) {
        Produtos novoProduto = service.save(produto);
        return ResponseEntity.ok(novoProduto);
    }
    @DeleteMapping("/{id}") 
        public  ResponseEntity<Void> deletar(@PathVariable long id) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        }
    @GetMapping("/{id}")
    public ResponseEntity<Produtos> findById2(@PathVariable long id) {
        return ResponseEntity.ok(service.findbyid(id));
    }
}
