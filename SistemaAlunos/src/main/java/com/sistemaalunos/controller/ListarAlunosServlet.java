package com.sistemaalunos.controller;

import com.sistemaalunos.model.Aluno;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListarAlunosServlet extends HttpServlet {

    private AlunoService alunoService = AlunoService.getInstance();  // Singleton de AlunoService

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtendo a lista de alunos
        List<Aluno> listaAlunos = alunoService.listarAlunos();

        // Enviando a lista de alunos para a página JSP
        request.setAttribute("listaAlunos", listaAlunos);

        // Encaminhando para a página listaAlunos.jsp
        request.getRequestDispatcher("view/listaAlunos.jsp").forward(request, response);
    }
}
