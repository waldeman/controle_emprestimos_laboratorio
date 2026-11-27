package org.example.controle_emprestimos_laboratorio.modelo;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Item item;
    private LocalDate inicioDoEmprestimo;

    public Emprestimo(Pessoa pessoa, Item item) {
        this.pessoa = pessoa;
        this.item = item;
    }

    public Emprestimo (Pessoa pessoa, Item item,  LocalDate inicioDoEmprestimo) {
        this(pessoa, item);
       this.inicioDoEmprestimo = inicioDoEmprestimo;
    }

    public LocalDate getInicioDoEmprestimo() {
        return inicioDoEmprestimo;
    }

    public void setDiasEmprestado(LocalDate inicioDoEmprestimo) {

        this.inicioDoEmprestimo = inicioDoEmprestimo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Item getItem() {
        return item;
    }
}
