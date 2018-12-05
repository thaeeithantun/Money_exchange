import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import com.mysql.jdbc.Statement;

public class CheckPW extends HttpServlet {
   // private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    	

    	String id=String.valueOf(request.getParameter("acid"));
    	System.out.print(id);
    	
    	String pass=request.getParameter("pp");
    	System.out.print(pass);
    	
    	Connection con=null;
    	try{
    	Class.forName("com.mysql.jdbc.Driver");
    	System.out.print("Driver Loaded");
    	con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "root");
    	System.out.print("Connection Good");
    	String query="select * from admin where aid='"+id+"'";
    	PreparedStatement s=(PreparedStatement)con.prepareStatement(query);
    	ResultSet rs=null;
    	PrintWriter out=response.getWriter();
    	rs=s.executeQuery();
    	System.out.print("executeq Good");
   
    	
    	String pw=null;
    	
    	if(rs.next()){
    		
    		pw=rs.getString("password");
    	
    	
    	
    	if(pw.equals(pass)){
    		response.sendRedirect("menu.jsp");
    		
    	}
    	else if(pw.equals(" ")){
    		response.sendRedirect("incorrectpassword.jsp");
    		}
    	else
    		response.sendRedirect("incorrectpassword.jsp");
    	
    	}
    	else{
    		response.sendRedirect("incorrectpassword.jsp");
    	}
    }
    	catch(Exception ex){
    	System.out.print(ex);
    	
    	}
    	
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    	
    
    } 	
    }