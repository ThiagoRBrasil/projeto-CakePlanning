<%-- 
    Document   : relatorio
    Created on : 22/11/2015, 20:12:47
    Author     : trbra
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="br.com.cakeplanning.util.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>

        <link type="text/css" rel="stylesheet" href="_css/estilo-pagina.css"/>
        <link type="text/css" rel="stylesheet" href="_css/estilo-botao.css"/>
    </head>
    <body>
        <div class="pagina">

            <header class="pagina-cabecalho">

                <a href="https://www.facebook.com/S%C3%A9rgia-Bolos-Confeitados-376127609260151/" target="_blank"><img id="menu-logo" src="_imagem/menu-logo.png"/></a>
                <img id="menu-bolo" src="_imagem/menu-bolo.png"/>

                <nav id="menu">
                    <ul><!-- Links Menu - CakePlanning -->
                        <li><a href="index.html"><div class="paginaAtual"><h4>Início</h4></div></a></li>
                        <li><a href="cadastro-componente-JSP.jsp"><div><h4>Componente</h4></div></a></li>
                    </ul>
                </nav>

            </header>
            <div class="pagina-body">
                <div class="relatorioTXT">
                    <p align="center" style="font-size: 30px">RELATORIO</p>
                    <form>
                        <% HibernateUtil.getSessionFactory().openSession();%>
                        <jsp:useBean id="recheioDao" class="br.com.cakeplanning.cadastro.componente.dao.RecheioDAO"/>

                        <table border="1px" align="center" style="margin-top: 100px">
                            <tr><td>Test de Recheios</td></tr>
                            <c:forEach items="${recheioDao.listar()}" var="itemRecheio" >
                                <tr><td> ${itemRecheio.nome} </td></tr>
                            </c:forEach>
                        </table>
                    </form>
                </div>

            </div>
        </div>
        <footer>
            &COPY; Copyright 2015
        </footer>
    </body>
</html>
