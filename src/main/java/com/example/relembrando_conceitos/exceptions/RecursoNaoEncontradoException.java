package com.example.relembrando_conceitos.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException {
    public RecursoNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
