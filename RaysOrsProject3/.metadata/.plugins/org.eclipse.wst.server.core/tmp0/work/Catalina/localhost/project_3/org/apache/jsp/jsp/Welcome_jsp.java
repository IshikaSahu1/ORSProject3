/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.78
 * Generated at: 2023-04-01 12:52:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1680353511239L));
    _jspx_dependants.put("/jsp/FooterView.jsp", Long.valueOf(1680353553651L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Welcome Page</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("<style>\n");
      out.write(".p4{\n");
      out.write("\n");
      out.write("background-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/school.jpg');\n");
      out.write("	background-size: cover;\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	background-position: center;\n");
      out.write("	\n");
      out.write("\n");
      out.write("}\n");
      out.write(".cl{\n");
      out.write(" font-family: Lucida Calligraphy; \n");
      out.write(" font-size:60;\n");
      out.write("/* font-family: Monotype Corsiva;\n");
      out.write(" */\n");
      out.write(" font-family: Footlight MT Light;\n");
      out.write(" }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"p4 img-fluid\" alt=\"Responsive image\">\n");
      out.write("<div class=\"header\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Header</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\n");
      out.write("	integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".raj {\n");
      out.write("	background-image: linear-gradient(to bottom right,grey,white);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");

		UserDTO userDto = (UserDTO) session.getAttribute("user");

		boolean userLoggedIn = userDto != null;	

		String welcomeMsg = "Hi, ";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest"; 
		}
	
      out.write("\n");
      out.write("	<div class=\"header\">\n");
      out.write("		<nav class=\"navbar navbar-expand-lg fixed-top raj\"> <a\n");
      out.write("			class=\"navbar-brand\" href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\n");
      out.write("			src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"190px\"\n");
      out.write("			height=\"50px\"></a>\n");
      out.write("		<button class=\"navbar-toggler \" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("			data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("			<span class=\"navbar-toggler-icon\"> <i class=\"fa fa-bars\"\n");
      out.write("				style=\"color: #fff; font-size: 28px;\"></i></span>\n");
      out.write("		</button>\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("			<ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("				<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(current)</span>\n");
      out.write("				</a>\n");
      out.write("				");

					if (userLoggedIn) {
				
      out.write("\n");
      out.write("				\n");
      out.write("				\n");
      out.write("			\n");
      out.write("				\n");
      out.write("				");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">College</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-university\"></i>Add College</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-building\"></i>College List </a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Course\n");
      out.write("					</font></a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-sort-amount-down\"></i>Course List </a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-circle\"></i>Add Student</a> <a\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-users\"></i>Student List</a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Faculty\n");
      out.write("					</font></a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fa fa-users\"></i>Faculty\n");
      out.write("							List</a>\n");
      out.write("					</div></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Time\n");
      out.write("							Table</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i class=\"fa fa-clock\"></i>TimeTable\n");
      out.write("							List</a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-calculator\"></i>Add Subject</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\n");
      out.write("							class=\"fa fa-sort-amount-down\"></i>Subject List\n");
      out.write("						</a>\n");
      out.write("					</div></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Marksheet\n");
      out.write("					</font></a>\n");
      out.write("\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i class=\"fa fa-paste\"></i>Marksheet\n");
      out.write("							List</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\" fa fa-file-alt\"></i>Marksheet Merit List </a> <a\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-copy\"></i>Get Marksheet</a>\n");
      out.write("					</div></li>\n");
      out.write("				");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px;\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">User</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-circle\"></i>Add User</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-friends\"></i>User List</a>\n");
      out.write("					</div></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Marksheet\n");
      out.write("					</font></a>\n");
      out.write("\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i class=\"fa fa-paste\"></i>Marksheet\n");
      out.write("							List</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\" fa fa-file-alt\"></i>Marksheet Merit List </a> <a\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-copy\"></i>Get Marksheet</a>\n");
      out.write("					</div></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Role</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-friends\"></i>Role List</a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">College</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-university\"></i>Add College</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-building\"></i>College List </a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Course\n");
      out.write("					</font></a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-sort-amount-down\"></i>Course List </a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Student</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-circle\"></i>Add Student</a> <a\n");
      out.write("							class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-users\"></i>Student List</a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Faculty\n");
      out.write("					</font></a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fa fa-users\"></i>Faculty\n");
      out.write("							List</a>\n");
      out.write("					</div></li>\n");
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Time\n");
      out.write("							Table</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i class=\"fa fa-clock\"></i>TimeTable\n");
      out.write("							List</a>\n");
      out.write("					</div></li>\n");
      out.write("				<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> <font style=\"color: black;\">Subject</font>\n");
      out.write("				</a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-calculator\"></i>Add Subject</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\n");
      out.write("							class=\"fa fa-sort-amount-down\"></i>Subject List\n");
      out.write("						</a>\n");
      out.write("					</div></li>\n");
      out.write("\n");
      out.write("				");

					}
					}
				
      out.write("\n");
      out.write("				<li class=\"nav-item dropdown\"\n");
      out.write("					style=\"padding-left: 5px; padding-right: 97px\"><a\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("					role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"><font style=\"color: black;\">");
      out.print(welcomeMsg);
      out.write("\n");
      out.write("					</font></a>\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("						");

							if (userLoggedIn) {
						
      out.write("\n");
      out.write("						<a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fa fa-user-tie\"></i>My\n");
      out.write("							Profile</a> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\n");
      out.write("							class=\"fa fa-edit\"></i>Change Password\n");
      out.write("						</a> <a class=\"dropdown-item\" target=\"blank\"\n");
      out.write("							href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i class=\"fa fa-clone\"></i>Java\n");
      out.write("							Doc </a>\n");
      out.write("						");

							} else {
						
      out.write("\n");
      out.write("						<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\n");
      out.write("							class=\"fa fa-sign-in-alt\">Login</i> <a class=\"dropdown-item\"\n");
      out.write("							href=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\n");
      out.write("								class=\"fa fa-registered\"></i> User Registration</a>\n");
      out.write("					</div></li>\n");
      out.write("				");

					}
				
      out.write("\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("		</nav>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"text-cs1\">\n");
      out.write("<center><h1  style=\"padding-top: 17%;color: black; \"><i><b class=\"cl\">Welcome to ORS</b></i></h1></center>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".footer {\n");
      out.write("   position: fixed;\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("/*      background-color: #343a40;\n");
      out.write(" */      color: white;\n");
      out.write("   text-align: center;\n");
      out.write(" background-image:  linear-gradient(to bottom right, grey, black);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div class=\"footer\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
