package com.example;

import com.example.calculador.CalculadorImpostos;
import com.example.impostos.*;
import com.example.orcamento.Item;
import com.example.orcamento.Orcamento;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new Item("item 0", 50.0));
        orcamento.adicionaItem(new Item("item 1", 200.0));
        orcamento.adicionaItem(new Item("item 2", 250.0));

        CalculadorImpostos calculador = new CalculadorImpostos();

        System.out.println("ISS e ICMS");
        calculador.realizaCalculo(orcamento, new ISS());
        calculador.realizaCalculo(orcamento, new ICMS());

        System.out.println("ICPP e IKCV");
        calculador.realizaCalculo(orcamento, new ICPP());
        calculador.realizaCalculo(orcamento, new IKCV());
    }
}
