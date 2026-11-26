package org.example.controle_emprestimos_laboratorio.servico;

import org.example.controle_emprestimos_laboratorio.modelo.Item;
import org.example.controle_emprestimos_laboratorio.modelo.KitDeComponentes;
import org.example.controle_emprestimos_laboratorio.modelo.Notebook;
import org.example.controle_emprestimos_laboratorio.persistencia.Salvar;

import java.io.IOException;

public class CadastrarItem {
    public void cadastrarItemNoArquivo(Item item) throws IOException {
        String tipo;
        if (item instanceof Notebook) {
            tipo = "Notebook";
        } else if (item instanceof KitDeComponentes) {
            tipo = "Kit de componentes";
        } else {
            tipo = "Projetor";
        }
        String patrimonio = item.getPatrimonio();
        String descricao = item.getDescricao();
        Salvar.salvar(tipo, patrimonio, descricao, "dados/acervo.csv");
    }
}
