package org.example.controle_emprestimos_laboratorio.modelo;

public abstract class Itens implements Mutavel{
    private String nome;
    private int prazo;
    private int diasEmprestados;

    public Itens(String nome, int prazo, int diasEmprestados) {
        this.nome = nome;
        this.prazo = prazo;
        this.diasEmprestados = diasEmprestados;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +" Prazo: " + this.prazo;
    }

    public int getPrazo() {
        return prazo;
    }

    public int getDiasEmprestados() {
        return diasEmprestados;
    }
}
