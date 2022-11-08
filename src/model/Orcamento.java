package model;

import utils.Formatacao;

import java.math.BigDecimal;

import static utils.Formatacao.formatarEmReais;

public class Orcamento {
    private BigDecimal remuneracao;
    private BigDecimal comissao;
    private BigDecimal beneficios;
    private BigDecimal eventuais;
    private BigDecimal horasExtras;
    private BigDecimal judiciais;
    private BigDecimal tetoRedutor;
    private BigDecimal IRRF;
    private BigDecimal contribPrev;
    private BigDecimal totalLiquido;
    private BigDecimal proventos;

    public BigDecimal getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(BigDecimal remuneracao) {
        this.remuneracao = remuneracao;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    public BigDecimal getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(BigDecimal beneficios) {
        this.beneficios = beneficios;
    }

    public BigDecimal getEventuais() {
        return eventuais;
    }

    public void setEventuais(BigDecimal eventuais) {
        this.eventuais = eventuais;
    }

    public BigDecimal getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(BigDecimal horasExtras) {
        this.horasExtras = horasExtras;
    }

    public BigDecimal getJudiciais() {
        return judiciais;
    }

    public void setJudiciais(BigDecimal judiciais) {
        this.judiciais = judiciais;
    }

    public BigDecimal getTetoRedutor() {
        return tetoRedutor;
    }

    public void setTetoRedutor(BigDecimal tetoRedutor) {
        this.tetoRedutor = tetoRedutor;
    }

    public BigDecimal getIRRF() {
        return IRRF;
    }

    public void setIRRF(BigDecimal IRRF) {
        this.IRRF = IRRF;
    }

    public BigDecimal getContribPrev() {
        return contribPrev;
    }

    public void setContribPrev(BigDecimal contribPrev) {
        this.contribPrev = contribPrev;
    }

    public BigDecimal getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(BigDecimal totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public BigDecimal getProventos() {
        return proventos;
    }

    public void setProventos(BigDecimal proventos) {
        this.proventos = proventos;
    }

    @Override
    public String toString() {
        return
                "REMUNERAÇÃO = '" + formatarEmReais(remuneracao) + '\'' +
                "COMISSÃO = '" + formatarEmReais(comissao) + '\'' +
                "BENEFÍCIOS = '" + formatarEmReais(beneficios) + '\'' +
                "EVENTUAIS = '" + formatarEmReais(eventuais) + '\'' +
                "HORAS EXTRAS = '" + formatarEmReais(horasExtras) + '\'' +
                "JUDICIAIS = '" + formatarEmReais(judiciais) + '\'' +
                "TETO REDUTOR = '" + formatarEmReais(tetoRedutor) + '\'' +
                "IRRF = '" + formatarEmReais(IRRF) + '\'' +
                "CONTRIBUIÇÃO = '" + formatarEmReais(contribPrev) + '\'' +
                "TOTAL LIQUIDO = '" + formatarEmReais(totalLiquido) + '\'' +
                "PROVENTOS = '" + formatarEmReais(proventos) + '\'' +
                "\n";
    }
}
