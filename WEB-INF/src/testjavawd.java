import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;


public class testjavawd extends HttpServlet {
   // private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    	System.out.print("reached");
    	//response.sendRedirect("loadingbar.jsp");
    	String uid=request.getParameter("uid");
    	String code=request.getParameter("code");
    	
    	
    	
    	if(uid==null || uid==""){
    		JOptionPane.showMessageDialog(null, "User ID should not be null");
			response.sendRedirect("menu.jsp");
				
    		
    	}
    	else if(code==null || code==""){
    		
    		JOptionPane.showMessageDialog(null, "Code should not be null");
			response.sendRedirect("menu.jsp");
				
    		    	}
    	
    	else{
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	 HttpSession session1=request.getSession();
 		String sms=null;
 		try{ 
 	    Connection con=null;
 		Statement stmt=null;
 		ResultSet rs=null;
 		boolean validId=false;
 		boolean validCode=false;
 		double dbBalance=0.0;
 		double dbAmount=0.0;
 		double newBalance=0.0;
 		boolean dbFlag=false;
 		boolean alreadyWith=false;
 		boolean idCodeMis=false;
 		double amount=0.0;
 		
 			
 		Class.forName("com.mysql.jdbc.Driver");
 		con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
 		String query1="select * from user;";
 		stmt=con.createStatement();
 		rs=stmt.executeQuery(query1);
 		while(rs.next()){
 			String dbId=rs.getString(1);
 			
 			System.out.print(dbId);
 			if(dbId.equals(uid)){			
 				validId=true;
 				dbBalance=rs.getDouble(7);
 				break;
 			}
 			
 		}
 		if(validId==true){
 			String query2="select * from history where code= '"+code+"';";
 			rs=stmt.executeQuery(query2);

 			System.out.print("id is valid");
 			while(rs.next()){
 				String dbCode=rs.getString(6);
 				String hisId=rs.getString(2);
 				dbFlag=rs.getBoolean(7);
 				if(dbCode.equals(code)){
 					if(hisId.equals(uid)){
 						if(dbFlag==false){
 							validCode=true;
 							dbAmount=rs.getDouble(4);
 							
 						}
 						else{
 							alreadyWith=true;	
 							}
 						}
 					else{
 						idCodeMis=true;
 					 }
 				// break;
 				}
 			}
 			
 			if(validCode==true){
 				System.out.print("code is valid");
 				newBalance=dbBalance-dbAmount;
 				String query3="update user set balance='"+newBalance+"' where acid='"+uid+"';";
 				stmt.executeUpdate(query3);
 				
 				String query4="update history set flag=1 where code='"+code+"';";
 				stmt.executeUpdate(query4);
 						
 				
 				JOptionPane.showMessageDialog(null, " Successfully withdraw  "+dbAmount +"MMK");
				response.sendRedirect("menu.jsp");
 			} //code valid
 			else if(alreadyWith){

 				System.out.print("already withdrawed!!");
 				sms="ccc";
 			 	session1.setAttribute("msg", sms);
 				JOptionPane.showMessageDialog(null, "Already Withdrawed!");
				response.sendRedirect("menu.jsp");
 				
 			}
 			else if(idCodeMis){

 				System.out.print("code and id mismatch!!!");
 				sms="ddd";
 			 	session1.setAttribute("msg", sms);
 			 	JOptionPane.showMessageDialog(null, "Code and ID mismatch!");
 			 	response.sendRedirect("menu.jsp");
 			
 			}
 			else{
 				sms="aaa";
 				session1.setAttribute("msg", sms);
 				JOptionPane.showMessageDialog(null, " Withdrawal Error!");
 				response.sendRedirect("menu.jsp");
 				}
 		
 		}/// // id valid
 		else{
 			sms="bbb";
 			session1.setAttribute("msg", sms);
 			JOptionPane.showMessageDialog(null, " Withdrawal Error!");
			response.sendRedirect("menu.jsp");
			}
 		 		
 	    }
 		catch(Exception ex){
 			ex.printStackTrace();
 		}
    	
    	
    	
    //	request.getSession().setAttribute("balance", uid);
    	//request.getSession().setAttribute("addedbalance", code);
//  request.getRequestDispatcher("testingwithdraw.jsp").forward(request, response);
    	
    	}
    	
    }
}