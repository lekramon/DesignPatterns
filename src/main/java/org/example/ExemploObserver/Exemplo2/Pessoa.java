package org.example.ExemploObserver.Exemplo2;

public class Pessoa implements Observer {
    private String nome;
    private int id;
    private Subject servidor;

    public Pessoa(String nome, int id, Subject servidor) {
        this.nome = nome;
        this.id = id;
        this.servidor = servidor;
        this.servidor.adicionar(this);
    }

    @Override
    public void atualizar(Observer observer, String mensagem) {
        System.out.println(nome + " vê: " + mensagem);
    }

    @Override
    public void escrever(String mensagem, Subject servidor) {
        System.out.println(nome + " enviou: " + mensagem);
        servidor.notificar(mensagem, this);
    }
}