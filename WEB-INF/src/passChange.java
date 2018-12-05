import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;
public class passChange extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	HttpSession session=request.getSession();
			String id=(String)session.getAttribute("id");
			System.out.print("pass Change arrive");
			System.out.print(id);
	    	 String npass=(String)session.getAttribute("npass");
	    		System.out.print(npass);

	    	 try{
	    	 	
	    	 	Connection con =null;
	    	 	ResultSet rs=null;
	    	 	Class.forName("com.mysql.jdbc.Driver");
	    	 	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");


	    	     String query="update admin set password='"+npass+"' where acid ='"+ id +"' ";
	    	 PreparedStatement s=(PreparedStatement)con.prepareStatement(query);

	    	  s.executeUpdate();
	    	  JOptionPane.showMessageDialog(null, "Password Changed Successfully");
	    	  response.sendRedirect("admintable.jsp");


	    	 	
	    	 }	
	    	 
	    	 catch (Exception e) {
	    	 		e.printStackTrace();
	    	 	}
	 
		}
			
	}
