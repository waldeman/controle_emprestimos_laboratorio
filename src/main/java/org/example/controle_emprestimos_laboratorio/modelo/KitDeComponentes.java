package org.example.controle_emprestimos_laboratorio.modelo;

public class KitDeComponentes extends Item {
    public KitDeComponentes(String descricao,String patrimonio) {

        super(descricao,patrimonio,15);
    }

    @Override
    public double calcularMulta(int  diasEmprestados) {
        return 0;
    }
}
