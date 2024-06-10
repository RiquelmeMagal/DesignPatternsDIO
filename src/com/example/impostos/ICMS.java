package com.example.impostos;

import com.example.orcamento.Orcamento;

public class ICMS implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
