package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_002dcliente_002dJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 br.com.cakeplanning.test test = new br.com.cakeplanning.test();
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"_css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"_css/style-cadastro.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"pagina\">\n");
      out.write("\n");
      out.write("            <header class=\"pagina-cabecalho\">\n");
      out.write("                <img id=\"bolo-menu\" src=\"_imagem/bolo-menu-gnd.png\"/>\n");
      out.write("\n");
      out.write("                <nav id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><h3>CakePlanning</h3></li>\n");
      out.write("                        <li><a href=\"index.html\"><div><h4>Início</h4></div></a></li>\n");
      out.write("                        <li><a href=\"cadastro-cliente-JSP.jsp\"><div><h4>Alterar Componente</h4></div></a></li>\n");
      out.write("                        <li><a href=\"cadastro-componente.html\"><div><h4>Cadastrar Componente</h4></div></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"pagina-body\">\n");
      out.write("                <div id=\"pagina-body\">\n");
      out.write("                    <h1>Área de Cadastro de Cliente</h1>\n");
      out.write("                    <p>Cadastre um novo cliente para seu sistema</p>\n");
      out.write("\n");
      out.write("                    <div id=\"tb-cadastro-user\" class=\"tabela-cadastro\">\n");
      out.write("                        <h1 id=\"tituloCliente\">Cadastrar Novo Cliente</h1>\n");
      out.write("                        <h2 id=\"tituloVerificaCliente\">Primeiramente verifique se o cliente já está cadastrado</h2>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        ");
      out.print( out.print("oi") );
      out.write("\n");
      out.write("\n");
      out.write("                        <form method=\"get\" action=\"");
      out.print( request.getContextPath());
      out.write("/controlerServlet\"> \n");
      out.write("\n");
      out.write("                            <input id=\"verificacaoCliente\" name=\"varificacaoCliente\" type=\"text\" placeholder=\"Informe o Nome do Cliente\"/>\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" name=\"btnVerifica\" class=\"btnExe\">Verificar</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            &COPY; Copyright 2000-2015\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
