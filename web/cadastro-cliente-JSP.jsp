<%-- 
    Document   : cadastro-cliente-JPS
    Created on : 22/10/2015, 15:26:43
    Author     : Thiago Brasil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>


        <link href="_css/style.css" rel="stylesheet"/>
        <link href="_css/style-cadastro.css" rel="stylesheet"/>
    </head>
    <body>

        <div class="pagina">

            <header class="pagina-cabecalho">
                <img id="bolo-menu" src="_imagem/bolo-menu-gnd.png"/>

                <nav id="menu">
                    <ul>
                        <li><h3>CakePlanning</h3></li>
                        <li><a href="index.html"><div><h4>Início</h4></div></a></li>
                        <li><a href="cadastro-cliente-JSP.jsp"><div><h4>Alterar Componente</h4></div></a></li>
                        <li><a href="cadastro-componente.html"><div><h4>Cadastrar Componente</h4></div></a></li>
                    </ul>
                </nav>

            </header>

            <div class="pagina-body">
                <div id="pagina-body">
                    <h1>Área de Cadastro de Cliente</h1>
                    <p>Cadastre um novo cliente para seu sistema</p>

                    <div id="tb-cadastro-user" class="tabela-cadastro">
                        <h1 id="tituloCliente">Cadastrar Novo Cliente</h1>
                        <h2 id="tituloVerificaCliente">Primeiramente verifique se o cliente já está cadastrado</h2>

                        <form method="get" action="<%= request.getContextPath()%>/controlerServlet"> 

                            <input id="verificacaoCliente" name="varificacaoCliente" type="text" placeholder="Informe o Nome do Cliente"/>

                            <button type="submit" name="btnVerifica" class="btnExe">Verificar</button>

                        </form>

                    </div>
                </div>
            </div>
        </div>
        <footer>
            &COPY; Copyright 2000-2015
        </footer>

    </body>
</html>
