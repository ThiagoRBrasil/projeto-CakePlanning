<%-- 
    Document   : cadastro-componente-JSP
    Created on : 02/11/2015, 13:52:48
    Author     : Thiago Brasil
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
        <link rel="stylesheet" type="text/css" href="_css/estilo-letras.css"/>
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

                <h1>Veja os Componentes de Seu Bolo</h1>
                <p>Componentes que irão compor seu Bolo</p>

                <div id="tb-cadastro-user" class="tabela-cadastro">
                    <h1 class="centralizarText">Componentes</h1>

                    <% HibernateUtil.getSessionFactory().openSession();%>
                    <form method="post" action="<%=request.getContextPath()%>/ServletCadastroComponente">

                        <jsp:useBean id="formaDao" class="br.com.cakeplanning.cadastro.componente.dao.FormaDAO"/>

                        <p>Forma:

                            <select name="cxSelecaoForma">
                                <option>Nenhum</option>
                                <c:forEach items="${formaDao.listar()}" var="itemForma" >
                                    <option> ${itemForma.nome} </option>
                                </c:forEach>
                            </select>
                            <input id="novaForma" name="novaForma" type="text" placeholder="Informe aqui a nova Forma"/>
                        </p>
                        <br/>

                        <jsp:useBean id="massaDao" class="br.com.cakeplanning.cadastro.componente.dao.MassaDAO"/>

                        <p>Massa:
                            <select name="cxSelecaoMassa">
                                
                                <option>Nenhum</option>
                                <c:forEach items="${massaDao.listar()}" var="itemMassa" >
                                    <option> ${itemMassa.nome} </option>
                                </c:forEach>
                            </select><br/>
                            <input class="btnInp" id="novaMassa" name="novaMassa" type="text" placeholder="Informe aqui a nova Massa"/>
                        </p>
                        <br/>

                        <jsp:useBean id="recheioDao" class="br.com.cakeplanning.cadastro.componente.dao.RecheioDAO"/>

                        <p>Recheio:
                            <select name="cxSelecaoRecheio">
                                <option>Nenhum</option>
                                <c:forEach items="${recheioDao.listar()}" var="itemRecheio" >
                                    <option> ${itemRecheio.nome} </option>
                                </c:forEach>
                            </select>
                            <input id="novoRecheio" name="novoRecheio" type="text" placeholder="Informe aqui o novo Recheio"/>
                        </p>
                        <br/>

                        <jsp:useBean id="tamanhoDao" class="br.com.cakeplanning.cadastro.componente.dao.TamanhoDAO"/>

                        <p>Tamanho:
                            <select name="cxSelecaoTamanho">
                                <option>Nenhum</option>
                                <c:forEach items="${tamanhoDao.listar()}" var="itemTamanho" >
                                    <option> ${itemTamanho.nome} </option>
                                </c:forEach>
                            </select>
                            <input id="novoTamanho" name="novoTamanho" type="text" placeholder="Informe aqui o novo Tamanho"/>
                        </p>

                        <button name="btSalvar" class="btnExe btn">Salvar</button>
                        <button name="btAlterar" class="btnAlt btn">Alterar</button>
                        <button name="btDeletar" class="btnDel btn">Deletar</button> 
                    </form>

                </div>
            </div>
        </div>
        <footer>
            &COPY; Copyright 2015
        </footer>
    </body>
</html>
