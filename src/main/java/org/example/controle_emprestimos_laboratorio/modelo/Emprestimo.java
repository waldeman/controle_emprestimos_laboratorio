package org.example.controle_emprestimos_laboratorio.modelo;

public class Emprestimo {
    private Pessoa pessoa;
    private Itens item;

    public Emprestimo (Pessoa pessoa, Itens item) {
        this.pessoa = pessoa;
        this.item = item;
    }
}
