package com.software.listatelefonica.entidades;

import java.util.Date;

public class Telefones {
    private String nome;
    private Date dataNascimento;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return (String.format("Nome: %s | Data Nascimento %s | Telefone: %s", nome, dataNascimento.toString(), telefone));
    }
}
