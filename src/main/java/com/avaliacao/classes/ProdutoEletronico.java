package com.avaliacao.classes;

public class ProdutoEletronico extends Produto implements calcularDesconto
{

    public ProdutoEletronico(String nome, double valor)
    {
        super(nome, valor);
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double getValorDesconto()
    {
        Double valorTotal=0.0;
        Double valorDesconto=0.0;
        Double valorPedido=0.0;
        valorTotal = this.valor;
        valorDesconto = valorTotal *0.50;
        valorPedido = valorTotal - valorDesconto;

        return valorPedido;
    }
}