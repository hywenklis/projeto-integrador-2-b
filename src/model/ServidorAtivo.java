package model;

import enums.Orgao;

public class ServidorAtivo extends Pessoa {
    private String cargo;
    private String funcao;
    private Orgao orgaoSigla;
    private String nomeOrgaoCompleto;
    private Detalhes detalhes;

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

    public Detalhes getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Detalhes detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "ServidorAtivo{" +
                "\n nome='" + getNome() + '\'' +
                "\n, cpf='" + getCpf() + '\'' +
        		"\n, cargo='" + cargo + '\'' +
                "\n, funcao='" + funcao + '\'' +
                "\n, orgaoSigla=" + orgaoSigla +
                "\n, nomeOrgaoCompleto='" + nomeOrgaoCompleto + '\'' +
                "\n, detalhes=" + detalhes +
                '}';
    }
}