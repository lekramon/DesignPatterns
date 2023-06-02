package org.example.ExemploObserver.Exemplo2;

public interface Subject {
    void notificar(String mensagem, Observer observer);

    void adicionar(Observer observer);

    void remover(Observer observer);
}


