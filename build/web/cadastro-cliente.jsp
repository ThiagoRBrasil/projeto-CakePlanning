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
        <link rel="stylesheet" type="text/css" href="_css/estilo-letras.css"/>
    </head>
    <body>
        <div class="pagina">

            <a href="https://www.facebook.com/S%C3%A9rgia-Bolos-Confeitados-376127609260151/" target="_blank"><img id="menu-logo" src="_imagem/menu-logo.png"/></a>
            <img id="menu-bolo" src="_imagem/menu-bolo.png"/>

            <header class="pagina-cabecalho">

                <nav id="menu">
                    <ul>
                        <li><a href="index.html"><div><h4>Início</h4></div></a></li>
                        <li><a href="cadastro-componente.jsp"><div><h4>Componente</h4></div></a></li>
                    </ul>
                </nav>

            </header>

            <div id="pagina-body" class="pagina-body">

                <h1>Cadastro Cliente</h1>

                <div id="tb-cadastro-user" class="tabela-cadastro">
                    <h1 class="letraTitulo centralizarText">Cadastro</h1>

                    <form method="post" action="<%=request.getContextPath()%>/ServletCadastroUsuario">

                        <div class="flutuarEsquerda" style="max-width: 30px">
                            <label for="novoCliente" class="letraDestaque tituloCliente">Cliente</label>

                            <br/><br/>

                            <label class="letraDestaque">Endereço</label>

                            <br/>

                            <label for="novaRua" class="letra">Rua</label>

                            <br/>

                            <font class="letra"> Número</font>

                            <br/>

                            <label for="novoBairro" class="letra">Bairro</label>

                            <br/><br/>

                            <label for="novoTelefone" class="letraDestaque">Telefone</label>
                        </div>

                        <div class="flutuarDireita">
                            <input id="novoCliente" name="novoCliente" type="text" class="caixaDeTexto caixaDeTextoGrande espacamentoGrande"/>
                            <button name="btnVerificar" class="btn btnMenor">Verificar</button>
                            <br/>
                            <input id="novaRua" name="novaRua" type="text" class="caixaDeTexto caixaDeTextoGrande"/>    
                            <br/>                    
                            <input id="novoNumero" name="novoNumero" type="text" placeholder=" XXXX-XXXX"class="caixaDeTexto caixaDeTextoPequena"/> 
                            <br/>  
                            <input id="novoDDDTelefone" name="novoDDDTelefone" type="text" class="caixaDeTexto caixaDeTextoGrande"/>
                            <br/><br/>  
                            <input id="novoTelefone" name="novoTelefone" type="text" placeholder=" X-XXXX-XXXX" class="caixaDeTexto caixaDeTextoPequena"/>
                        </div>


                        <br/><br/>

                        <button name="btnConcluir" class="btn btnMenor btnDel">Concluir</button>
                    </form>

                </div>
            </div>
        </div>
        <footer>
            &COPY; Copyright 2015
        </footer>
    </body>
</html>

