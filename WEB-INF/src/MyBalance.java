import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
public class MyBalance extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("acid");
		String password=(String)session.getAttribute("pass");
		double blc=0.0;
		String fn=null;
		String ln=null;
		 try{
	            Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
				stmt=con.createStatement();
				rs=stmt.executeQuery("select * from user");
				while(rs.next()){
					String acc=rs.getString(1);
					if(id.equals(acc)){
							blc=rs.getDouble(7);
							fn=rs.getString(3);
							ln=rs.getString(4);break;
	                 
					  }
				}
	        }
				catch (Exception e) {
				e.printStackTrace();
			}
				session.setAttribute("balance",blc);
				session.setAttribute("fname",fn);
				session.setAttribute("lname",ln);
				response.sendRedirect("balance.jsp");

	}
}
