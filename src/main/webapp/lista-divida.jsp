<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>SisCob - Sistema de Cobrança</title>
</head>
<body>
 <center>
  <h1>Lista de dívidas</h1>
        <h2>
         <a href="new">Adicionar dvida</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">Listar todas        </h2>
 </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Lista de dívidas</h2></caption>
            <tr>
                <th>Nome</th>
                <th>Cargo</th>
                <th>Login</th>
                <th>Senha</th>
                <th>E-mail</th>
            </tr>
            <c:forEach var="debt" items="${listDebt}">
                <tr>
                    <td><c:out value="${debt.idCredor}" /></td>
                    <td><c:out value="${debt.dataAtualizacao}" /></td>
                    <td><c:out value="${debt.valorDivida}" /></td>
                    <td><c:out value="${debt.idDevedor}" /></td>
                    <td>
                     <a href="edit?idDivida=<c:out value='${debt.idDivida}' />">Editar</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?idDivida=<c:out value='${debt.idDivida}' />">Remover</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 
</body>
</html>