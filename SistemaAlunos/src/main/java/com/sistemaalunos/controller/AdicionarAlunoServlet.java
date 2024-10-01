package com.sistemaalunos.controller;

import com.sistemaalunos.model.Aluno;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdicionarAlunoServlet extends HttpServlet {

    private AlunoService alunoService = AlunoService.getInstance();  // Padrão Singleton

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Método POST chamado");

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String curso = request.getParameter("curso");
        int anoIngresso = Integer.parseInt(request.getParameter("anoIngresso"));

        // Verificando os parâmetros
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Curso: " + curso);
        System.out.println("Ano de Ingresso: " + anoIngresso);

        Aluno novoAluno = new Aluno(alunoService.gerarNovoId(), nome, email, curso, anoIngresso);
        alunoService.adicionarAluno(novoAluno);

        // Redireciona para a página de listgem de alunos
        response.sendRedirect("listarAlunos");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Apenas encaminha para o formulário de adição de aluno
        request.getRequestDispatcher("view/adicionarAluno.jsp").forward(request, response);
    }
}
