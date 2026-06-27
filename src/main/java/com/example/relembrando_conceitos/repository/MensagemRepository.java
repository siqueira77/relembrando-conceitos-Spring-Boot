package com.example.relembrando_conceitos.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String getmensagem(){
        return "Olá do repositorio";
    }
}
