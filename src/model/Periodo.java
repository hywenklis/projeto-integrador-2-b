package model;

import java.time.LocalDate;

import model.Orcamento;

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
		return "Periodo {\norcamento='" + orcamento + "', \nperiodo='" + periodo + "'}";
	}
}
