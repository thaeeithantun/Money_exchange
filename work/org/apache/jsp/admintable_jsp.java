/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2016-08-24 13:35:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.SQLException;
import java.net.ConnectException;

public final class admintable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1><span class=\"yellow\"> \"ADMIN INFORMATION\" </span>\r\n");
      out.write("</h1>\r\n");
      out.write("<h2>HERE YOU CAN FIND OTHER ADMIN INFORMATION</h2>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"css/adminstyle2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admincirclebutton.css\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"Aquamarine\">\r\n");
      out.write("<table class=\"container\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th><h1>Admin Id</h1></th>\r\n");
      out.write("<th><h1>First Name</h1></th>\r\n");
      out.write("<th><h1>Last Name</h1></th>\r\n");
      out.write("<th><h1>Phno</h1></th>\r\n");
      out.write("<th><h1>Address</h1></th>\r\n");
      out.write("<th><h1>Gender</h1></th>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");

Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;

try{
Class.forName("com.mysql.jdbc.Driver");

	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
	stmt=(Statement) con.createStatement();
	rs=stmt.executeQuery("select * from admin");
	System.out.print(" execute query");
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	while(rs.next()){
		int aid=Integer.parseInt(rs.getString(1));
		String fname=rs.getString(3);
		String lname=rs.getString(4);
		String phno=rs.getString(5);
		String address=rs.getString(6);
		String gender=rs.getString(7);
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print(aid );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(fname );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(lname );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(phno );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(address );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(gender );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t");
 
	
}
catch(Exception e){
		System.out.print(e);
		
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"ballMenuContainer\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"menuBall3\" class=\"menuBall\">\r\n");
      out.write("\t<a href=\"changepassword.jsp\" class=\"ball greenball\">\r\n");
      out.write("    <div class=\"menuText\">\r\n");
      out.write("        Change Password\r\n");
      out.write("    </div>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"menuBall4\" class=\"menuBall\">\r\n");
      out.write("\t<a href=\"menu.jsp\" class=\"ball yellowball\">\r\n");
      out.write("    <div class=\"menuText\">\r\n");
      out.write("        SERVICES\r\n");
      out.write("    </div>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
