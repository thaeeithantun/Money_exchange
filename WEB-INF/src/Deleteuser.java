import java.io.*;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;

public class Deleteuser extends HttpServlet {
   // private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    	
    String id=request.getParameter("acid");
    
    HttpSession session1=request.getSession();
	String sms=null;
    
    Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	boolean validId=false;
	boolean idCodeMis=false;
	try{
		
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
	String query1="select * from user";
	stmt=con.createStatement();
	rs=stmt.executeQuery(query1);
	while(rs.next()){
		String dbId=rs.getString(1);
		if(dbId.equals(id)){			
			validId=true;
			break;
		}
		
	}
	if(validId==true){
		
			

                        String query="delete from user where acid ='"+ id +"' ";
    		    	PreparedStatement s=(PreparedStatement)con.prepareStatement(query);
    		    	System.out.print("query Good");
    		    	 s.executeUpdate();
    		    	 JOptionPane.showMessageDialog(null, "Deleted Successfully");
        	         response.sendRedirect("usertable.jsp");
        

		}
 else{
	 JOptionPane.showMessageDialog(null, "Your ID is wrong! ");
		response.sendRedirect("delete.jsp");


		}

		
	
    }
	catch(Exception ex){
		ex.printStackTrace();
	}
		}

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    	
    
    } 



     }

