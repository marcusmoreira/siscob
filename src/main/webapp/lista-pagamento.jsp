<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${empty sessionScope['loginUser']}">
    <c:redirect url="login.jsp" />
</c:if>

<html>
<head>
 <title>SisCob - Sistema de Cobrança</title>
</head>
<body>
 <center>
  <h1>Lista de pagamentos</h1>
        <h2>
         <a href="${pageContext.request.contextPath}/index.jsp">Home</a>
         &nbsp;&nbsp;&nbsp;
         <a href="new">Adicionar pagamento</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">Listar todos</h2>
 </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Lista de pagamentos</h2></caption>
            <tr>
                <th>Pagamento</th>
                <th>Divida</th>
                <th>Data</th>
                <th>Valor pago</th>
            </tr>
            <c:forEach var="payment" items="${listPayment}">
                <tr>
                    <td><c:out value="${debt.idPagamento}" /></td>
                    <td><c:out value="${debt.idDivida}" /></td>
                    <td><c:out value="${debt.dataAtualizacao}" /></td>
                    <td><c:out value="${debt.valorPago}" /></td>
                    <td>
                     <a href="edit?idPaymento=<c:out value='${payment.idPagamento}' />">Editar</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?idPayment=<c:out value='${payment.idPagamento}' />">Remover</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 
</body>
</html>