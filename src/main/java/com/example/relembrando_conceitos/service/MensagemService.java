package com.example.relembrando_conceitos.service;

import org.springframework.stereotype.Service;

import com.example.relembrando_conceitos.repository.MensagemRepository;

@Service
public class MensagemService {
    private final MensagemRepository mensagemRepository;

    public MensagemService (MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String getMensagem(){
        return mensagemRepository.getmensagem();
    }
}
