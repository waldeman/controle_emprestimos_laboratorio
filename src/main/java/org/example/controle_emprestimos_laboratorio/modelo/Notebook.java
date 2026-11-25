package org.example.controle_emprestimos_laboratorio.modelo;

public class Notebook extends Itens{
    public Notebook(String nome, int diasEmprestados) {
        super(nome, 7, diasEmprestados);
    }

    @Override
    public double calcularMulta() {
        int dias = getDiasEmprestados();
        double multa = 0;
        while(dias > getPrazo()){
            multa += 5.0;
            dias--;
        }
        return multa;
        
    }
}
