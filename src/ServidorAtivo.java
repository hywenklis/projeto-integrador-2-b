import java.time.LocalDate;

public class ServidorAtivo extends Pessoa {
    private LocalDate periodo;
    private float remuneracao;
    private float comissao;
    private float beneficios;
    private float eventuais;
    private float horasExtras;
    private float judiciais;
    private float tetoRedutor;
    private float IRRF;
    private float contribPrev;
    private float totalLiquido;
    private Orgao orgao;

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(float beneficios) {
        this.beneficios = beneficios;
    }

    public float getEventuais() {
        return eventuais;
    }

    public void setEventuais(float eventuais) {
        this.eventuais = eventuais;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

    public float getJudiciais() {
        return judiciais;
    }

    public void setJudiciais(float judiciais) {
        this.judiciais = judiciais;
    }

    public float getTetoRedutor() {
        return tetoRedutor;
    }

    public void setTetoRedutor(float tetoRedutor) {
        this.tetoRedutor = tetoRedutor;
    }

    public float getIRRF() {
        return IRRF;
    }

    public void setIRRF(float IRRF) {
        this.IRRF = IRRF;
    }

    public float getContribPrev() {
        return contribPrev;
    }

    public void setContribPrev(float contribPrev) {
        this.contribPrev = contribPrev;
    }

    public float getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(float totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }
}