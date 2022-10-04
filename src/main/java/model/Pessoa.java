package model;

import java.util.Date;

import utils.Utils;

public class Pessoa {

    private static int counter = 1;

    private int numeroPessoa;
    private String Nome;
    private String CPF;
    private String email;
    private String RG;
    private String CEP;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private Date accountCreationDate;

    // public Pessoa() {}

    public Pessoa(String Nome, String CPF, String Email, String RG, String CEP, String endereco, String Bairro,
            String cidade, String estado) {
        this.numeroPessoa = Pessoa.counter;
        this.Nome = Nome;
        this.CPF = CPF;
        this.email = Email;
        this.RG = RG;
        this.CEP = CEP;
        this.Endereco = endereco;
        this.Bairro = Bairro;
        this.Cidade = cidade;
        this.Estado = estado;
        this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setcpf(String cpf) {
        this.CPF = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Endereco = Estado;

    }

    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public String toString() {
        return "\nName: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nEmail: " + this.getEmail() +
                "\nRG: " + this.getRG() +
                "\nCEP: " + this.getCEP() +
                "\nEndereço" + this.getEndereco() +
                "\nCidade" + this.getCidade() +
                "\nEstado" + this.getEstado() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }

}