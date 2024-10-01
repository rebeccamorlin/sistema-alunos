package com.sistemaalunos.controller;

import com.sistemaalunos.model.Aluno;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AtualizarAlunoServlet extends HttpServlet {

    private AlunoService alunoService = AlunoService.getInstance();  //  Singleton de AlunoService

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String curso = request.getParameter("curso");
        int anoIngresso = Integer.parseInt(request.getParameter("anoIngresso"));

        // Criando o aluno atualizado
        Aluno aluno = new Aluno(id, nome, email, curso, anoIngresso);

        // Atualizando o aluno via serviço
        alunoService.atualizarAluno(aluno);

        // Redirecionando para a listagem
        response.sendRedirect("listarAlunos");
    }
}
