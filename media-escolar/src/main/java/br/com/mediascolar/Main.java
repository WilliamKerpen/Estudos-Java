package br.com.mediascolar;

import br.com.mediascolar.model.Aluno;
import br.com.mediascolar.model.Materia;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("William");

        Materia matematica = new Materia();
        matematica.setNome("Matemática");

        matematica.adicionarNota(7.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(9.0);

        aluno.adicionarMateria(matematica);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matéria: " + matematica.getNome());
        System.out.println("Média: " + matematica.calcularMedia());
    }
}