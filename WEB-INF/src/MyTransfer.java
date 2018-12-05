import java.io.*;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;
public class MyTransfer extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("acid");
		String password=(String)session.getAttribute("pass");
		HttpSession session2=request.getSession();
	 	session2.setAttribute("id1",id);
	 	session2.setAttribute("password1",password);

		Boolean foundId=false;
		
		String tid=request.getParameter("tranacc");
		if(request.getParameter("tranamt").getClass()==String.class){
    		
   		 JOptionPane.showMessageDialog(null,"Invalid amount");
	    	response.sendRedirect("transfer.jsp");	
	    	
   		
   	}
   	
   	else{
		double tamt=Double.parseDouble(request.getParameter("tranamt"));
		
		HttpSession session1=request.getSession();
		String sms=null;
		
		if(id.equals(tid)){
			sms="aaa";
			session1.setAttribute("msg", sms);
			response.sendRedirect("errorTransfer.jsp");					//id is your id !!so you have to re-enter the other id
			}
		else{						//id is the other's id !! 	you can go on....
			Connection con=null;	
			Statement stmt=null;
			ResultSet rs=null;
			String dbId=null;
			double balance=0.0;
			PreparedStatement preStmt=null;
			System.out.print("database access started!!!");
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
				String query="select * from user where acid='"+id+"'"; 
				stmt=con.createStatement();
				rs=stmt.executeQuery(query);
				while(rs.next()){
					balance=rs.getDouble(7);
					
				}
															//examine sender's balance
				if(balance>tamt){							//balance's OK and go on to examine whether the other id exist?
					String query1="select * from user";
					stmt=con.createStatement();
					rs=stmt.executeQuery(query1);
					while(rs.next()){
						dbId=rs.getString(1);
						if(dbId.equals(tid)){
							foundId=true;
							break;
						}
						
					}
					if(foundId==true){				//edit balance
						String query2="select * from user where acid='"+tid+"'";
						//stmt=con.createStatement();
						rs=stmt.executeQuery(query2);
						double newBalance=0.0;
						while(rs.next()){
							newBalance=rs.getDouble(7)+tamt;	
						}
						String query3="update user set balance='"+newBalance+"' where acid='"+tid+"'";
						//stmt=con.createStatement();
						stmt.executeUpdate(query3);
						double newBalForSource=balance-tamt;
						String query4="update user set balance='"+newBalForSource+"' where acid='"+id+"'";
						//stmt=con.createStatement();
						stmt.executeUpdate(query4);
						
						
						String query5="insert into history(date,acid,status,amount,oid) values (?,?,?,?,?)";
						Timestamp ts=new Timestamp(System.currentTimeMillis());
						String status1="transfer";
						
						preStmt=con.prepareStatement(query5);
						
						preStmt.setTimestamp(1,ts);
						preStmt.setString(2,id);
						preStmt.setString(3,status1);
						preStmt.setDouble(4,tamt);
						preStmt.setString(5,tid);
						preStmt.executeUpdate();
						
						response.sendRedirect("transfer1.jsp");
					}//end of inner founId if
					else{
						out.print("The id does not exist in our database");
						sms="bbb";
						session1.setAttribute("msg", sms);
						response.sendRedirect("errorTransfer.jsp");
					}
					
				}//end of outer balance OK if
				else{
					out.print("You don't have sufficient balance to transfer!!Please check your balance!!");
					sms="ccc";
					session1.setAttribute("msg", sms);
					response.sendRedirect("errorTransfer.jsp");
				}
				
			
			
			}//end of try
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		}//end of id OK else
		
	}
}

