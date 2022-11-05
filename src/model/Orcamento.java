package model;

public class Orcamento {
    private String remuneracao;
    private String comissao;
    private String beneficios;
    private String eventuais;
    private String horasExtras;
    private String judiciais;
    private String tetoRedutor;
    private String IRRF;
    private String contribPrev;
    private String totalLiquido;
    private String proventos;

    public String getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(String remuneracao) {
        this.remuneracao = remuneracao;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getEventuais() {
        return eventuais;
    }

    public void setEventuais(String eventuais) {
        this.eventuais = eventuais;
    }

    public String getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(String horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getJudiciais() {
        return judiciais;
    }

    public void setJudiciais(String judiciais) {
        this.judiciais = judiciais;
    }

    public String getTetoRedutor() {
        return tetoRedutor;
    }

    public void setTetoRedutor(String tetoRedutor) {
        this.tetoRedutor = tetoRedutor;
    }

    public String getIRRF() {
        return IRRF;
    }

    public void setIRRF(String IRRF) {
        this.IRRF = IRRF;
    }

    public String getContribPrev() {
        return contribPrev;
    }

    public void setContribPrev(String contribPrev) {
        this.contribPrev = contribPrev;
    }

    public String getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(String totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public String getProventos() {
        return proventos;
    }

    public void setProventos(String proventos) {
        this.proventos = proventos;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "remuneracao='" + remuneracao + '\'' +
                ", comissao='" + comissao + '\'' +
                ", beneficios='" + beneficios + '\'' +
                ", eventuais='" + eventuais + '\'' +
                ", horasExtras='" + horasExtras + '\'' +
                ", judiciais='" + judiciais + '\'' +
                ", tetoRedutor='" + tetoRedutor + '\'' +
                ", IRRF='" + IRRF + '\'' +
                ", contribPrev='" + contribPrev + '\'' +
                ", totalLiquido='" + totalLiquido + '\'' +
                ", proventos='" + proventos + '\'' +
                '}';
    }
}
