<%-- 
    Document   : encomenda
    Created on : 26/11/2015, 00:57:42
    Author     : Thiago Brasil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CakePlanning - Encomenda</title>

        <link rel="stylesheet" type="text/css" href="_css/estilo-pagina.css"/>
        <link rel="stylesheet" type="text/css" href="_css/estilo-cadastro.css"/>
        <link rel="stylesheet" type="text/css" href="_css/estilo-botao.css"/>

    </head>
    <body>
        <div class="pagina">

            <header class="pagina-cabecalho">

                <a href="https://www.facebook.com/S%C3%A9rgia-Bolos-Confeitados-376127609260151/" target="_blank"><img id="menu-logo" src="_imagem/menu-logo.png"/></a>
                <img id="menu-bolo" src="_imagem/menu-bolo.png"/>

                <nav id="menu">
                    <ul>
                        <li><h3>CakePlanning</h3></li>
                        <li><a href="index.html"><div><h4>Início</h4></div></a></li>
                        <li><a href="cadastro-componente-JSP.jsp"><div class="paginaAtual"><h4>Componente</h4></div></a></li>
                    </ul>
                </nav>

            </header>

            <div id="pagina-body" class="pagina-body">
                <h1>Aqui será o local da encomenda</h1>
                <div id="tb-cadastro-user" class="tabela-cadastro">
                    Cliente <input/>
                    <div>
                        Endereço <input/><br/>
                        Contato <input/>
                    </div>
                    <button>Avançar</button>
                </div>

            </div>
        </div>
        <footer>
            &COPY; Copyright 2015
        </footer>
    </body>
</html>
