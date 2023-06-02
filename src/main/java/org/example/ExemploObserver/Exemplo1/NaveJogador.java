package org.example.ExemploObserver.Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Subject {

    private List<Observer> listaObservers = new ArrayList<>();
    private Acoes acaoAtual;


    @Override
    public void adObserver(Observer observer) {
        listaObservers.add(observer);
    }

    @Override
    public void adAcoes(Acoes acao) {
        acaoAtual = acao;
        notificar();
    }

    @Override
    public void notificar() {
        for (Observer obs : listaObservers) {
            obs.atualizar(acaoAtual);
        }
    }
}
