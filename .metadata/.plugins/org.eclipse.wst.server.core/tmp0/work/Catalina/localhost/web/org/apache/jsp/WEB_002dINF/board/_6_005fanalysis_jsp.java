/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-08-27 08:45:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _6_005fanalysis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/C:/my_STS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex00-1/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/my_STS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex00-1/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1534347006240L));
    _jspx_dependants.put("jar:file:/C:/my_STS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex00-1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar", Long.valueOf(1534600003402L));
    _jspx_dependants.put("jar:file:/C:/my_STS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex00-1/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1492493252000L));
    _jspx_dependants.put("jar:file:/C:/my_STS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex00-1/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1492493252000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<script src=\"vendor/bootstrap/js/d3.v3.js\"></script>\n");
      out.write("<script src=\"vendor/bootstrap/js/ldavis.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"vendor/bootstrap/css/lda.css\">\n");
      out.write("\n");
      out.write("<title>4조 사이트</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS-->\n");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom fonts for this template-->\n");
      out.write("<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("\n");
      out.write("<!-- Page level plugin CSS-->\n");
      out.write("<link href=\"vendor/datatables/dataTables.bootstrap4.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template-->\n");
      out.write("<link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    <title>6월 분석</title>\n");
      out.write("    <script src=\"vendor/bootstrap/js/6.d3.v3.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/6.ldavis.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/6.lda.css\" >\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-expand navbar-dark bg-dark static-top\">\n");
      out.write("\n");
      out.write("\t\t<a class=\"navbar-brand mr-1\" href=\"/web/\">4조 사이트</a>\n");
      out.write("\n");
      out.write("\t\t<button class=\"btn btn-link btn-sm text-white order-1 order-sm-0\"\n");
      out.write("\t\t\tid=\"sidebarToggle\" href=\"#\">\n");
      out.write("\t\t\t<i class=\"fas fa-bars\"></i>\n");
      out.write("\t\t</button>\n");
      out.write("\n");
      out.write("\t\t<!-- Navbar Search -->\n");
      out.write("\t\t<form\n");
      out.write("\t\t\tclass=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\n");
      out.write("\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search for...\"\n");
      out.write("\t\t\t\t\taria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("\t\t\t\t<div class=\"input-group-append\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-search\"></i>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t<!-- Navbar -->\n");
      out.write("\t\t<ul class=\"navbar-nav ml-auto ml-md-0\">\n");
      out.write("\t\t\t<li class=\"nav-item dropdown no-arrow mx-1\"><a\n");
      out.write("\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\"\n");
      out.write("\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\taria-expanded=\"false\"> <i class=\"fas fa-bell fa-fw\"></i> <span\n");
      out.write("\t\t\t\t\tclass=\"badge badge-danger\">9+</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\n");
      out.write("\t\t\t\t\taria-labelledby=\"alertsDropdown\">\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Action</a> <a\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("\t\t\t\t</div></li>\n");
      out.write("\t\t\t<li class=\"nav-item dropdown no-arrow mx-1\"><a\n");
      out.write("\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\"\n");
      out.write("\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\taria-expanded=\"false\"> <i class=\"fas fa-envelope fa-fw\"></i> <span\n");
      out.write("\t\t\t\t\tclass=\"badge badge-danger\">7</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\n");
      out.write("\t\t\t\t\taria-labelledby=\"messagesDropdown\">\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Action</a> <a\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("\t\t\t\t</div></li>\n");
      out.write("\t\t\t<li class=\"nav-item dropdown no-arrow\"><a\n");
      out.write("\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\"\n");
      out.write("\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\taria-expanded=\"false\"> <i class=\"fas fa-user-circle fa-fw\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\n");
      out.write("\t\t\t\t\taria-labelledby=\"userDropdown\">\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Settings</a> <a\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Activity Log</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\"\n");
      out.write("\t\t\t\t\t\tdata-target=\"#logoutModal\">Logout</a>\n");
      out.write("\t\t\t\t</div></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\t\t<!-- Sidebar -->\n");
      out.write("\t\t<ul class=\"sidebar navbar-nav\">\n");
      out.write("\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("\t\t\t\thref=\"/web/\"> <i\n");
      out.write("\t\t\t\t\tclass=\"fas fa-fw fa-tachometer-alt\"></i> <span>나만의 게시판</span>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link\" href=\"/web/\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-fw fa-chart-area\"></i> <span>URL 기사 분석</span>\n");
      out.write("\t\t\t</a></li>\t\n");
      out.write("\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/web/5_analysis\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-fw fa-chart-area\"></i> <span>18년 5월 토픽 키워드</span>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/web/6_analysis\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-fw fa-chart-area\"></i> <span>18년 6월 토픽 키워드</span>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/web/7_analysis\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-fw fa-chart-area\"></i> <span>18년 7월 토픽 키워드</span>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t<div id=\"content-wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("  \t\t\t\t  <div id = \"lda\"></div>\n");
      out.write("   \t\t\t\t <script>\n");
      out.write("     \t\t\t\t var vis = new LDAvis(\"#lda\", \"vendor/bootstrap/js/6.lda.json\");\n");
      out.write("    \t\t\t\t</script>\n");
      out.write("    \t\t\t\t<img src = \"analysisimg/6month.jpg\" height=838 width=782/>\n");
      out.write("  \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- Sticky Footer -->\n");
      out.write("\t\t\t<footer class=\"sticky-footer\">\n");
      out.write("\t\t\t\t<div class=\"container my-auto\">\n");
      out.write("\t\t\t\t\t<div class=\"copyright text-center my-auto\">\n");
      out.write("\t\t\t\t\t\t<span>Copyright Â© Your Website 2018</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\t<!-- Scroll to Top Button-->\n");
      out.write("\t<a class=\"scroll-to-top rounded\" href=\"#page-top\"> <i\n");
      out.write("\t\tclass=\"fas fa-angle-up\"></i>\n");
      out.write("\t</a>\n");
      out.write("\n");
      out.write("\t<!-- Logout Modal-->\n");
      out.write("\t<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("\t\t\t\t\t<button class=\"close\" type=\"button\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">Ã</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">Select \"Logout\" below if you are ready\n");
      out.write("\t\t\t\t\tto end your current session.</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-secondary\" type=\"button\"\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap core JavaScript-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Core plugin JavaScript-->\n");
      out.write("\t<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Page level plugin JavaScript-->\n");
      out.write("\t<script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/datatables/jquery.dataTables.js\"></script>\n");
      out.write("\t<script src=\"vendor/datatables/dataTables.bootstrap4.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Custom scripts for all pages-->\n");
      out.write("\t<script src=\"js/sb-admin.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Demo scripts for this page-->\n");
      out.write("\t<script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("\t<script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
