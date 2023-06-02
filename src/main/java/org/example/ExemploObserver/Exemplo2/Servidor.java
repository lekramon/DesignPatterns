package org.example.ExemploObserver.Exemplo2;

import java.util.ArrayList;
import java.util.List;


public class Servidor implements Subject {
    private List<Observer> listaPessoas;

    public Servidor() {
        this.listaPessoas = new ArrayList<>();
    }

    @Override
    public void notificar(String mensagem, Observer observer) {
        for (Observer pessoa : listaPessoas) {
            if (pessoa != observer) {
                pessoa.atualizar(observer, mensagem);
            }
        }
    }

    @Override
    public void adicionar(Observer observer) {
        listaPessoas.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        listaPessoas.remove(observer);
    }
}