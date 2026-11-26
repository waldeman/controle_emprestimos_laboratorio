package org.example.controle_emprestimos_laboratorio.modelo;

public class KitDeComponentes extends Item {
    public KitDeComponentes(String patrimonio, String descricao) {

        super(descricao,patrimonio,15);
    }

    @Override
    public double calcularMulta(int  diasEmprestados) {
        return 0;
    }
}
