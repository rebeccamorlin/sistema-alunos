package com.sistemaalunos.controller;

import com.sistemaalunos.model.Aluno;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

public class EditarAlunoServlet extends HttpServlet {

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
            Aluno aluno = alunoService.buscarAluno(id);

            // Se não encontrar o aluno, redireciona para a lista
            if (aluno == null) {
                response.sendRedirect("listarAlunos");
                return;
            }

            // Define o aluno como atributo e encaminha para a página de edição
            request.setAttribute("aluno", aluno);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/editarAluno.jsp");
            dispatcher.forward(request, response);

        } catch (NumberFormatException e) {
            // Se o id não for válido, redireciona para a listagem de alunos
            response.sendRedirect("listarAlunos");
        }
    }
}
