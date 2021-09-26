package br.com.alura.modelo;

import java.time.LocalDate;

public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;
    private int idade;
    private String numeroEleitor;
    private LocalDate dataCadastro = LocalDate.now();

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, int idade, String numeroEleitor) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numeroEleitor = numeroEleitor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroEleitor() {
        return numeroEleitor;
    }

    public void setNumeroEleitor(String numeroEleitor) {
        this.numeroEleitor = numeroEleitor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

}
