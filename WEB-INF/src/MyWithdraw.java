import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;
public class MyWithdraw extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("id1");
		// if (session!=null){ session.invalidate();
		//  }
		//String id="yumon123";

		HttpSession session1=request.getSession();
		
		if(request.getParameter("withdraw").getClass()==String.class){
    		
   		 JOptionPane.showMessageDialog(null,"Invalid amount");
	    	response.sendRedirect("userwithdraw.jsp");	
	    	
   		
   	}
   	
   	else{
		
		Double withAmount=Double.parseDouble(request.getParameter("withdraw"));
		
		Connection con=null;
		Statement stmt=null;
		PreparedStatement preStmt=null;
		//Statement stmt2=null;
		ResultSet rs=null;
		double balance=0.0;
		System.out.print("database access started!!!");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
			String query="select * from user where acid = '"+id+"'"; 
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next()){
				balance=rs.getDouble(7);
				
			}
			if(withAmount>balance){
				System.out.print("balance="+balance);
				out.print("<font color='red'>You don't have sufficient balance to withraw  "+withAmount+"</font>");
				response.sendRedirect("withdraw2.jsp");
				System.out.print("balance insufficicent!!! your balance is "+balance);
			}
			else{
				System.out.print("balance ok!!!");
				String query1="insert into history(date,acid,status,amount,code,flag) values (?,?,?,?,?,?)";
				Timestamp ts=new Timestamp(System.currentTimeMillis());
				String status1="withdraw";
				long code1=(long)Math.random()*10;
				String code2=Long.toString(code1)+ts;
				boolean flag1=false;
				preStmt=con.prepareStatement(query1);
				
				preStmt.setTimestamp(1,ts);
				preStmt.setString(2,id);
				preStmt.setString(3,status1);
				preStmt.setDouble(4,withAmount);
				preStmt.setString(5,code2);
				preStmt.setBoolean(6,flag1);
				preStmt.executeUpdate();
				
				/*System.out.print("Prepared Statement is ok");
				double newBalance=balance-withAmount;
				String query2="update user set balance='"+newBalance+"' where acid='"+id+"'";
				stmt2=con.createStatement();
				stmt2.executeUpdate(query2);
				*/
				
				System.out.print("code was sent");
				session1.setAttribute("code3",code2);
				response.sendRedirect("withdraw1.jsp");
				
			}
			
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
   	}
		
	}
}
