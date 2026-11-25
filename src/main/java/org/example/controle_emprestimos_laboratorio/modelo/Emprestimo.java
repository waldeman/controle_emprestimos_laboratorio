package org.example.controle_emprestimos_laboratorio.modelo;

public class Emprestimo {
    private Pessoa pessoa;
    private Item item;
    private int diasEmprestado;

    public Emprestimo(Pessoa pessoa, Item item) {
        this.pessoa = pessoa;
        this.item = item;
    }

    public Emprestimo (Pessoa pessoa, Item item, int diasEmprestado) {
        this(pessoa, item);
        this.diasEmprestado = diasEmprestado;
    }

    public int getDiasEmprestado() {
        return diasEmprestado;
    }

    public void setDiasEmprestado(int diasEmprestado) {
        this.diasEmprestado = diasEmprestado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
