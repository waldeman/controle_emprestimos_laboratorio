package org.example.controle_emprestimos_laboratorio.servico;

import org.example.controle_emprestimos_laboratorio.modelo.Emprestimo;
import org.example.controle_emprestimos_laboratorio.modelo.Item;
import org.example.controle_emprestimos_laboratorio.modelo.Pessoa;

import java.io.IOException;
import java.util.List;

public class GerenciaEmprestimo {
    private List<Emprestimo> emprestimos;

    public GerenciaEmprestimo(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    public List<Emprestimo> getEmprestimo(){
        return this.emprestimos;
    }


    public String adicionarEmprestimo(Pessoa pessoa, Item item) {
        Emprestimo emprestimo = new Emprestimo(pessoa, item);
        for (Emprestimo emprestimo1: emprestimos) {
            if (emprestimo1.equals(emprestimo)) {
                return "Empréstimo já existe.";
            }
        }
        emprestimos.add(emprestimo);
        return "Empréstimo realizado com sucesso";
    }

    public String removerEmprestimo(Pessoa pessoa, Item item) {
        Emprestimo emprestimo = new Emprestimo(pessoa, item);
        for (Emprestimo emprestimo2: emprestimos) {
            if (emprestimo2.equals(emprestimo)) {
                emprestimos.remove(emprestimo);
                return "Empréstimo realizado com sucesso";
            }
        }
        return "Emprestimo não emcontrado";
    }

    public static void main(String[] args) {
        InicialiazarItens inicialiazarItens = new InicialiazarItens();
        InicializarPessoas inicializarPessoas = new InicializarPessoas();
        try {
            List<Item> itens = inicialiazarItens.inicializarItens();
            List<Pessoa> pessoas = inicializarPessoas.inicializarPessoas();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        GerenciaEmprestimo gerenciaEmprestimo = new GerenciaEmprestimo();

    }
}
