package org.example.controle_emprestimos_laboratorio.modelo;

public class Notebook extends Itens{
    public Notebook(String nome, int diasEmprestados) {
        super(nome, 7, diasEmprestados);
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
