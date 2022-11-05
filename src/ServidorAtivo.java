import java.time.LocalDate;

public class ServidorAtivo extends Pessoa {
    private LocalDate periodo;
    private Double remuneracao;
    private Double comissao;
    private Double beneficios;
    private Double eventuais;
    private String horasExtras;
    private Double judiciais;
    private Double tetoRedutor;
    private Double IRRF;
    private Double contribPrev;
    private String totalLiquido;
    private Orgao orgao;

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

    public Double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(Double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Double beneficios) {
        this.beneficios = beneficios;
    }

    public Double getEventuais() {
        return eventuais;
    }

    public void setEventuais(Double eventuais) {
        this.eventuais = eventuais;
    }

    public String getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(String horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double getJudiciais() {
        return judiciais;
    }

    public void setJudiciais(Double judiciais) {
        this.judiciais = judiciais;
    }

    public Double getTetoRedutor() {
        return tetoRedutor;
    }

    public void setTetoRedutor(Double tetoRedutor) {
        this.tetoRedutor = tetoRedutor;
    }

    public Double getIRRF() {
        return IRRF;
    }

    public void setIRRF(Double IRRF) {
        this.IRRF = IRRF;
    }

    public Double getContribPrev() {
        return contribPrev;
    }

    public void setContribPrev(Double contribPrev) {
        this.contribPrev = contribPrev;
    }

    public String getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(String totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }

    @Override
    public String toString() {
        return "ServidorAtivo{" +
                "periodo=" + periodo +
                ", remuneracao=" + remuneracao +
                ", comissao=" + comissao +
                ", beneficios=" + beneficios +
                ", eventuais=" + eventuais +
                ", horasExtras=" + horasExtras +
                ", judiciais=" + judiciais +
                ", tetoRedutor=" + tetoRedutor +
                ", IRRF=" + IRRF +
                ", contribPrev=" + contribPrev +
                ", totalLiquido=" + totalLiquido +
                ", orgao=" + orgao +
                ", nome=" + getNome() +
                ", cpf=" + getCpf() +
                '}';
    }
}