import java.awt.Window;
import java.io.*;


import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
public class MyLogin extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String account=request.getParameter("acc");
		String password=request.getParameter("pass");
		boolean confirmAcc=false;
		boolean confirmPass=false;
		HttpSession session1=request.getSession();
		String sms=null;
		PrintWriter out=response.getWriter();
		 try{
				Connection con =null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
				HttpSession session=request.getSession();
			
				stmt=con.createStatement();
				String query="select * from user";
				rs=stmt.executeQuery(query);
				while(rs.next()){
					String acc1=rs.getString(1);
					String pass1=rs.getString(2);
					if(acc1.equals(account)){
						confirmAcc=true;
						if(pass1.equals(password)){
							confirmPass=true;
					    }
						break;	
					}
				}
				if(confirmAcc==true && confirmPass==true){
					session.setAttribute("acid", account);
					session.setAttribute("pass", password);
					response.sendRedirect("home.jsp");
				}
				else if(confirmAcc==false){
					sms="aaa";
					session1.setAttribute("msg", sms);
					response.sendRedirect("UserLoginFail.jsp");
				}
				else{
					sms="bbb";
					session1.setAttribute("msg", sms);
					response.sendRedirect("UserLoginFail.jsp");
				}
		 }
		 
				catch(Exception e){
						e.printStackTrace();
					}
		 }		
	}
	
