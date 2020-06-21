<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>SisCob - Sistema de Cobrança</title>
</head>
<body>
 <center>
  <h1>Pessoa</h1>
        <h2>
         <a href="new">Adicionar pessoa</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">Listar todos</a>
         
        </h2>
 </center>
    <div align="center">
  <c:if test="${people != null}">
   <form action="update" method="post">
        </c:if>
        <c:if test="${people == null}">
   <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${people != null}">
               Editar
              </c:if>
              <c:if test="${people == null}">
               Adicioar pessoa
              </c:if>
             </h2>
            </caption>
          <c:if test="${pessoa != null}">
           <input type="hidden" name="idPessoa" value="<c:out value='${people.idPessoa}' />" />
          </c:if>            
            <tr>
                <th>Nome: </th>
                <td>
                 <input type="text" name="nomePessoa" size="45"
                   value="<c:out value='${people.nomePessoa}' />"
                  />
                </td>
            </tr>
            <tr>
                <th>Endereço </th>
                <td>
                 <input type="text" name="endereco" size="45"
                   value="<c:out value='${people.endereco}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>UF: </th>
                <td>
                 <input type="text" name="uf" size="15"
                   value="<c:out value='${people.uf}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Telefone </th>
                <td>
                 <input type="text" name="telefone" size="15"
                   value="<c:out value='${people.telefone}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Documento: </th>
                <td>
                 <input type="text" name="documento" size="15"
                   value="<c:out value='${people.documento}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>E-mail </th>
                <td>
                 <input type="text" name="email" size="15"
                   value="<c:out value='${people.email}' />"
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