package org.example.ExemploObserver.Exemplo2;

public class Main {
    public static void main(String[] args) {
        Subject servidor = new Servidor();
        Observer pessoa1 = new Pessoa("Gerson", 12, servidor);
        Observer pessoa3 = new Pessoa("Anna", 142, servidor);
        pessoa3.escrever("Bom dia!", servidor);
        Observer pessoa2 = new Pessoa("Sandra", 2, servidor);
        pessoa3.escrever("Olá!", servidor);
    }
}
