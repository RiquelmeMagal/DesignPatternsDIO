package com.example.orcamento;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private final List<Item> itens = new ArrayList<>();

    public double getValor() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }

    public List<Item> getItens() {
        return new ArrayList<>(itens);
    }

    public int getTotalItens() {
        return itens.size();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }
}
