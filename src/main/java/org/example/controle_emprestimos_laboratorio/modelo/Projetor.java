package org.example.controle_emprestimos_laboratorio.modelo;

public class Projetor extends Item {
    public Projetor(String patrimonio, String descricao) {

        super(descricao , patrimonio, 2);
    }

    @Override
    public double calcularMulta(int diasEmprestados) {
        double valorTotal = 0;
        double valorInicial = 10;

        while (diasEmprestados > getPrazo()) {
            valorTotal += valorInicial;
            diasEmprestados--;
            valorInicial += 5;
        }
        return valorTotal;
    }
}
