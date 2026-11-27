package org.example.controle_emprestimos_laboratorio.modelo;

import java.time.LocalDate;

public class KitDeComponentes extends Item {
    public KitDeComponentes(String patrimonio, String descricao) {

        super(descricao,patrimonio,15);
    }

    @Override
    public double calcularMulta(LocalDate diaEmprestado) {
        return 0;
    }
}
