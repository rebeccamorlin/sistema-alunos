<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <title>Adicionar Aluno</title>
   <link rel="stylesheet" type="text/css" href="view/style.css?<%= System.currentTimeMillis() %>">
</head>
<body>
   <h2>Adicionar Novo Aluno</h2>
<form action="adicionarAluno" method="post">
   <label>Nome:</label>
   <input type="text" name="nome" required><br>
   <label>Email:</label>
   <input type="email" name="email" required><br>
   <label>Curso:</label>
   <input type="text" name="curso" required><br>
   <label>Ano de Ingresso:</label>
   <input type="number" name="anoIngresso" required><br>
   <input type="submit" value="Adicionar Aluno">
</form>
