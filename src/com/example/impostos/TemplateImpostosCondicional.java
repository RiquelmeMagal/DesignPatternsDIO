package com.example.impostos;

import com.example.orcamento.Orcamento;

public abstract class TemplateImpostosCondicional implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        }
        return minimaTaxacao(orcamento);
    }

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);
}
