package org.example.controle_emprestimos_laboratorio.modelo;

public class KitDeComponentes extends Itens{
    public KitDeComponentes(String nome) {
        super(nome, 15);
    }

    @Override
    public double calcularMulta(int  diasEmprestados) {
        return 0;
    }
}
