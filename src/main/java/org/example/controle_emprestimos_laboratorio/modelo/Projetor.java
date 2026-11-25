package org.example.controle_emprestimos_laboratorio.modelo;

public class Projetor extends Itens {
    public Projetor(String nome) {
        super(nome, 2);
    }

    @Override
    public double calcularMulta() {
        int dias = getDiasEmprestados();
        double valorTotal = 0;
        double valorInicial = 10;

        while (dias > getPrazo()) {
            valorTotal += valorInicial;
            dias--;
            valorInicial += 5;
        }
        return valorTotal;
    }
}
