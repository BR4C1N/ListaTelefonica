package com.software.listatelefonica.entidades;

import java.util.Date;

public class Telefone {
    private Integer id;
    private String nome;
    private String dataNascimento;
    private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return (String.format("Nome: %s | Data Nascimento %s | Telefone: %s", nome, dataNascimento, telefone));
    }
}
