/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2016-08-24 18:29:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class balance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/circlebutton.css\">\r\n");
      out.write("<style>\r\n");
      out.write("#main{\r\n");
      out.write("\tbackground:#F08080;\r\n");
      out.write("}\r\n");
      out.write("#sidebar{\r\n");
      out.write("\tbackground:#F08080;\r\n");
      out.write("}\r\n");
      out.write("#heade1\r\n");
      out.write("{\r\n");
      out.write("width:625x;\r\n");
      out.write("height:60px;\r\n");
      out.write("background:url(images/money.png) 20px 10px no-repeat;\r\n");
      out.write("padding-left:90px;\r\n");
      out.write("margin: 0 0 0 20px;\r\n");
      out.write("}\r\n");
      out.write("#heade1 h2\r\n");
      out.write("{\r\n");
      out.write("font:bold 20px/18px Arial, Helvetica, sans-serif;\r\n");
      out.write("padding:30px 0 0 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("\t <h1><font color=\"darkblue\">Easy Money System</font><span class=\"style1\"></span></h1>\r\n");
      out.write("     <h2><font color=\"darkblue\">ExtraOrdinary Service</font></h2>\t\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     <div id=\"ballMenuContainer\">\r\n");
      out.write("     <div id=\"menuBall1\" class=\"menuBall\">\r\n");
      out.write("         <a href=\"home.jsp\" class=\"ball blueball\">\r\n");
      out.write("          <div class=\"menuText\">HOME</div>\r\n");
      out.write("         </a>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <div id=\"menuBall2\" class=\"menuBall\">\r\n");
      out.write("\t     <a href=\"deposit.jsp\" class=\"ball redball\">\r\n");
      out.write("           <div class=\"menuText\">DEPOSIT</div>\r\n");
      out.write("        </a>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <div id=\"menuBall3\" class=\"menuBall\">\r\n");
      out.write("\t    <a href=\"userwithdraw.jsp\" class=\"ball greenball\">\r\n");
      out.write("          <div class=\"menuText\">WITHDRAW</div>\r\n");
      out.write("        </a>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <div id=\"menuBall4\" class=\"menuBall\">\r\n");
      out.write("\t   <a href=\"transfer.jsp\" class=\"ball yellowball\">\r\n");
      out.write("          <div class=\"menuText\">TRANSFER</div>\r\n");
      out.write("      </a>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <div id=\"menuBall1\" class=\"menuBall\">\r\n");
      out.write("      <a href=\"changepass.jsp\" class=\"ball blueball\">\r\n");
      out.write("         <div class=\"menuText\">CHANGE PASS</div>\r\n");
      out.write("     </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"menuBall2\" class=\"menuBall\">\r\n");
      out.write("\t     <a href=\"userHistory.jsp\" class=\"ball redball\">\r\n");
      out.write("           <div class=\"menuText\">HISTORY</div>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"menuBall3\" class=\"menuBall\">\r\n");
      out.write("\t    <a href=\"aboutus.jsp\" class=\"ball greenball\">\r\n");
      out.write("          <div class=\"menuText\">ABOUT US</div>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"menuBall4\" class=\"menuBall\">\r\n");
      out.write("\t   <a href=\"contactus.jsp\" class=\"ball yellowball\">\r\n");
      out.write("          <div class=\"menuText\">CONTACT US</div>\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"menuBall1\" class=\"menuBall\">\r\n");
      out.write("      <a href=vdoswitch.jsp class=\"ball blueball\">\r\n");
      out.write("         <div class=\"menuText\">LOGOUT</div>\r\n");
      out.write("     </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write(" <div id=\"main\">\r\n");
      out.write("    <div id=\"heade1\"><h2>Balance:</h2></div>\r\n");
      out.write("    <p>Lorem ipsum dolor sit amet.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"sidebar\">\r\n");
      out.write("    ");
   
    	 session=request.getSession();
         double balance=Double.parseDouble(String.valueOf(session.getAttribute("balance")));
    	  String fn=(String)session.getAttribute("fname");
    	  String ln=(String)session.getAttribute("lname");
    	  out.println("<h4>Hello!!!</h4>");
		  out.println("<h4>"+fn+" "+ln+"</h4>");
		  out.println("<h3>Your balance:</h3>"+"<h4>"+balance+"</h4>");
    	
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\t</body>\r\n");
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
