<%-- 
    Document   : cadastro-cliente
    Created on : 26/11/2015, 15:14:48
    Author     : Ivina
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="br.com.cakeplanning.util.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>CakePlanning - Componente</title>

        <link rel="stylesheet" type="text/css" href="_css/estilo-pagina.css"/>
        <link rel="stylesheet" type="text/css" href="_css/estilo-cadastro.css"/>
        <link rel="stylesheet" type="text/css" href="_css/estilo-botao.css"/>
    </head>
    <body>
        <div class="pagina">

            <a href="https://www.facebook.com/S%C3%A9rgia-Bolos-Confeitados-376127609260151/" target="_blank"><img id="menu-logo" src="_imagem/menu-logo.png"/></a>
            <img id="menu-bolo" src="_imagem/menu-bolo.png"/>

            <header class="pagina-cabecalho">

                <nav id="menu">
                    <ul>
                        <li><h3>CakePlanning</h3></li>
                        <li><a href="index.html"><div><h4>Início</h4></div></a></li>
                        <li><a href="cadastro-componente-JSP.jsp"><div class="paginaAtual"><h4>Componente</h4></div></a></li>
                    </ul>
                </nav>

            </header>

            <div class="pagina-body">

                <div id="pagina-body">

                    <h1>Cadastro de Cliente</h1>

                    <div id="tb-cadastro-user" class="tabela-cadastro">
                        <font class="letraTitulo">Cadastro
                        </font>
                        <% HibernateUtil.getSessionFactory().openSession();%>
                        <form method="post" action="<%=request.getContextPath()%>/ServletCadastroComponente">

                            <jsp:useBean id="formaDao" class="br.com.cakeplanning.cadastro.componente.dao.FormaDAO"/>

                            <font class="letraDestaque"> Cliente:
                                <input id="novoCliente" name="novoCliente" type="text"/>
                            </font>
                            <br/><br/>

                            <font class="letraDestaque"> Endereço</font>
                            <br/>
                            <font class="letra"> Rua:
                                <input id="novaRua" name="novaRua" type="text" />
                            </font>
                            <br/>
                            <font class="letra"> Numero: 
                                <input id="novoNumero" name="novoNumero" type="number" />
                            </font>
                            <br/>
                            <font class="letra"> Bairro: 
                                <input id="novoBairro" name="novoBairro" type="text"/>
                            </font>
                            <br/><br/>
                            
                            <font class="letraDestaque"> Telefone: 
                                <input id="novoTelefone" name="novoTelefone" type="number" />
                            </font>
                            <br/><br/>

                            <button name="btCad" class="">Cadastrar</button>
                            </form>

                    </div>
                </div>
            </div>
        </div>
        <footer>
            &COPY; Copyright 2015
        </footer>
    </body>
</html>

