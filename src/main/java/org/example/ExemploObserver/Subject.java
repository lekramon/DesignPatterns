package org.example.ExemploObserver;

public interface Subject {
    public void adObserver(Observer observer);

    public void adAcoes(Acoes acao);

    public void notificar();
}
