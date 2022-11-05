package model;

import java.util.List;

public class Detalhes {
    private List<Periodo> periodos;
    private String vinculo;

    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public String toString() {
        return "Detalhes{" +
                "periodos=" + periodos +
                ", vinculo='" + vinculo + '\'' +
                '}';
    }
}
