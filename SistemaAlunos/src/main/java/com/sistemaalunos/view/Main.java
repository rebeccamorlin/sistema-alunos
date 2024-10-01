package com.sistemaalunos.view;

import com.sistemaalunos.model.Aluno;
import com.sistemaalunos.controller.AlunoService;

public class Main {
    public static void main(String[] args) {
        // Obtendo a instância Singleton de AlunoService
        AlunoService alunoService = AlunoService.getInstance();

        // Adicionando alunos
        Aluno aluno1 = new Aluno(1, "Carlos", "carlos01@gmail.com", "Engenharia", 2021);
        Aluno aluno2 = new Aluno(2, "Julia", "julia02@gmail.com", "Matemática", 2020);
        Aluno aluno3 = new Aluno(3, "Ana", "ana03@gmail.com", "História", 2019);

        alunoService.adicionarAluno(aluno1);
        alunoService.adicionarAluno(aluno2);
        alunoService.adicionarAluno(aluno3);

        // Listando alunos
        System.out.println("--- Lista de alunos após adição ---");
        for (Aluno aluno : alunoService.listarAlunos()) {
            System.out.println(aluno);
        }

        // Atualizando aluno
        Aluno alunoAtualizado = new Aluno(2, "Julia Updated", "julia_updated@gmail.com", "Matemática", 2020);
        alunoService.atualizarAluno(alunoAtualizado);

        // Listando alunos após atualização
        System.out.println("--- Lista de alunos após atualização ---");
        for (Aluno aluno : alunoService.listarAlunos()) {
            System.out.println(aluno);
        }

        // Deletando aluno
        alunoService.deletarAluno(3);

        // Listando alunos após remoção
        System.out.println("--- Lista de alunos após remoção ---");
        for (Aluno aluno : alunoService.listarAlunos()) {
            System.out.println(aluno);
        }
    }
}
