package org.example.controle_emprestimos_laboratorio.servico;

import org.example.controle_emprestimos_laboratorio.modelo.Pessoa;
import org.example.controle_emprestimos_laboratorio.persistencia.LerArquivos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InicializarPessoas {
    public List<Pessoa> inicializarPessoas() throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        List<List<String>> matriz = LerArquivos.transformarArquivoEmMatriz("dados/pessoas.csv");
        for (List<String> linha : matriz){
            Pessoa pessoa = new Pessoa(linha.get(1), linha.get(0));
            pessoas.add(pessoa);
        }
        return pessoas;
    }
}
