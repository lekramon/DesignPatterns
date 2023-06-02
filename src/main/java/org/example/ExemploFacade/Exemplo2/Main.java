package org.example.ExemploFacade.Exemplo2;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.cadastrar("Charopada", "Rua do Senac", 123);
        facade.adicionarProdutos("Bola de futebol", "Esporte", 10.0);
        facade.realizarPedido(1);
        facade.gerarCupomFiscal(1);
    }
}
