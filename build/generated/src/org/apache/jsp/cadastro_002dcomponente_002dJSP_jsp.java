package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.cakeplanning.util.HibernateUtil;

public final class cadastro_002dcomponente_002dJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>CakePlanning - Componente</title>\n");
      out.write("\n");
      out.write("        <link href=\"_css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"_css/style-cadastro.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"pagina\">\n");
      out.write("\n");
      out.write("            <a href=\"https://www.facebook.com/S%C3%A9rgia-Bolos-Confeitados-376127609260151/\" target=\"_blank\"><img id=\"logo-menu\" src=\"_imagem/cartaosemfundo.png\"/></a>\n");
      out.write("            <img id=\"bolo-menu\" src=\"_imagem/bolo-menu-gnd.png\"/>\n");
      out.write("\n");
      out.write("            <header class=\"pagina-cabecalho\">\n");
      out.write("\n");
      out.write("                <nav id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><h3>CakePlanning</h3></li>\n");
      out.write("                        <li><a href=\"index.html\"><div><h4>Início</h4></div></a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"cadastro-componente-JSP.jsp\"><div class=\"paginaAtual\"><h4>Componente</h4></div></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"pagina-body\">\n");
      out.write("\n");
      out.write("                <div id=\"pagina-body\">\n");
      out.write("\n");
      out.write("                    <h1>Veja os Componentes de Seu Bolo</h1>\n");
      out.write("                    <p>Componentes que irão compor seu Bolo</p>\n");
      out.write("\n");
      out.write("                    <div id=\"tb-cadastro-user\" class=\"tabela-cadastro\">\n");
      out.write("                        <h1 class=\"centralizarText\">Componentes</h1>\n");
      out.write("\n");
      out.write("                        ");
 HibernateUtil.getSessionFactory().openSession(); 
      out.write("\n");
      out.write("                        ");
      br.com.cakeplanning.cadastro.componente.dao.FormaDAO formaDao = null;
      synchronized (_jspx_page_context) {
        formaDao = (br.com.cakeplanning.cadastro.componente.dao.FormaDAO) _jspx_page_context.getAttribute("formaDao", PageContext.PAGE_SCOPE);
        if (formaDao == null){
          formaDao = new br.com.cakeplanning.cadastro.componente.dao.FormaDAO();
          _jspx_page_context.setAttribute("formaDao", formaDao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("                        <p>Forma:\n");
      out.write("\n");
      out.write("                            <select name=\"cxSelecaoForma\">\n");
      out.write("                                <option>Nenhum</option>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <input id=\"novaForma\" name=\"novaForma\" type=\"text\" placeholder=\"Informe aqui a nova Forma\"/>\n");
      out.write("                        </p>\n");
      out.write("                        <br/>\n");
      out.write("\n");
      out.write("                        ");
      br.com.cakeplanning.cadastro.componente.dao.MassaDAO massaDao = null;
      synchronized (_jspx_page_context) {
        massaDao = (br.com.cakeplanning.cadastro.componente.dao.MassaDAO) _jspx_page_context.getAttribute("massaDao", PageContext.PAGE_SCOPE);
        if (massaDao == null){
          massaDao = new br.com.cakeplanning.cadastro.componente.dao.MassaDAO();
          _jspx_page_context.setAttribute("massaDao", massaDao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("                        <p>Massa:\n");
      out.write("                            <select name=\"cxSelecaoMassa\">\n");
      out.write("                                <option>Nenhum</option>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <input id=\"novaMassa\" name=\"novaMassa\" type=\"text\" placeholder=\"Informe aqui a nova Massa\"/>\n");
      out.write("                        </p>\n");
      out.write("                        <br/>\n");
      out.write("\n");
      out.write("                        ");
      br.com.cakeplanning.cadastro.componente.dao.RecheioDAO recheioDao = null;
      synchronized (_jspx_page_context) {
        recheioDao = (br.com.cakeplanning.cadastro.componente.dao.RecheioDAO) _jspx_page_context.getAttribute("recheioDao", PageContext.PAGE_SCOPE);
        if (recheioDao == null){
          recheioDao = new br.com.cakeplanning.cadastro.componente.dao.RecheioDAO();
          _jspx_page_context.setAttribute("recheioDao", recheioDao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("                        <p>Recheio:\n");
      out.write("                            <select name=\"cxSelecaoRecheio\">\n");
      out.write("                                <option>Nenhum</option>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <input id=\"novoRecheio\" name=\"novoRecheio\" type=\"text\" placeholder=\"Informe aqui o novo Recheio\"/>\n");
      out.write("                        </p>\n");
      out.write("                        <br/>\n");
      out.write("\n");
      out.write("                        ");
      br.com.cakeplanning.cadastro.componente.dao.TamanhoDAO tamanhoDao = null;
      synchronized (_jspx_page_context) {
        tamanhoDao = (br.com.cakeplanning.cadastro.componente.dao.TamanhoDAO) _jspx_page_context.getAttribute("tamanhoDao", PageContext.PAGE_SCOPE);
        if (tamanhoDao == null){
          tamanhoDao = new br.com.cakeplanning.cadastro.componente.dao.TamanhoDAO();
          _jspx_page_context.setAttribute("tamanhoDao", tamanhoDao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("                        <p>Tamanho:\n");
      out.write("                            <select name=\"cxSelecaoTamanho\">\n");
      out.write("                                <option>Nenhum</option>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            <input id=\"novoTamanho\" name=\"novoTamanho\" type=\"text\" placeholder=\"Informe aqui o novo Tamanho\"/>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <button class=\"btnExe btn\">Salvar</button>\n");
      out.write("                        <button class=\"btnAlt btn\">Alterar</button>\n");
      out.write("                        <!--<form method=\"GET\" action=\"/ServletController\">-->\n");
      out.write("                            <button name=\"btDelete\" class=\"btnDel btn\">Deletar</button>\n");
      out.write("                        <!--</form>-->\n");
      out.write(" \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            &COPY; Copyright 2000-2015\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${formaDao.listar()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("itemForma");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemForma.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${massaDao.listar()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("itemMassa");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemMassa.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${recheioDao.listar()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("itemRecheio");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemRecheio.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tamanhoDao.listar()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("itemTamanho");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemTamanho.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
