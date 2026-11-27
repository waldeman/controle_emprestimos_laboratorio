package org.example.controle_emprestimos_laboratorio.modelo;

import java.time.LocalDate;

public class Notebook extends Item {
    public Notebook(String patrimonio ,String descricao) {
        super(descricao, patrimonio, 7);
    }

    @Override
    public double calcularMulta(LocalDate diaEmprestado) {
        LocalDate dataDeDevolucao = diaEmprestado.plusDays(getPrazo());
        double valorTotal = 0;
        while (dataDeDevolucao.isBefore(LocalDate.now())) {
            valorTotal += 5;
            dataDeDevolucao = dataDeDevolucao.plusDays(1);
        }
        return valorTotal;
    }
}
