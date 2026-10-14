package br.com.mediascolar.model;

import java.util.ArrayList;

public class Materia{

    String nome;
    ArrayList<Double> notas = new ArrayList<>();
    
    public String getNome(){
        return nome;
    }

    public ArrayList<Double> getNotas(){
        return notas;
    }

    public double calcularMedia(){
        
        if (notas.isEmpty()){
            return 0.0;
        }

        double soma = 0.0;

        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}