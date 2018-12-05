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
import javax.swing.JOptionPane;

import java.sql.*;

import com.mysql.jdbc.Statement;

public class test extends HttpServlet {
   // private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    	String dep="deposit";
        double amt=0;
        double newamt=0;
        double tax=0;
        
    	String id=request.getParameter("id");
    	System.out.print(id);
    	
    	double amount=Double.parseDouble(request.getParameter("amount"));
    	System.out.print(amount);
    	
    	tax=amount/100;
    	amount-=tax;
    	
    	
    	Connection con=null;
    	try{
    	Class.forName("com.mysql.jdbc.Driver");
    	System.out.print("Driver Loaded");
    	con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "root");
    	
    	
    	  	
    	
    	java.sql.Statement stmt2=null;
    	ResultSet rs2=null;
    	boolean validId=false;
    	
    	String query1="select * from user;";
 		stmt2=con.createStatement();
 		rs2=stmt2.executeQuery(query1);
 		while(rs2.next()){
 			String dbId=rs2.getString(1);
 			
 		//	System.out.print(rs2.getString(1));
 			
 		
 			if(dbId.equals(id)){			
 				validId=true;
 				
 				break;
 			}
 			
 		}

  
    	
    	
    	if(validId==true){
    	
    	
    	String query="select balance from user where acid='"+id+"';";
    	
    	
    	Statement qu=(Statement) con.createStatement();
    	
    	
    	   	
    	ResultSet rs=qu.executeQuery(query);
    	
    	while(rs.next()){
    	
    		
    	 amt=Integer.parseInt(rs.getString(1));
    	 System.out.print(amt);
    	
    	}
    	System.out.println(amt);
    	System.out.println(amount);
    	System.out.println(newamt);
    	
    	 newamt=amt+amount;
    	
    	System.out.println(newamt);
    	
    	
    	
    	
    	
    	String update="update user set balance="+newamt+" where acid='"+id+"';";
    	System.out.print(update);
    	
    	Statement up=(Statement) con.createStatement();
    	System.out.print("up statement Good");
    	
    	up.executeUpdate(update);
    	System.out.print("executeq Good");
    	
    	

    	String addtohist="insert into history(acid,status,amount) values (?,?,?);";
    	System.out.print(addtohist);
    	
    	PreparedStatement adhist=con.prepareStatement(addtohist);
    	 adhist.setString(1,id);
    	 adhist.setString(2,dep);
    	 adhist.setDouble(3,amount);
    	
    	adhist.executeUpdate();
    	System.out.print("executeq Good");
    	
    	double x=amount+tax;
    	
    	request.getSession().setAttribute("balance", newamt);
    	request.getSession().setAttribute("addedbalance", amount);
        JOptionPane.showMessageDialog(null,"You deposited"+x+"Service Charge"+tax+"New Balance"+newamt);
    	response.sendRedirect("loadingbar.jsp");	
    	}
    	
    	
    	else{
    		
    		 JOptionPane.showMessageDialog(null,"Invalid ID");
    	    	response.sendRedirect("loadingbar.jsp");	
    	    	
    		
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
