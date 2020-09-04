package com.avaliacao.classes;

public class ProdutoAlimenticio extends Produto implements calcularDesconto
{

    public ProdutoAlimenticio(String nome, double valor)
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
        valorDesconto = valorTotal * 0.25;
        valorPedido = valorTotal - valorDesconto;

        return valorPedido;
    }

}
