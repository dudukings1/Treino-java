package com.example.demo.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "produtos")
public class Produtos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String categoria;
    private int quantidadeEmestoque;
    public Produtos() {
    }
    public Produtos(String nome, String descricao,
                    double preco, int quantidade,
                    String categoria, int quantidadeEmestoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.quantidadeEmestoque = quantidadeEmestoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getQuantidadeEmestoque() {
        return quantidadeEmestoque;
    }
    public void setQuantidadeEmestoque(int quantidadeEmestoque) {
        this.quantidadeEmestoque = quantidadeEmestoque;
    }
    
    



@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produtos produto)) return false;
    return id != null && id.equals(produto.id);
}









} 
    

