package org.example.controle_emprestimos_laboratorio.persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Salvar {
    public static void salvar(String tipo, String patrimonio, String descricao, String caminho) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho, true))){
            bufferedWriter.write(tipo + ";" + patrimonio + ";" + descricao);
        }catch (IOException e){
            throw new  IOException("Erro ao adicionar o item no arquivo!");
        }
    }
}
