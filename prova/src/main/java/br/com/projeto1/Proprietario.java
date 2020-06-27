package br.com.projeto1;

import java.util.Date;

public class Proprietario {

    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Endereco endereco;

    /*
    * 4- Os atributos nome, cpf e rg são obrigatórios (crie um construtor com esses parâmetros)
    * 14- Construtor alterado para informar o endereco
    * */
    public Proprietario(String nome, String cpf, String rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
