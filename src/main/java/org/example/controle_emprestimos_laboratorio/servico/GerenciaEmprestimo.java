package org.example.controle_emprestimos_laboratorio.servico;

import org.example.controle_emprestimos_laboratorio.modelo.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenciaEmprestimo {
    private List<Emprestimo> emprestimos;

    public GerenciaEmprestimo() {
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public GerenciaEmprestimo(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public GerenciaEmprestimo(Emprestimo... emprestimos) {
        this.emprestimos = Arrays.asList(emprestimos);
    }

    public List<Emprestimo> getEmprestimo(){
        return this.emprestimos;
    }


    public Emprestimo adicionarEmprestimo(Pessoa pessoa, Item item, LocalDate date) {
        Emprestimo emprestimo = new Emprestimo(pessoa, item, date);
        for (Emprestimo emprestimo1: this.emprestimos) {
            if (emprestimo1.getPessoa().getMatricula().equals(emprestimo.getPessoa().getMatricula())
                    && emprestimo1.getItem().getPatrimonio().equals(emprestimo.getItem().getPatrimonio())) {
                return null;
            }
        }
        emprestimos.add(emprestimo);

        return emprestimo;
    }

    public String removerEmprestimo(Emprestimo emprestimo) {

        for (Emprestimo emprestimo1: emprestimos) {
            if (emprestimo1.equals(emprestimo)) {
                emprestimos.remove(emprestimo1);
                return "Empréstimo removido com sucesso";
            }
        }
        return "Empréstimo não encontrado";
    }
    public double calcularMulta(Emprestimo emprestimo) {

        for (Emprestimo emprestimo1: emprestimos) {
            if (emprestimo1.equals(emprestimo)) {
                return emprestimo1.getItem().calcularMulta(emprestimo1.getInicioDoEmprestimo());
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        InicialiazarItens inicialiazarItens = new InicialiazarItens();
        InicializarPessoas inicializarPessoas = new InicializarPessoas();
        List<Item> itens = List.of();
        List<Pessoa> pessoas = List.of();
        try {
           itens = inicialiazarItens.inicializarItens();
           pessoas = inicializarPessoas.inicializarPessoas();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        GerenciaEmprestimo gerenciaEmprestimo = new GerenciaEmprestimo();
        LocalDate date = LocalDate.of(2026, 11, 19);
        Pessoa pessoa = new Pessoa("Neymar", "1000");
        Notebook notebook = new Notebook("Path-555", "Acer Aspire 5");
        KitDeComponentes kitDeComponentes = new KitDeComponentes("path-3333", "CAixa de chaves");
        Projetor projetor = new Projetor("path-2222", "Projetor da sala 3");
        List<Emprestimo> emprestimos = new ArrayList<>();
        emprestimos.add(gerenciaEmprestimo.adicionarEmprestimo(pessoa, kitDeComponentes, date));
        emprestimos.add(gerenciaEmprestimo.adicionarEmprestimo(pessoa, notebook, date));
        emprestimos.add(gerenciaEmprestimo.adicionarEmprestimo(pessoa, projetor, date));
        for (Emprestimo emprestimo1: emprestimos) {
            System.out.println(gerenciaEmprestimo.calcularMulta(emprestimo1));
        }


    }
}
