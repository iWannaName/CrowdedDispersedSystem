/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2019-07-18 08:27:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class RoleManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


		String username;
		String power;
		String status;
		String subtitle=" ";
		public static String toBinary(int num, int digits) {
		    String cover = Integer.toBinaryString(1 << digits).substring(1);
		    String s = Integer.toBinaryString(num);
		    return s.length() < digits ? cover.substring(s.length()) + s : s;
		}

	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/ TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>人群疏散系统</title>\r\n");
      out.write("    <!-- Bootstrap Styles-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- FontAwesome Styles-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Morris Chart Styles-->\r\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Custom Styles-->\r\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <style> \r\n");
      out.write("    .becenter{text-align:center} \r\n");
      out.write("    </style> \r\n");
      out.write("    <style> \r\n");
      out.write("    th{\r\n");
      out.write("    height:40px;\r\n");
      out.write("    text-align:justify;\r\n");
      out.write("    text-align-last:justify;\r\n");
      out.write("    } \r\n");
      out.write("    .tr_name{\r\n");
      out.write("     width:100px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_input{\r\n");
      out.write("      width:300px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block{\r\n");
      out.write("    width:20px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block2{\r\n");
      out.write("    width:40px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block3{\r\n");
      out.write("    width:60px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block4{\r\n");
      out.write("    width:80px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block5{\r\n");
      out.write("    width:100px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block6{\r\n");
      out.write("    width:120px;\r\n");
      out.write("    }\r\n");
      out.write("    .tr_block7{\r\n");
      out.write("    width:140px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_1{\r\n");
      out.write("    \twidth:20px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_2{\r\n");
      out.write("    \twidth:40px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_3{\r\n");
      out.write("    \twidth:60px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_4{\r\n");
      out.write("    \twidth:80px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_5{\r\n");
      out.write("    \twidth:100px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_6{\r\n");
      out.write("    \twidth:120px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_7{\r\n");
      out.write("    \twidth:140px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_8{\r\n");
      out.write("    \twidth:160px;\r\n");
      out.write("    }\r\n");
      out.write("    .input_9{\r\n");
      out.write("    \twidth:180px;\r\n");
      out.write("    }\r\n");
      out.write("    </style> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');

		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("username")) {
				username = cookie.getValue();
			}
			if (cookie.getName().equals("power")) {
				power = cookie.getValue();
			}
			if (cookie.getName().equals("status")) {
				status = cookie.getValue();
			}
		}
	
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-default top-navbar\" role=\"navigation\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">人群疏散系统</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i>用户名:");
      out.print(username );
      out.write("</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"PersonalAreaServlet?parm=");
      out.print(username);
      out.write("\"><i class=\"fa fa-gear fa-fw\"></i>个人设置</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"Login.jsp\"><i class=\"fa fa-sign-out fa-fw\"></i>退出登录</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-user -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!--/. NAV TOP  -->\r\n");
      out.write("        <nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-dashboard\"></i> 演练事件<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"填写演练事件.html\">填写演练事件</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"查看演练事件.html\">查看演练事件</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"演练事件审核.html\"><i class=\"fa fa-desktop\"></i> 演练事件审核</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("                        <a href=\"显示疏散路径.html\"><i class=\"fa fa-bar-chart-o\"></i> 显示疏散路径</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-qrcode\"></i> 疏散演练<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"人群疏散方案制定.html\">人群疏散方案制定</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"人群疏散方案查看.html\">人群疏散方案查看</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-table\"></i> 保护演练<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"人群保护方案制定.html\">人群保护方案制定</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"人群保护方案查看.html\">人群保护方案查看</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"演练评估.html\"><i class=\"fa fa-edit\"></i> 演练评估 </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap\"></i> 演练事件查询<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"按事件名称查询.html\">按事件名称查询</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"按事件状态查询.html\">按事件状态查询</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"按录入人查询.html\">按录入人查询</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"按演练时间查询.html\">按演练时间查询</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-file\"></i> 系统管理<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            ");

                            	if((Integer.parseInt(power)&4)==4){
                            		subtitle="可修改账户信息";
                            		out.print("<li><a href='AccountManageServlet'>账户管理</a></li>");
                            	}
                            
      out.write("\r\n");
      out.write("                            ");

                            	if((Integer.parseInt(power)&2)==2 && status.equals("1")){
                            		subtitle="可修改角色信息";
                            		out.print("<li><a href='RoleManageServlet'>角色管理</a></li>");
                            	}
                            
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"PersonalAreaServlet?parm=");
      out.print(username);
      out.write("\">个人主页</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("\t\t\t <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <h1 class=\"page-header\">\r\n");
      out.write("                            角色管理<small>");
      out.print(subtitle);
      out.write("</small>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            角色信息:\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class=\"panel-group\" id=\"accordion\">\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                    <table border=\"1\" class=\"becenter\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                                  <th class=\"tr_block4\">警号</th>\r\n");
      out.write("                                                  <th class=\"tr_block4\">姓名</th>\r\n");
      out.write("                                                  <th class=\"tr_block6\">单位</th>\r\n");
      out.write("                                                  <th class=\"tr_block4\">职务</th>\r\n");
      out.write("                                                  <th class=\"tr_block6\">出生日期</th>\r\n");
      out.write("                                                  <th class=\"tr_block6\">入队日期</th>\r\n");
      out.write("                                                  <th class=\"tr_block4\">角色名称</th>\r\n");
      out.write("                                                  <th class=\"tr_block4\">角色状态</th>\r\n");
      out.write("                                                  ");

	                                                  if((Integer.parseInt(power)&8)==8){
	  													out.print("<th class='tr_block4'>");
	  													out.print("权限码");
	  													out.print("</th>");
	  												  }
                                                  
      out.write("\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                     ");

	                                    request.setCharacterEncoding("utf-8");
	                                    response.setContentType("text/html;charset=utf-8");	
										HttpSession sess = request.getSession();
	                                    ArrayList<String[]> ret = new ArrayList<String[]>();
										ret = (ArrayList<String[]>)sess.getAttribute("ret");
										if (ret.size()!=0) {
											for(int i=0;i<ret.size();i++)
											{
												out.print("<tr>");
												for(int j=1;j<9;j++){
													out.print("<th>");
													out.print(ret.get(i)[j]);
													out.print("</th>");
												}
												if((Integer.parseInt(power)&8)==8){
													String k = toBinary(Integer.parseInt(ret.get(i)[9]),11);
													out.print("<th>");
													out.print(k);
													out.print("</th>");
												}
												out.print("</tr>");
											}
										}
										session.invalidate();
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("                                \t</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" class=\"collapsed\">\r\n");
      out.write("                                            增加角色\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapseOne\" class=\"panel-collapse collapse\" style=\"height: 0px;\">\r\n");
      out.write("                                        <div class=\"panel-body\">\r\n");
      out.write("                                            <form action=\"RoleInsertServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t                                  <table border=\"1\">\r\n");
      out.write("\t\t\t\t                                  <tr>\r\n");
      out.write("\t \t                                              <th class=\"tr_block4\">警号</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block4\">姓名</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block6\">单位</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block4\">职务</th>\r\n");
      out.write("\t\t\t                                          <th class=\"tr_block6\">出生日期</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block6\">入队日期</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block4\">角色名称</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block7\">角色状态</th>\r\n");
      out.write("\t\t\t\t                                   </tr>\r\n");
      out.write("\t\t\t\t                                   <tr>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"username\" id=\"use\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"realname\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_6\"type=\"text\" name=\"unit\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"position\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_6\"type=\"text\" name=\"birthdate\" id=\"bir\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_6\" type=\"text\" name=\"jointime\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"role_name\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th>\r\n");
      out.write("\t\t\t\t\t                                   <label><input type=\"radio\" name=\"status\" value=\"1\">启用</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   <label><input type=\"radio\" name=\"status\" value=\"0\">不启用</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   </th>\r\n");
      out.write("\t\t\t\t                                   </tr>\r\n");
      out.write("\t\t\t\t                                   </table>\r\n");
      out.write("\t\t\t\t                                   <br>\r\n");
      out.write("\t\t\t\t                                  <input type=\"submit\" value=\"增加完成\">\r\n");
      out.write("\t\t\t\t                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" class=\"collapsed\">\r\n");
      out.write("                                            删除角色\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapseTwo\" class=\"panel-collapse collapse\" style=\"height: 0px;\">\r\n");
      out.write("                                        <div class=\"panel-body\">\r\n");
      out.write("                                          请输入需要删除角色的警号:\r\n");
      out.write("                                            <form action=\"RoleDeleteServlet\" method=\"post\">\r\n");
      out.write("                                            \t<input class=\"input_4 becenter\" type=\"text\" name=\"usernameD\">\r\n");
      out.write("                                            \t<input type=\"submit\" value=\"确认删除\">\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" class=\"collapsed\">\r\n");
      out.write("                                            修改角色信息\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapseThree\" class=\"panel-collapse collapse\" style=\"height: 0px;\">\r\n");
      out.write("                                        <div class=\"panel-body\">\r\n");
      out.write("                                           <form action=\"RoleModifyServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t                                  <table border=\"1\">\r\n");
      out.write("\t\t\t\t                                  <tr>\r\n");
      out.write("\t \t                                              <th class=\"tr_block4\">警号</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block4\">姓名</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block6\">单位</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block4\">职务</th>\r\n");
      out.write("\t\t\t                                          <th class=\"tr_block6\">出生日期</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block6\">入队日期</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block4\">角色名称</th>\r\n");
      out.write("\t\t\t\t                                   </tr>\r\n");
      out.write("\t\t\t\t                                   <tr>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"usernameM\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"realnameM\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_6\" type=\"text\" name=\"unitM\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"positionM\" ></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_6\" type=\"text\" name=\"birthdateM\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_6\" type=\"text\" name=\"jointimeM\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"role_nameM\"></th>\r\n");
      out.write("\t\t\t\t                                   </tr>\r\n");
      out.write("\t\t\t\t                                   </table>\r\n");
      out.write("\t\t\t\t                                   <br>\r\n");
      out.write("\t\t\t\t                                  <input type=\"submit\" value=\"修改完成\">\r\n");
      out.write("\t\t\t\t                            </form> \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"panel panel-default\">\r\n");
      out.write("                                    <div class=\"panel-heading\">\r\n");
      out.write("                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseFour\" class=\"collapsed\">\r\n");
      out.write("                                            启用/停用角色\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapseFour\" class=\"panel-collapse collapse\" style=\"height: 0px;\">\r\n");
      out.write("                                        <div class=\"panel-body\">\r\n");
      out.write("                                            <form action=\"RoleEnableServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t                                  <table border=\"1\">\r\n");
      out.write("\t\t\t\t                                  <tr>\r\n");
      out.write("\t \t                                              <th class=\"tr_block4\">警号</th>\r\n");
      out.write("\t\t\t\t                                      <th class=\"tr_block7\">角色状态</th>\r\n");
      out.write("\t\t\t\t                                   </tr>\r\n");
      out.write("\t\t\t\t                                   <tr>\r\n");
      out.write("\t\t\t\t\t                                   <th><input class=\"input_4\" type=\"text\" name=\"usernameC\"></th>\r\n");
      out.write("\t\t\t\t\t                                   <th>\r\n");
      out.write("\t\t\t\t\t                                   <label><input type=\"radio\" name=\"statusC\" value=\"1\">启用</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   <label><input type=\"radio\" name=\"statusC\" value=\"0\">停用</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t   </th>\r\n");
      out.write("\t\t\t\t                                   </tr>\r\n");
      out.write("\t\t\t\t                                   </table>\r\n");
      out.write("\t\t\t\t                                   <br>\r\n");
      out.write("\t\t\t\t                                  <input type=\"submit\" value=\"操作完成\">\r\n");
      out.write("\t\t\t\t                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");

	                                if((Integer.parseInt(power)&8)==8){
	                            		out.print("<div class='panel panel-default'><div class='panel-heading'><h4 class='panel-title'>"
                                        +"<a data-toggle='collapse' data-parent='#accordion' href='#collapseFive' class='collapsed'>修改角色权限</a></h4></div>"
                                    	+"<div id='collapseFive' class='panel-collapse collapse' style='height: 0px;'>"
                                        +"<div class='panel-body'>"
                                        +"<form action='RolePowerServlet' method='post'>"
				                        +"<table border='1'>"
				                        +"<tr><th class='tr_block4'>警号</th><th class='tr_block9'>角色权限（添加权限打√去除不打√）</th></tr>"
				                        +"<tr><th><input class='input_4' type='text' name='usernameX'></th><th>"
					                    +"   <label><input type='checkbox' name='power1' value='2'>可修改角色信息</label>"
										+"	 <label><input type='checkbox' name='power2' value='4'>可修改账户信息</label>"
										+"	 <label><input type='checkbox' name='power3' value='8'>可修改角色权限</label>"
										+"	 <label><input type='checkbox' name='power4' value='32'>可修改方案信息</label>"
										+"</th></tr></table><br><input type='submit' value='操作完成'></form></div></div></div>");
	                            	}
                                
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                    <!-- /. ROW  -->\r\n");
      out.write("\t\t\t\t <footer><p>Copyright &copy; 2016.Company name All rights reserved.<a target=\"_blank\" href=\"http://sc.chinaz.com/moban/\">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p></footer>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("             <!-- /. PAGE INNER  -->\r\n");
      out.write("            </div>\r\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("        </div>\r\n");
      out.write("     <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- JS Scripts-->\r\n");
      out.write("    <!-- jQuery Js -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("      <!-- Bootstrap Js -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Metis Menu Js -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("      <!-- Custom Js -->\r\n");
      out.write("    <script src=\"assets/js/custom-scripts.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
