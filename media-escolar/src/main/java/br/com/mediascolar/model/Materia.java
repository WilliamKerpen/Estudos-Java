package br.com.mediascolar.model;

import java.util.ArrayList;

public class Materia {

    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {

        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }
}