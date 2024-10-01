package com.sistemaalunos.model;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    private String curso;
    private int anoIngresso;

    // Construtor com id
    public Aluno(int id, String nome, String email, String curso, int anoIngresso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    // Construtor sem id
    public Aluno(String nome, String email, String curso, int anoIngresso) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
