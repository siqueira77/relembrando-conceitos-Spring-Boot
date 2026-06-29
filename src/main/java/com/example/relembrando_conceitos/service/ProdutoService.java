package com.example.relembrando_conceitos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.relembrando_conceitos.model.Produto;
import com.example.relembrando_conceitos.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    public ProdutoService (ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscaPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Produto salvaProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
