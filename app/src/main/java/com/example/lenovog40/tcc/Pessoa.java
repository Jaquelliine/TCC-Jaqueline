package com.example.lenovog40.tcc;

/**
 * Created by Lenovo G40 on 30/04/2017.
 */

public class Pessoa {

    int _id;
    String nome;
    double telefone;
    String endereco;
    String email;
    String senha;
    int cpf;
    boolean nivelAcesso;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }


    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public boolean isNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(boolean nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
