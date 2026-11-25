package org.example.controle_emprestimos_laboratorio.modelo;

public class Emprestimo {
    private Pessoa pessoa;
    private Itens item;
    private int diasEmprestado;

    public Emprestimo (Pessoa pessoa, Itens item, int diasEmprestado) {
        this.pessoa = pessoa;
        this.item = item;
        this.diasEmprestado = diasEmprestado;
    }
}
