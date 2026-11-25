package org.example.controle_emprestimos_laboratorio.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivos {
    public static List<List<String>> transformarArquivoEmMatriz(String caminhoArquivo) throws IOException {
        List<List<String>> matrizAcervo = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.charAt(0) == '#'){
                    continue;
                }
                List<String> linhaSplit = List.of(linha.split(";"));
                matrizAcervo.add(linhaSplit);
            }
        }catch (IOException e){
            throw new IOException("Não foi possível acessar o arquivo");
        }
        return matrizAcervo;

    }
}
