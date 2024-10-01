<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <title>Alunos Cadastrados</title>
      <link rel="stylesheet" type="text/css" href="view/style.css?<%= System.currentTimeMillis() %>">
</head>
<body>
   <h2>Alunos Cadastrados</h2>
   <table border="1">
       <tr>
           <th>ID</th>
           <th>Nome</th>
           <th>Email</th>
           <th>Curso</th>
           <th>Ano de Ingresso</th>
           <th>Ações</th>
       </tr>
       <c:forEach var="aluno" items="${listaAlunos}">
           <tr>
               <td>${aluno.id}</td>
               <td>${aluno.nome}</td>
               <td>${aluno.email}</td>
               <td>${aluno.curso}</td>
               <td>${aluno.anoIngresso}</td>
               <td>
                   <a href="editarAluno?id=${aluno.id}">Editar</a> |
                   <a href="deletarAluno?id=${aluno.id}">Deletar</a>
               </td>
           </tr>
       </c:forEach>
   </table>
   <br>
   <form action="adicionarAluno" method="get">
       <input type="submit" value="Adicionar Novo Aluno">
   </form>
</body>
</html>
