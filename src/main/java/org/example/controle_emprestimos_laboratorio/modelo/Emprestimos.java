package org.example.controle_emprestimos_laboratorio.modelo;

import java.util.ArrayList;
import java.util.List;

public class Emprestimos {
    private List<Emprestimo> emprestimos;

    public Emprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = new ArrayList<>(emprestimos);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void removerEmprestimo() {
    }
}
