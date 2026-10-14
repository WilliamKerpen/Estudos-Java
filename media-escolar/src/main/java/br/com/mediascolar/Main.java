package br.com.mediascolar;

import br.com.mediascolar.model.Aluno;
import br.com.mediascolar.model.Materia;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno william = criarAluno("William");
        Aluno ana = criarAluno("Ana");

        adicionarMateria(william, "Matematica", 7.0, 8.0, 9.0);
        adicionarMateria(william, "Portugues", 6.0, 7.0, 8.0);

        adicionarMateria(ana, "Matematica", 9.0, 8.0, 7.0);
        adicionarMateria(ana, "Portugues", 10.0, 9.0, 8.0); 

        alunos.add(william);
        alunos.add(ana);

        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.nome);

            for (Materia materia : aluno.materias) {
                System.out.println("Materia: " + materia.nome);
                System.out.println("Notas: " + materia.notas);
                System.out.println("Media: " + materia.calcularMedia());
                System.out.println();
            }
        }
    }

    public static Aluno criarAluno(String nome) {
        Aluno aluno = new Aluno();
        aluno.nome = nome;
        return aluno;
    }
    
    public static void adicionarMateria(
        Aluno aluno,
        String nomeMateria,
        double... notas
    ) {
        Materia materia = new Materia();
        materia.nome = nomeMateria;

        for (double nota : notas) {
            materia.notas.add(nota);
        }

        aluno.materias.add(materia);
    }
}
