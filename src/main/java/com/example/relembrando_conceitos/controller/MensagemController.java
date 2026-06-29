package com.example.relembrando_conceitos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relembrando_conceitos.service.MensagemService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class MensagemController {
    public final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem() {
        return mensagemService.getMensagem();
    }
    
}
