package model;

import java.time.LocalDate;

public class Periodo {
    private Orcamento orcamento;
    private LocalDate periodo;

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public String toString() {
        return "\n" +
                "    \nPERIODO = '" + periodo.getYear() + "/" + periodo.getMonth().getValue() + "'" +
                "\n    ORÇAMENTO = '" + orcamento;
    }
}
