<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
<c:if test="${empty sessionScope['loginUser']}">
    <c:redirect url="login.jsp" />
</c:if>
--%>

<html>
<head>
 <title>SisCob - Sistema de Cobrança</title>
</head>
<body>
 <center>
  <h1>Pagamento</h1>
        <h2>
         <a href="${pageContext.request.contextPath}/index.jsp">Home</a>
         &nbsp;&nbsp;&nbsp;
            <a href="novoPagamento">Adicionar pagamento</a>
         &nbsp;&nbsp;&nbsp;
         <a href="listaPagamento">Listar todos</a>
         
        </h2>
 </center>
    <div align="center">
  <c:if test="${payment != null}">
   <form action="atualizaPagamento" method="post">
        </c:if>
        <c:if test="payment == null}">
   <form action="inserePagamento" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${payment != null}">
               Editar
              </c:if>
              <c:if test="${payment == null}">
               Adicioar pagamento
              </c:if>
             </h2>
            </caption>
          <c:if test="${payment != null}">
           <input type="hidden" name="idPagamento" value="<c:out value='${payment.idPagamento}' />" />
          </c:if>            
            <tr>
                <th>Divida </th>
                <td>
                 <input type="text" name="idDivida" size="45"
                   value="<c:out value='${payment.idDivida}' />"
                  />
                </td>
            </tr>
            <tr>
                <th>Data: </th>
                <td>
                 <input type="text" name="dataAtualizacao" size="45"
                   value="<c:out value='${payment.dataAtualizacao}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Valor </th>
                <td>
                 <input type="text" name="valorpago" size="15"
                   value="<c:out value='${payment.valorPago}' />"
                 />
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Salvar" />
             </td>
            </tr>
        </table>
        </form>
    </div> 
</body>
</html>