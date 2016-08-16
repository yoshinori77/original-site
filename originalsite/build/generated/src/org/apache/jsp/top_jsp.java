package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body> \n");
      out.write("        <p>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"linkleft clearfix\"><a href=\"SearchChannel\">Search channel</a></div>\n");
      out.write("    <div class=\"linkleft clearfix\"><a href=\"CreateChannel\">Create channel</a></div>\n");
      out.write("    <div class=\"text clearfix\">Put<span>Out</span></div>\n");
      out.write("    <div class=\"linkright clearfix\"><a href=\"Login\">Log in</a></div>\n");
      out.write("    <div class=\"linkright clearfix\"><a href=\"SignUp\">Sign up</a></div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</p><br>\n");
      out.write("        \n");
      out.write("        <form action=\"SearchChannel\" method=\"GET\">\n");
      out.write("            <input type=\"text\" name=\"channelID\" value=\"\">\n");
      out.write("            <input type=\"submit\" class=\"btn btn-info\" name=\"btnSubmit\" value=\"送信\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <button type=\"button\" class=\"btn btn-info\">Info</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary btn-lg\">Large button</button>\n");
      out.write("        ");
//@ include file="footer.jsp" 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
