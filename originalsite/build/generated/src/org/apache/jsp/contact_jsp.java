package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"http://getbootstrap.com/examples/sticky-footer/sticky-footer.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--<div class=\"header\">\r\n");
      out.write("    <div class=\"linkleft clearfix\"><a href=\"SearchChannel\">Search channel</a></div>\r\n");
      out.write("    <div class=\"linkleft clearfix\"><a href=\"CreateChannel\">Create channel</a></div>\r\n");
      out.write("    <div class=\"text clearfix\">Put<span>Out</span></div>\r\n");
      out.write("    <div class=\"linkright clearfix\"><a href=\"Login\">Log in</a></div>\r\n");
      out.write("    <div class=\"linkright clearfix\"><a href=\"SignUp\">Sign up</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("    -->\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" style=\"margin: 0 auto;\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("        <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".target\">\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <a class=\"navbar-brand\" style=\"font-size: 20px;\">Put<span style=\"color: red;\">Out</span></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse target\">\r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"margin: 0 auto;\">\r\n");
      out.write("            <li><a href=\"Chat\">Search channel</a></li>\r\n");
      out.write("            <li><a href=\"CreateChannel\">Create channel</a></li>\r\n");
      out.write("            <li><a href=\"\">Log in</a></li>\r\n");
      out.write("            <li><a href=\"\">Sign up</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron\" style=\"margin-top: 50px;\">\n");
      out.write("            <form action=\"ContactConfirm\" id=\"buttonsArea\" method=\"POST\">\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"namae\">名前：</label>\n");
      out.write("                    <input type=\"text\" name=\"name\" placeholder=\"name\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"address\" >メールアドレス：</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                <label for=\"otoiawose\" >お問い合わせの種類：</label>\n");
      out.write("                    <select name=\"category\">\n");
      out.write("                        <option value=\"service\">サービスの不具合</option>\n");
      out.write("                        <option value=\"individual\">個人情報</option>\n");
      out.write("                        <option value=\"company\">企業について</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"address\" >件名：</label>\n");
      out.write("                    <input type=\"text\" name=\"subject\" placeholder=\"Subject\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"naiyou\" >お問い合わせ内容：</label>\n");
      out.write("                    <textarea name=\"message\" rows=\"4\" cols=\"40\" placeholder=\"Content\"></textarea>\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"送信\"><input type=\"reset\" value=\"リセット\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"navbar navbar-default nav navbar-fixed-bottom\" style=\"margin: 0 auto;\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"Contact\">Contact</a>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/originalsite\" style=\"font-size: 15px\"><span class=\"glyphicon glyphicon-home\"></span> トップへ戻る</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\" style=\"margin-right: 50px\">\r\n");
      out.write("        <div class=\"col-xs-1 navbar-right\"  style=\"margin: 0 auto;\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li class=\"col-xs-1\"><a href=\"\"><img src=\"asset/twitter-logo.png\" style=\"width: 20px;\"></a></li>\r\n");
      out.write("                <li class=\"col-xs-1\"><a href=\"\"><img src=\"asset/facebook-logo.jpg\" style=\"width: 20px;\"></a></li>\r\n");
      out.write("                <li class=\"col-xs-1\"><a href=\"\"><img src=\"asset/GooglePlus-Logo.png\" style=\"width: 20px;\"></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>");
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
