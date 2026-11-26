package org.example.controle_emprestimos_laboratorio.modelo;

public abstract class Item implements Mutavel{
    private String descricao;
    private String patrimonio;
    private int prazo;


    public Item(String patrimonio, String descricao, int prazo) {
        this.descricao = descricao;
        this.patrimonio = patrimonio;

        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.descricao +" Prazo: " + this.prazo;
    }

    public int getPrazo() {
        return prazo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

}
