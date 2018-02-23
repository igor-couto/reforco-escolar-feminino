package com.example.igorf.concursando.Modelo;

import java.util.List;

/**
 * Created by igorf on 20/02/2018.
 */

public class Perfil {

    private String nome;
    private String sobrenome;
    private String descricao;
    List<String> disciplinasDeInteresse;

    //region Singleton

    private static final Perfil instance = new Perfil();

    public static Perfil getInstance() {
        return instance;
    }

    private Perfil() {}

    //endregion

}
