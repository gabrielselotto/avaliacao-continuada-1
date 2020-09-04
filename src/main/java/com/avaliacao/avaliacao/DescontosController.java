package com.avaliacao.avaliacao;

import com.avaliacao.classes.Produto;
import com.avaliacao.classes.ProdutoAlimenticio;
import com.avaliacao.classes.ProdutoEletronico;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/descontos")
public class DescontosController
{
    private List<Produto> listaProdutos = new ArrayList<>();


    @GetMapping("/comprarAlimento/{nome}/{valor}")
    public void adicionarProdutoAlimenticio (@PathVariable String nome, @PathVariable Double valor)
    {
        ProdutoAlimenticio novoItem = new ProdutoAlimenticio(nome, valor);
        listaProdutos.add(novoItem);
    }

    @GetMapping("/comprarEletronico/{nome}/{valor}")
    public void adicionarProdutoEletronico (@PathVariable String nome, @PathVariable Double valor)
    {
        ProdutoEletronico novoItem = new ProdutoEletronico(nome, valor);
        listaProdutos.add(novoItem);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id)
    {
        listaProdutos.remove(id-1);
    }

    @GetMapping
    public List listarProdutos() {
        return listaProdutos;
    }
}

