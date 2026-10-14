package br.com.mediascolar.model;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private ArrayList<Materia> materias = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void adicionarMateria(Materia materia) {
        materias.add(materia);
    }
}