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
    private Date accountCreationDate;

    public Pessoa() {
    }

    public Pessoa(String Nome, String CPF, String Email, String RG, String CEP) {
        this.numeroPessoa = Pessoa.counter;
        this.Nome = Nome;
        this.CPF = CPF;
        this.email = Email;
        this.RG = RG;
        this.CEP = CEP;
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

    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public String toString() {
        return "\nName: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nEmail: " + this.getEmail() +
                "\nRG: " + this.getRG() +
                "\nCEP: " + this.getCEP() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }

}