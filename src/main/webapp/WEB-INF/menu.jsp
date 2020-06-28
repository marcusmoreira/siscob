<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Administrador/css/style.css" type=text/css>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SisCob - Sistema de Cobrança</title>
    </head>
    <body>

      <div id="centro">
            <div><a>Cairu - TADAW 2020.1</a></div>

            <%--====INCIO MENU====--%>
            <div class="menu">
                <ul class="submenu">
                  <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>

                   <li><a href="#">Atividades</a>
                      <ul class="submenu">
                        <li><a href="${pageContext.request.contextPath}">Trocar Senha</a></li>
                      </ul>
                    </li>

                  <li><a href="#">Usuario</a>
                <ul class="submenu">
                     <li><a href="${pageContext.request.contextPath}/novoUsuario">Cadastro de usuario</a></li>
                     <li><a href="${pageContext.request.contextPath}/listaUsuario">Listar usuarios</a></li>
                </ul>
                    </li>
                    <li><a href="#">Pessoa</a>
                <ul class="submenu">
                     <li><a href="${pageContext.request.contextPath}/inserePessoa">Cadastro de pessoa</a></li>
                     <li><a href="${pageContext.request.contextPath}/listaPessoa">Listar pessoas</a></li>
                </ul>
                    </li>

                 <li><a href="#">Divida e pagamentos</a>
                    <ul class="submenu">
                     <li><a href="${pageContext.request.contextPath}/novaDivida">Incluir divida</a></li>
                     <li><a href="${pageContext.request.contextPath}/listaDivida">Listar dividas</a></li>
                     <li><a href="${pageContext.request.contextPath}/novoPagamento">Realizar pagamento</a></li>
                     <li><a href="${pageContext.request.contextPath}/listaPagamento">Listar pagamentos</a></li>
                     </li>
               </ul>
                    </div>
           <%--====FIM MENU====--%>

           <%--========**INÍCIO** Colocar o conteúdo========--%>



            <%--=========**FIM** Colocar o conteúdo==========--%>

            <div class="rodape">Marcus Moreira. Todos os direitos reservados©</div>
        </div>

    </body>
</html>