<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
   <title>Editar Aluno</title>
<link rel="stylesheet" type="text/css" href="view/style.css?<%= System.currentTimeMillis() %>">
</head>
<body>
   <h2>Editar Aluno</h2>
   <form action="atualizarAluno" method="post">
       <input type="hidden" name="id" value="${aluno.id}">
       Nome: <input type="text" name="nome" value="${aluno.nome}" required><br>
       Email: <input type="email" name="email" value="${aluno.email}" required><br>
       Curso: <input type="text" name="curso" value="${aluno.curso}" required><br>
       Ano de Ingresso: <input type="number" name="anoIngresso" value="${aluno.anoIngresso}" required><br>
       <input type="submit" value="Atualizar">
   </form>
</body>
</html>
