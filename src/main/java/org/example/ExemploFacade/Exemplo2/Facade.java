package org.example.ExemploFacade.Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    private Cliente cliente;
    private Endereco endereco;
    private Produto produto;

    private int count = 0;

    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Produto> listaProdutos = new ArrayList<>();


    public void cadastrar(String nome, String rua, int numero) {
        int autoIncrement = ++count;
        Endereco endereco = new Endereco(rua, numero);
        listaClientes.add(new Cliente(autoIncrement, nome, endereco));
    }

    public void adicionarProdutos(String nome, String categoria, double preco) {
        listaProdutos.add(new Produto(nome, categoria, preco));
    }

    public Cliente realizarPedido(int id) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (Cliente c : listaClientes) {
                if (c.id == id) {
                    return c;
                }
            }
        }
        return null;
    }

    public Cliente gerarCupomFiscal(int id) {
        for (Cliente c : listaClientes) {
            if (c.id == id) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Id : " + c.getId());
                System.out.println("Endereço: " + c.getEndereco().getRua() + ", Nº" + c.getEndereco().getNumero());
            }
        }
        for (Produto p : listaProdutos) {
            System.out.println("Produto: " + p.getNome());
            System.out.println("Valor: " + p.getPreco());
            System.out.println("Categoria: " + p.getCategoria());
        }
        return null;
    }
}

