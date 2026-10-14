package br.com.mediascolar.model;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private ArrayList<Materia> materias = new ArrayList <>();

    public Strin getNome(){
        return nome;
    }

    public ArrayList<Materia> getMaterias(){
        return materias;
    }

}