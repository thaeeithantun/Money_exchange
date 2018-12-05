import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.text.BreakIterator;
public class MyChange extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("acid");
		String password=(String)session.getAttribute("pass");
		HttpSession session2=request.getSession();
	 	session2.setAttribute("id1",id);
	 	session2.setAttribute("password1",password);
		
		String currentPass=request.getParameter("cp");
		String newPass=request.getParameter("np");
		String confirmPass=request.getParameter("cnp");
		boolean aaa=false;
		boolean bbb=false;
	
		
		HttpSession session1=request.getSession();
		String sms=null;
		
		if(currentPass.equals(password)){
			aaa=true;
			if(newPass.equals(confirmPass)){
				bbb=true;
				try{
					Connection con =null;
					ResultSet rs=null;
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
					Statement stmt=null;
					PreparedStatement stmt1=null;
					stmt=con.createStatement();
					String query="select * from user";
					rs=stmt.executeQuery(query);
					while(rs.next()){
						String acc1=rs.getString(1);
						if(acc1.equalsIgnoreCase(id)){
							stmt1=con.prepareStatement("update user set password='"+newPass+"' where acid='"+id+"'");
							stmt1.executeUpdate();break;
						}
					}
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if(aaa==true && bbb==true){
			session.setAttribute("acid", id);
			session.setAttribute("pass", newPass);
			response.sendRedirect("successChange.jsp");
		}
		else if(aaa==false){
			sms="aaa";
			session1.setAttribute("msg", sms);
			response.sendRedirect("unsuccessChange.jsp");		
		}
		else{
			sms="bbb";
			session1.setAttribute("msg", sms);
			response.sendRedirect("unsuccessChange.jsp");
		}
}

}
