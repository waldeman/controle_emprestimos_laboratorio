package org.example.controle_emprestimos_laboratorio.modelo;

import java.time.LocalDate;

public class Projetor extends Item {
    public Projetor(String patrimonio, String descricao) {

        super(descricao , patrimonio, 2);
    }

    @Override
    public double calcularMulta(LocalDate diaEmprestado) {
        LocalDate dataDeEntrega = diaEmprestado.plusDays(getPrazo());
        double valorTotal = 0;
        double valorInicial = 10;
        while (dataDeEntrega.isBefore(LocalDate.now())) {
            valorTotal += valorInicial;
            valorInicial += 5;
            dataDeEntrega = dataDeEntrega.plusDays(1);
        }

        return valorTotal;
    }
}
