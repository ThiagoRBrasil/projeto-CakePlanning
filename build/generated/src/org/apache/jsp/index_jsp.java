package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/estilo-pagina.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/estilo-botao.css\"/>\n");
      out.write("\n");
      out.write("        <link rel='stylesheet' href='fullcalendar/fullcalendar.css' />\n");
      out.write("        <script src='fullcalendar/lib/jquery.min.js'></script>\n");
      out.write("        <script src='fullcalendar/lib/moment.min.js'></script>\n");
      out.write("        <script src='fullcalendar/fullcalendar.js'></script>\n");
      out.write("        <script src='fullcalendar/lang-all.js'></script>\n");
      out.write("\n");
      out.write("        <title>CakePlanning - Início</title>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#calendar')({\n");
      out.write("                    dayClick: function (date, jsEvent, view) {\n");
      out.write("\n");
      out.write("                        alert('Clicked on: ' + date.format());\n");
      out.write("\n");
      out.write("                        alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);\n");
      out.write("\n");
      out.write("                        alert('Current view: ' + view.name);\n");
      out.write("\n");
      out.write("                        // change the day's background color just for fun\n");
      out.write("                        $(this).css('background-color', 'red');\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id='calendar'></div>\n");
      out.write("    <h1>Hello World!</h1>\n");
      out.write("</body>\n");
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
