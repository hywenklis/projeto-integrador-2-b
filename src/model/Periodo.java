package model;

import model.Orcamento;

public class Periodo {
    private Orcamento orcamento;

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public String toString() {
        return "Periodo{" +
                "orcamento=" + orcamento +
                '}';
    }
}
