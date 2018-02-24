package com.example.igorf.concursando.Modelo;

/**
 * Created by igorcouto on 15/02/2018.
 */

public class Professor {
    private String nome;
    private String descricao;
    private String[] disciplinas;
    private int classificacao;
	private bool disponibilidadeVisita;

    public Professor(){}

    //region GETS E SETS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    //endregion


}
