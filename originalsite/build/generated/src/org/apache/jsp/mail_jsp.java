package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>gmail api</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("        <!-- build:css(.tmp) styles/main.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("        <!-- endbuild -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 10]>\n");
      out.write("            <p class=\"browsehappy\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" id=\"authorizeArea\" style=\"display: none;\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <button id=\"authorize-button\" class=\"btn btn-default\">認可</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" id=\"buttonsArea\" style=\"display: none;\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"btn-group\">\n");
      out.write("                        <button id=\"getLabelButton\" type=\"button\" class=\"btn btn-default\">Labelの取得</button>\n");
      out.write("                        <button id=\"searchButton\" type=\"button\" class=\"btn btn-default\">検索</button>\n");
      out.write("                        <button id=\"createMessageButton\" type=\"button\" class=\"btn btn-default\">空メッセージの作成</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <pre id=\"result\"></pre>\n");
      out.write("                <div id=\"content\">あほかよ</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <p>♥ from the Yeoman team</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- build:js scripts/vendor.js -->\n");
      out.write("        <!-- bower:js -->\n");
      out.write("        <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("        <!-- endbower -->\n");
      out.write("        <!-- endbuild -->\n");
      out.write("\n");
      out.write("        <!-- build:js({app,.tmp}) scripts/main.js -->\n");
      out.write("        <script src=\"scripts/main.js\"></script>\n");
      out.write("        <!-- endbuild -->\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\" >\n");
      out.write("        var clientId = \"162183619368-c30sebmua09ifro40ickfc916b8ftehd.apps.googleusercontent.com\";\n");
      out.write("        var scopes = [\"https://mail.google.com/\"].join(\",\");\n");
      out.write("        //https://mail.google.com/スコープはすべての権限を持ったスコープだけど、Threadやメッセージの削除を行いたい場合のみに利用するべき\n");
      out.write("        //それ以外にいかが有る。\n");
      out.write("        //https://www.googleapis.com/auth/gmail.modify\n");
      out.write("        //https://www.googleapis.com/auth/gmail.readonly\n");
      out.write("        //https://www.googleapis.com/auth/gmail.compose \n");
      out.write("\n");
      out.write("        function handleClientLoad() {\n");
      out.write("            window.setTimeout(checkAuth,1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function checkAuth() {\n");
      out.write("            gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: true}, handleAuthResult);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function handleAuthResult(authResult) {\n");
      out.write("            var $authorizeArea = $(\"#authorizeArea\"),\n");
      out.write("            $buttonsArea = $(\"#buttonsArea\");\n");
      out.write("            if (authResult && !authResult.error) {\n");
      out.write("                //エラーがなければ認可ボタン消して操作ボタン群オープンする\n");
      out.write("                $authorizeArea.hide();\n");
      out.write("\n");
      out.write("                gapi.client.load(\"gmail\",\"v1\", function(){\n");
      out.write("\n");
      out.write("                $buttonsArea\n");
      out.write("                    .find(\"#getLabelButton\")\n");
      out.write("                        .on(\"click\", getLabel)\n");
      out.write("                    .end()\n");
      out.write("                    .find(\"#searchButton\")\n");
      out.write("                        .on(\"click\", search)\n");
      out.write("                    .end()\n");
      out.write("                    .find(\"#createMessageButton\")\n");
      out.write("                        .on(\"click\", createMessage)\n");
      out.write("                    .end()\n");
      out.write("                    .show();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            } else {\n");
      out.write("                $buttonsArea.hide();\n");
      out.write("                $authorizeArea\n");
      out.write("                    .find(\"#authorize-button\")\n");
      out.write("                        .on(\"click\", handleAuthClick)\n");
      out.write("                    .end()\n");
      out.write("                    .show();\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function handleAuthClick(event) {\n");
      out.write("            // Step 3: get authorization to use private data\n");
      out.write("            gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: false}, handleAuthResult);\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function getLabel() {\n");
      out.write("\n");
      out.write("            var $result = $(\"#result\");\n");
      out.write("\n");
      out.write("            gapi.client.gmail.users.labels.list({userId : \"me\"}).execute(function(result , rowData) {\n");
      out.write("                console.log(result,rowData);\n");
      out.write("                $result.text(rowData);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function search() {\n");
      out.write("            var $result = $(\"#result\");\n");
      out.write("            var searchText = window.prompt(\"検索文字列を入力して下さい\", \"label:inbox\");\n");
      out.write("\n");
      out.write("            if (!searchText) {\n");
      out.write("                $result.text(\"検索文字は何かしら入力して下さい\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            gapi.client.gmail.users.threads.list({\n");
      out.write("                userId:\"me\",\n");
      out.write("                q: searchText\n");
      out.write("            }).execute(function(result , rowData) {\n");
      out.write("                console.log(result,rowData);\n");
      out.write("                $result.text(rowData);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function createMessage() {\n");
      out.write("\n");
      out.write("\n");
      out.write("            var $result = $(\"#result\");\n");
      out.write("            var from = window.prompt(\"fromメールアドレスを入力して下さい。\", \"hoge@example.com\");\n");
      out.write("            var to = \"yoshinoriyamashita123@gmail.com\";\n");
      out.write("            var content = $(\"#content\").toString(10);\n");
      out.write("\n");
      out.write("\n");
      out.write("            var mimeData = \"From: \" + from+ \"\\n\" +\n");
      out.write("\"To: \" + to + \"\\n\" +\n");
      out.write("\"Subject: test\\n\" +\n");
      out.write("\"MIME-Version: 1.0\\n\" + \n");
      out.write("\"Content-Type: text/plain; charset=UTF-8\\n\" + \n");
      out.write("\"\\n\\n Test\" + content;\n");
      out.write("\n");
      out.write("            var b = window.btoa( unescape(encodeURIComponent( mimeData )) );\n");
      out.write("\n");
      out.write("            //users.message.insertだけはpostでrawデータを送る必要がある。\n");
      out.write("\n");
      out.write("            $.ajax(\"https://content.googleapis.com/gmail/v1/users/me/messages\", {\n");
      out.write("                dataType : \"json\",\n");
      out.write("                type : \"POST\",\n");
      out.write("                contentType : \"application/json\",\n");
      out.write("                data  : JSON.stringify({ raw : b}),\n");
      out.write("                headers : {\n");
      out.write("                    \"Authorization\" : \"Bearer \" + gapi.auth.getToken().access_token\n");
      out.write("                }\n");
      out.write("            }).done(function(result){\n");
      out.write("                console.log(result);\n");
      out.write("                $result.text(JSON.stringify(result, \"\", \"\\t\"));\n");
      out.write("                if (result && !result.error) {\n");
      out.write("                    window.alert(\"メールを保存しました。 Gmailにて「すべてのメールを見る」から確認して下さい。\")\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://apis.google.com/js/client.js?onload=handleClientLoad\"></script> <!-- ① -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
