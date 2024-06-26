package com.example.impostos;

import com.example.orcamento.Orcamento;

public class ICPP extends TemplateImpostosCondicional {
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
