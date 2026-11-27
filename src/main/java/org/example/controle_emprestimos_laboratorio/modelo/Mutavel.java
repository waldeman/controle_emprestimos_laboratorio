package org.example.controle_emprestimos_laboratorio.modelo;

import java.time.LocalDate;

public interface Mutavel {
    double calcularMulta(LocalDate diaEmprestado);
}
