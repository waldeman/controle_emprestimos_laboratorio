package org.example.controle_emprestimos_laboratorio.modelo;

public abstract class Itens implements Mutavel{
    private String nome;
    private int prazo;


    public Itens(String nome, int prazo) {
        this.nome = nome;
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +" Prazo: " + this.prazo;
    }

    public int getPrazo() {
        return prazo;
    }

}
