package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ContactConfirm\" method=\"POST\">\n");
      out.write("            <label for=\"namae\">名前：</label>\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"name\">\n");
      out.write("            <label for=\"address\" >メールアドレス：</label>\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"Email\">\n");
      out.write("            <label for=\"otoiawose\" >お問い合わせの種類：</label>\n");
      out.write("            <select name=\"category\" size=\"3\">\n");
      out.write("                <option value=\"service\">サービスの不具合</option>\n");
      out.write("                <option value=\"individual\">個人情報</option>\n");
      out.write("                <option value=\"company\">企業について</option>\n");
      out.write("            </select>\n");
      out.write("            <label for=\"naiyou\" >お問い合わせ内容：</label>\n");
      out.write("            <textarea name=\"kanso\" rows=\"4\" cols=\"40\" placeholder=\"Contact\"></textarea>\n");
      out.write("            <input type=\"submit\" value=\"送信\"><input type=\"reset\" value=\"リセット\">\n");
      out.write("        </form>\n");
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
