package com.sistemaalunos.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletarAlunoServlet extends HttpServlet {

    private AlunoService alunoService = AlunoService.getInstance();  // Singleton de AlunoService

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParam = request.getParameter("id");

        // Verifica se o id está presente e é válido
        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("listarAlunos");
            return;
        }

        try {
            int id = Integer.parseInt(idParam);
            alunoService.deletarAluno(id);

            // Redireciona para a página de listagem após a exclusão
            response.sendRedirect("listarAlunos");

        } catch (NumberFormatException e) {
            // Se o id não for válido, redireciona para a listagem de alunos
            response.sendRedirect("listarAlunos");
        }
    }
}
