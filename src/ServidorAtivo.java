import java.math.BigDecimal;
import java.time.LocalDate;

public class ServidorAtivo extends Pessoa {
    private LocalDate periodo;
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
    private String vinculo;
    private String cargo;
    private String funcao;
    private Orgao orgaoSigla;
    private String nomeOrgaoCompleto;

    public LocalDate getPeriodo() {
        return periodo;
    }

    public void setPeriodo(LocalDate periodo) {
        this.periodo = periodo;
    }

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

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Orgao getOrgaoSigla() {
        return orgaoSigla;
    }

    public void setOrgaoSigla(Orgao orgaoSigla) {
        this.orgaoSigla = orgaoSigla;
    }

    public String getNomeOrgaoCompleto() {
        return nomeOrgaoCompleto;
    }

    public void setNomeOrgaoCompleto(String nomeOrgaoCompleto) {
        this.nomeOrgaoCompleto = nomeOrgaoCompleto;
    }

    @Override
    public String toString() {
        return "ServidorAtivo{" +
                " \n    periodo: " + periodo +
                ",\n    remuneracao: " + remuneracao +
                ",\n    comissao: " + comissao +
                ",\n    beneficios: " + beneficios +
                ",\n    eventuais: " + eventuais +
                ",\n    horasExtras: '" + horasExtras + '\'' +
                ",\n    judiciais: " + judiciais +
                ",\n    tetoRedutor: " + tetoRedutor +
                ",\n    IRRF: " + IRRF +
                ",\n    contribPrev: " + contribPrev +
                ",\n    totalLiquido: '" + totalLiquido + '\'' +
                ",\n    vinculo: '" + vinculo + '\'' +
                ",\n    cargo: '" + cargo + '\'' +
                ",\n    funcao: '" + funcao + '\'' +
                ",\n    orgao: " + orgaoSigla +
                ",\n    nome do orgao completo: " + nomeOrgaoCompleto +
                ",\n    nome: " + getNome() +
                ",\n    cpf: " + getCpf() +
                '}';
    }
}