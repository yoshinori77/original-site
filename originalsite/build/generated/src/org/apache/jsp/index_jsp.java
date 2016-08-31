package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer_home.jsp");
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\r\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"http://getbootstrap.com/examples/sticky-footer/sticky-footer.css\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body> \r\n");
      out.write("        <div class=\"container\">");
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
      out.write("            <li><a href=\"\" onclick=\"document.searchchannel.submit();return false;\">Search channel</a>\r\n");
      out.write("                <form name=\"searchchannel\" method=\"POST\" action=\"Chat\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"ac\" value=");
      out.print( (Integer)session.getAttribute("ac"));
      out.write(">\r\n");
      out.write("                </form></li>\r\n");
      out.write("            <li><a href=\"CreateChannel\">Create channel</a></li>\r\n");
      out.write("            <li><a href=\"\">Log in</a></li>\r\n");
      out.write("            <li><a href=\"\">Sign up</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("</div><br>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"PostComplete\" method=\"POST\">\r\n");
      out.write("            <input type=\"submit\" name=\"btnSubmit\" value=\"送信\">\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"wrap\">\r\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"7000\">\r\n");
      out.write("                <!-- Indicators -->\r\n");
      out.write("                <ol class=\"carousel-indicators\">\r\n");
      out.write("                  <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\" style=\"background: black\"></li>\r\n");
      out.write("                  <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\" style=\"background: black\"></li>\r\n");
      out.write("                  <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\" style=\"background: red\"></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("                \r\n");
      out.write("                <!--カルーセル-->\r\n");
      out.write("                <!-- Wrapper for slides -->\r\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                  <div class=\"item active\">\r\n");
      out.write("                    <img src=\"asset/makingisfun.jpg\" alt=\"photo1\" style=\"margin: 0 auto; display: block;\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                      <!--文章入れられる-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"item\">\r\n");
      out.write("                    <img src=\"asset/photo1.jpg\" alt=\"photo2\" style=\"margin: 0 auto; display: block\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                      <!--文章入れられる-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"item\">\r\n");
      out.write("                    <img src=\"asset/photo3.jpg\" alt=\"photo3\" style=\"margin: 0 auto; display: block\">\r\n");
      out.write("                    <div class=\"carousel-caption\">\r\n");
      out.write("                      <!--文章入れられる-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Controls -->\r\n");
      out.write("                <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\" style=\"margin: 0 0 0 10%; background: white\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\" style=\"color: black\"></span>\r\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\" style=\"margin: 0 10% 0 0; background: white\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\" style=\"color: black\"></span>\r\n");
      out.write("                  <span class=\"sr-only\">Next</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!--各プロジェクト-->\r\n");
      out.write("            <div class=\"container\" style=\"margin-top: 5%\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"jumbotron col-md-4 col-sm-4 col-xs-4\" style=\"display: inline-block; margin-left: 10%; padding: 10px 10px 10px 10px; border-radius: 10px\">\r\n");
      out.write("                        <a href=\"Chat\" style=\"text-decoration: none !important; color: black; font-size: 20px\">\r\n");
      out.write("                            <img src=\"asset/newCar.jpg\" style=\"display: block; margin: 0 auto; padding-bottom: 10px; border-radius: 15px\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"title\" style=\"padding-bottom: 30px;\">Super Car</div>\r\n");
      out.write("                                <div class=\"description\" style=\"padding-bottom: 10px\">It's a miracle car like a Delorean!! </div>\r\n");
      out.write("                                <div class=\"progress\">\r\n");
      out.write("                                    <div class=\"progress-bar progress-bar-success\" style=\"width: 50%; \"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"jumbotron col-md-4 col-sm-4 col-xs-4\" style=\"display: inline-block; margin-left: 15%; padding: 10px 10px 10px 10px; border-radius: 10px\">\r\n");
      out.write("                        <a href=\"Chat\" style=\"text-decoration: none; color: black; font-size: 20px\">\r\n");
      out.write("                            <img src=\"asset/newDrone.jpg\" style=\"display: block; margin: 0 auto; padding-bottom: 10px; border-radius: 15px\">\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <div class=\"title\" style=\"padding-bottom: 30px;\">Next Drone</div>\r\n");
      out.write("                                <div class=\"description\" style=\"padding-bottom: 10px\">Superb drone is higher than phantom!!</div>\r\n");
      out.write("                                <div class=\"progress\">\r\n");
      out.write("                                    <div class=\"progress-bar progress-bar-success\" style=\"width: 80%; \"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"navbar navbar-default nav navbar-fixed-bottom\" style=\"margin: 0 auto;\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"Contact\">Contact</a>\r\n");
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
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
