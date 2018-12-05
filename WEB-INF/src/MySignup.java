import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
public class MySignup extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		String fname1=request.getParameter("fname");
		String lname1=request.getParameter("lname");
		String phno1=request.getParameter("phno");
		String address1=request.getParameter("address");
		String gender1=request.getParameter("gender");
		String accid1=request.getParameter("accid");
		String pass1=request.getParameter("pass");
		String cpass1=request.getParameter("cpass");
		boolean dupliAcc=false;
		HttpSession session1=request.getSession();
		String sms=null;
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
				if(id.equals(accid1)){
					dupliAcc=true;
					break;
				}
				else{
					dupliAcc=false;
				}
			}
			if(dupliAcc==true){
				sms="aaa";
				session1.setAttribute("msg", sms);
				response.sendRedirect("UserSignupFail.jsp");
			}
			else{
					
					if(pass1.equals(cpass1)){
						sms="ccc";
						HttpSession session=request.getSession(true);
						session.setAttribute("fname2",fname1);
						session.setAttribute("lname2",lname1);
						session.setAttribute("phno2",phno1);
						session.setAttribute("address2",address1);
						session.setAttribute("gender2",gender1);
						session.setAttribute("accid2",accid1);
						session.setAttribute("pass2",pass1);
						session.setAttribute("cpass2",cpass1);
						session.setAttribute("msg",sms);
						response.sendRedirect("UserInsert");
						
					}//end of inner_if
					else{
						sms="bbb";
						session1.setAttribute("msg", sms);
						response.sendRedirect("UserSignupFail.jsp");
						
					
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
