package org.example.ExemploObserver;

public class NaveInimiga implements Observer {

    private String nome;

    public NaveInimiga(String nome, Subject subject) {
        this.nome = nome;
        subject.adObserver(getInstance());
    }

    private NaveInimiga getInstance() {
        return this;
    }


    @Override
    public void atualizar(Acoes acao) {
        System.out.println(nome + " - " + acao);
    }
}
