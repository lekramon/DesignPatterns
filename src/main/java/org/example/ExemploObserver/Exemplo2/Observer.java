package org.example.ExemploObserver.Exemplo2;

public interface Observer {
    void atualizar(Observer observer, String mensagem);

    void escrever(String mensagem, Subject servidor);
}


