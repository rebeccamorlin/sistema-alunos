package com.sistemaalunos.listener;

import com.sistemaalunos.controller.AlunoService;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AlunoServiceListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Inicializa o AlunoService como Singleton
        AlunoService alunoService = AlunoService.getInstance();

        // Armazena a instância do AlunoService no contexto da aplicação
        sce.getServletContext().setAttribute("alunoService", alunoService);

        System.out.println("AlunoService iniciado e adicionado ao contexto da aplicação.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Aqui você pode adicionar código para limpar ou fechar recursos ao destruir a aplicação
        System.out.println("Contexto da aplicação destruído.");
    }
}
