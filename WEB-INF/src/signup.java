import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;
public class signup extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		String accid1=request.getParameter("acid");
		String pass1=request.getParameter("password");
		String cpass1=request.getParameter("rpassword");
		String fname1=request.getParameter("fname");
		String lname1=request.getParameter("lname");
		if(request.getParameter("phno").getClass()==String.class){
    		
	   		 JOptionPane.showMessageDialog(null,"Phone number should be numbers");
		    	response.sendRedirect("admin1.jsp");	
		    	
	   		
	   	}
	   	
	   	else{
		String phno1=request.getParameter("phno");
		String address1=request.getParameter("address");
		String gender1=request.getParameter("gender");
		
		boolean dupliAcc=false;
		Connection con =null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
	    PrintWriter out = response.getWriter();
		
	     try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
			String query="select * from user";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()){
				String id=rs.getString(1);
				if(id.equalsIgnoreCase(accid1)){
					dupliAcc=true;
					break;
				}
				else{
					dupliAcc=false;
				}
			}
			if(dupliAcc==true){
				JOptionPane.showMessageDialog(null, "This ID already exit!Try with another ID, Thanks");
				response.sendRedirect("signup.jsp");
			}
			else{
					
					if(pass1.equals(cpass1)){
						HttpSession session=request.getSession(true);
						session.setAttribute("fname2",fname1);
						session.setAttribute("lname2",lname1);
						session.setAttribute("phno2",phno1);
						session.setAttribute("address2",address1);
						session.setAttribute("gender2",gender1);
						session.setAttribute("accid2",accid1);
						session.setAttribute("pass2",pass1);
						session.setAttribute("cpass2",cpass1);
						response.sendRedirect("UserInsert");
						
					}//end of inner_if
					else{
						JOptionPane.showMessageDialog(null, "Your password and retype password are not the same!");
						response.sendRedirect("signup.jsp");
						
					
					}//end of inner-else
				}//end of outer-else
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
			
	}
