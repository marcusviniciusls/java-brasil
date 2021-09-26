package br.com.alura.modelo;

public class Empresa {

    private Long id;
    private String nomeExibicao;
    private String razaoSocial;
    private String cnpj;

    public Empresa(String nomeExibicao, String cnpj) {
        this.nomeExibicao = nomeExibicao;
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
