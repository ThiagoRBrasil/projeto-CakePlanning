package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class encomenda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <title>CakePlanning - Encomenda</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo-pagina.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo-cadastro.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"_css/estilo-botao.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"pagina\">\n");
      out.write("\n");
      out.write("            <header class=\"pagina-cabecalho\">\n");
      out.write("\n");
      out.write("                <a href=\"https://www.facebook.com/S%C3%A9rgia-Bolos-Confeitados-376127609260151/\" target=\"_blank\"><img id=\"menu-logo\" src=\"_imagem/menu-logo.png\"/></a>\n");
      out.write("                <img id=\"menu-bolo\" src=\"_imagem/menu-bolo.png\"/>\n");
      out.write("\n");
      out.write("                <nav id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><h3>CakePlanning</h3></li>\n");
      out.write("                        <li><a href=\"index.html\"><div><h4>Início</h4></div></a></li>\n");
      out.write("                        <li><a href=\"cadastro-componente-JSP.jsp\"><div class=\"paginaAtual\"><h4>Componente</h4></div></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div id=\"pagina-body\" class=\"pagina-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            &COPY; Copyright 2015\n");
      out.write("        </footer>\n");
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
