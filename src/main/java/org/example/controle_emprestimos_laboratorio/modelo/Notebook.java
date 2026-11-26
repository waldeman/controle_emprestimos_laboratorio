package org.example.controle_emprestimos_laboratorio.modelo;

public class Notebook extends Item {
    public Notebook(String descricao,String patrimonio) {
        super(descricao, patrimonio, 7);
    }

    @Override
    public double calcularMulta(int diasEmprestados) {

        double multa = 0;
        while(diasEmprestados > getPrazo()){
            multa += 5.0;
            diasEmprestados--;
        }
        return multa;
        
    }
}
