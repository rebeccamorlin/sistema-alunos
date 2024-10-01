package com.sistemaalunos.controller;

import com.sistemaalunos.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private List<Aluno> listaAlunos;
    
    // Singleton - instância estática
    private static AlunoService instance;

    // Construtor privado para Singleton
    private AlunoService() {
        listaAlunos = new ArrayList<>();
        // Exemplo de aluno inicial, para teste
        Aluno alunoTeste = new Aluno(1, "Aluno Teste", "teste@teste.com", "Curso Teste", 2020);
        listaAlunos.add(alunoTeste);
        System.out.println("Aluno de teste adicionado: " + alunoTeste.getNome());
    }

    // Método para obter a instância Singleton
    public static AlunoService getInstance() {
        if (instance == null) {
            instance = new AlunoService();
        }
        return instance;
    }

    // Método para listar alunos
    public List<Aluno> listarAlunos() {
        System.out.println("Número de alunos cadastrados: " + listaAlunos.size());
        for (Aluno aluno : listaAlunos) {
            System.out.println("Aluno: " + aluno.getNome() + ", Email: " + aluno.getEmail());
        }
        return listaAlunos;
    }

    // Método para adicionar alunos
    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno.getNome() + ", Email: " + aluno.getEmail());
    }

    // Método para atualizar aluno
    public void atualizarAluno(Aluno alunoAtualizado) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getId() == alunoAtualizado.getId()) {
                listaAlunos.set(i, alunoAtualizado);
                System.out.println("Aluno atualizado: " + alunoAtualizado.getNome());
                break;
            }
        }
    }

    // Método para deletar aluno
    public void deletarAluno(int id) {
        listaAlunos.removeIf(aluno -> aluno.getId() == id);
        System.out.println("Aluno removido com ID: " + id);
    }

    // Método para buscar aluno por ID
    public Aluno buscarAluno(int id) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getId() == id) {
                System.out.println("Aluno encontrado: " + aluno.getNome());
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado com ID: " + id);
        return null;
    }

    // Método para gerar um novo ID com base no tamanho da lista
    public int gerarNovoId() {
        int novoId = listaAlunos.size() + 1;
        System.out.println("Novo ID gerado: " + novoId);
        return novoId;
    }
}
