package org.example.controle_emprestimos_laboratorio.servico;

import org.example.controle_emprestimos_laboratorio.modelo.Item;
import org.example.controle_emprestimos_laboratorio.modelo.KitDeComponentes;
import org.example.controle_emprestimos_laboratorio.modelo.Notebook;
import org.example.controle_emprestimos_laboratorio.modelo.Projetor;
import org.example.controle_emprestimos_laboratorio.persistencia.LerArquivos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InicialiazarItens {
    public List<Item> inicializarItens() throws IOException {
        List<Item> itens = new ArrayList<>();
        List<List<String>> matriz = LerArquivos.transformarArquivoEmMatriz("dados/acervo.csv");
        for (List<String> linha : matriz) {
            if (linha.getFirst().equalsIgnoreCase("Notebook")){
                Notebook notebook = new Notebook(linha.get(1), linha.get(2));
                itens.add(notebook);
            }else if (linha.getFirst().equalsIgnoreCase("Projetor")){
                Projetor projetor = new Projetor(linha.get(1), linha.get(2));
                itens.add(projetor);
            }else if (linha.getFirst().equalsIgnoreCase("Kit de componentes")){
                KitDeComponentes kitDeComponentes = new KitDeComponentes(linha.get(1), linha.get(2));
                itens.add(kitDeComponentes);
            }
        }
        return itens;

    }
}
