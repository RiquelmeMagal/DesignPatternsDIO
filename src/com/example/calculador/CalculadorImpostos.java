package com.example.calculador;

import com.example.impostos.Imposto;
import com.example.orcamento.Orcamento;

public class CalculadorImpostos {
    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double impostoCalculado = imposto.calcula(orcamento);
        System.out.println(impostoCalculado);
    }
}
