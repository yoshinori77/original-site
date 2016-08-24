package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.UserData;
import model.ViewHelper;
import javax.servlet.http.HttpSession;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    HttpSession hs = request.getSession();
    UserData ud = null;
    boolean reinput = false;
    // 戻るボタンからフォームされた場合
    if(request.getParameter("mode") != null && request.getParameter("mode").equals("REINPUT")){
        reinput = true;
        ud = (UserData)hs.getAttribute("ud"); 
   }
    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\"  type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JUMS登録画面</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" style=\"margin: 0 auto;\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("        <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".target\">\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <a href=\"/originalsite\" class=\"navbar-brand\" style=\"font-size: 20px;\">Put<span style=\"color: red;\">Out</span></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse target\">\r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"margin: 0 auto;\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"\" onclick=\"document.searchchannel.submit();return false;\">Search channel</a>\r\n");
      out.write("                <form name=\"searchchannel\" method=\"POST\" action=\"Chat\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"ac\" value=");
      out.print( (Integer)session.getAttribute("ac"));
      out.write(">\r\n");
      out.write("                </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"\" onclick=\"document.createchannel.submit();return false;\">Create channel</a>\r\n");
      out.write("                <form name=\"createchannel\" method=\"POST\" action=\"CreateChannel\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"ac\" value=");
      out.print( (Integer)session.getAttribute("ac"));
      out.write(">\r\n");
      out.write("                </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"\" onclick=\"document.login.submit();return false;\">Log in</a>\r\n");
      out.write("                <form name=\"login\" method=\"POST\" action=\"Login\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"ac\" value=");
      out.print( (Integer)session.getAttribute("ac"));
      out.write(">\r\n");
      out.write("                </form>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"\" onclick=\"document.signup.submit();return false;\">Sign up</a>\r\n");
      out.write("                <form name=\"signup\" method=\"POST\" action=\"Registrtion\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"ac\" value=");
      out.print( (Integer)session.getAttribute("ac"));
      out.write(">\r\n");
      out.write("                </form>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("    <div class=\"jumbotron\" style=\"margin-top: 50px;\">\n");
      out.write("        <form action=\"RegistrationConfirm\" method=\"POST\">\n");
      out.write("            <div class=\"row\" style=\"margin-left: 20px\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <label for=\"\">ユーザー名：</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"name\" placeholder=\"name\" style=\"width: 300px; margin-bottom: 10px\" value=\"");
 if(reinput){out.print(ud.getName());}
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <label for=\"\">パスワード：</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"password\" placeholder=\"password\" style=\"width: 300px; margin-bottom: 10px\" value=\"");
 if(reinput){out.print(ud.getPassword());}
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <label for=\"\">メールアドレス：</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"email\" style=\"width: 300px; margin-bottom: 10px\" value=\"");
 if(reinput){out.print(ud.getEmail());}
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <label for=\"\">住所：</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" name=\"address\" placeholder=\"address\" style=\"width: 300px; margin-bottom: 10px\" value=\"");
 if(reinput){out.print(ud.getAddress());}
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <label for=\"\">性別：</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"radio\" name=\"sex\" value=\"1\" checked=\"");
 if(reinput){if(ud.getSex() == 1){out.print("checked");}}
      out.write("\">男性\n");
      out.write("                    <input type=\"radio\" name=\"sex\" value=\"2\">女性\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <input type=\"hidden\" name=\"ac\"  value=\"");
      out.print( hs.getAttribute("ac"));
      out.write("\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" name=\"btnSubmit\" value=\"確認画面へ\" style=\"margin-top: 20px\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("        <br>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"navbar navbar-default nav navbar-fixed-bottom\" style=\"margin: 0 auto;\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/originalsite\" style=\"font-size: 15px\"><span class=\"glyphicon glyphicon-home\"></span> トップへ戻る</a>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"\" onclick=\"document.contact.submit();return false;\">Contact</a>\r\n");
      out.write("            <form name=\"contact\" method=\"POST\" action=\"Contact\">\r\n");
      out.write("                <input type=\"hidden\" name=\"ac\" value=");
      out.print( (Integer)session.getAttribute("ac"));
      out.write(">\r\n");
      out.write("            </form>\r\n");
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
