package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jums.UserData;
import javax.servlet.http.HttpSession;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/header.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">-->\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            .header {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .header div {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                width: 100px;\r\n");
      out.write("                height: 50px;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .header .linkleft {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                float: left;\r\n");
      out.write("                list-style: none;\r\n");
      out.write("                width: 10%;\r\n");
      out.write("                margin-left: 2%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            a {\r\n");
      out.write("                color: black;\r\n");
      out.write("                font-family: Comic Sans MS, 游ゴシック;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("            a:hover {\r\n");
      out.write("                border-bottom: solid 5px;\r\n");
      out.write("                padding-bottom: 10px;\r\n");
      out.write("                \r\n");
      out.write("                transition: \r\n");
      out.write("                border-bottom: solid 5px;\r\n");
      out.write("                border-radius: 3px 4px 4px 3px;\r\n");
      out.write("                border-color: rgba(220, 220, 220, 1);\r\n");
      out.write("                -webkit-transition: padding-bottom 0.3s ease-out;\r\n");
      out.write("                -webkit-border-radius: 2px 2px 1px 1px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .header .text {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                float: left;\r\n");
      out.write("                list-style: none;\r\n");
      out.write("                width: 25%;\r\n");
      out.write("                margin: 0 10% 0 10%;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .header .linkright {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                float: left;\r\n");
      out.write("                style: none;\r\n");
      out.write("                width: 6%;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .text {\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("                font-family: Comic Sans MS;\r\n");
      out.write("            }\r\n");
      out.write("            .text:hover {\r\n");
      out.write("                animation: rumble 0.3s linear infinite;\r\n");
      out.write("            }\r\n");
      out.write("            @keyframes rumble{\r\n");
      out.write("                0%\t{transform:rotate(0deg)\ttranslate(0,0);}\r\n");
      out.write("                12.5%\t{transform:rotate(0.4deg)\ttranslate(2px,-2px);}\r\n");
      out.write("                25%\t{transform:rotate(0.8deg)\ttranslate(0px,2px);}\r\n");
      out.write("                37.5%\t{transform:rotate(0.4deg)\ttranslate(-2px,0);}\r\n");
      out.write("                50%\t{transform:rotate(0deg)\ttranslate(0,0);}\r\n");
      out.write("                62.5%\t{transform:rotate(-0.4deg)\ttranslate(2px,0);}\r\n");
      out.write("                75%\t{transform:rotate(-0.8deg)\ttranslate(0,2px);}\r\n");
      out.write("                87.5%\t{transform:rotate(-0.4deg)\ttranslate(-2px,-2px);}\r\n");
      out.write("                100%\t{transform:rotate(0deg)\ttranslate(0,0);}\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .text > span {\r\n");
      out.write("                color: red;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            div + * {\r\n");
      out.write("                margin-left: 2%;\r\n");
      out.write("                margin-right: 2%;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body> \r\n");
      out.write("        <p>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"linkleft clearfix\"><a href=\"ChannelList\">Search channel</a></div>\n");
      out.write("    <div class=\"linkleft clearfix\"><a href=\"CreateChannel\">Create channel</a></div>\n");
      out.write("    <div class=\"text clearfix\">Put<span>Out</span></div>\n");
      out.write("    <div class=\"linkright clearfix\"><a href=\"Login\">Log in</a></div>\n");
      out.write("    <div class=\"linkright clearfix\"><a href=\"SignUp\">Sign up</a></div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</p><br>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"ChannelList\" method=\"GET\">\r\n");
      out.write("            <input type=\"text\" name=\"channelID\" value=\"\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-info\" name=\"btnSubmit\" value=\"送信\">\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <button type=\"button\" class=\"btn btn-info\">Info</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary btn-lg\">Large button</button>\r\n");
      out.write("        ");
//@ include file="footer.jsp" 
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
