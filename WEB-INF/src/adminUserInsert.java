import java.io.*;


import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
public class adminUserInsert extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		
		String fname3=(String)session.getAttribute("fname2");
		String lname3=(String)session.getAttribute("lname2");
		String phno3=(String)session.getAttribute("phno2");
		String address3=(String)session.getAttribute("address2");
		String gender3=(String)session.getAttribute("gender2");
		double balance0=0.0;
		String accid3=(String)session.getAttribute("accid2");
		String pass3=(String)session.getAttribute("pass2");
		Timestamp date3=new Timestamp(System.currentTimeMillis());
		
		
		try{
			Connection con1=null;
			PreparedStatement stmt1=null;
			Class.forName("com.mysql.jdbc.Driver");
			con1=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
			String query="insert into user(acid,password,fname,lname,phno,gender,balance,startdate,address) values (?,?,?,?,?,?,?,?,?)";
			stmt1=con1.prepareStatement(query);
			stmt1.setString(1,accid3);
			stmt1.setString(2,pass3);
			stmt1.setString(3,fname3);
			stmt1.setString(4,lname3);
			stmt1.setString(5,phno3);
			stmt1.setString(6,gender3);
			stmt1.setDouble(7, balance0);
			stmt1.setTimestamp(8,date3);
			stmt1.setString(9,address3);
			stmt1.executeUpdate();
		

			out.print("<font color='green'>Your account is ready to use!!!</font>");
			response.sendRedirect("usertable.jsp");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		
		
	    
	}

}
