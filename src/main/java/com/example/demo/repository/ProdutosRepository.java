package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}