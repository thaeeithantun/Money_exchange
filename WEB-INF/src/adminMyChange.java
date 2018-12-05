import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;

import java.sql.*;
public class adminMyChange extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
				
	String id=request.getParameter("aid");
	System.out.print("my change arrive ");
	System.out.print(id);
	String cpass=request.getParameter("cpass");
	String npass=request.getParameter("npass");
	String cnpass=request.getParameter("cnpass");
	String dbpass=null;
	String dbid=null;
	
		boolean existAccandpass=false;
		boolean truepass=false;
		Connection con =null;
		Statement stmt=null;
		ResultSet rs=null;
		
	    PrintWriter out = response.getWriter();
		
	     try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
			String query="select * from admin";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()){
				String id1=rs.getString(1);
				String pass=rs.getString(2);
				if(id1.equals(id) && (pass.equals(cpass))){
					existAccandpass=true;
					
					break;
				}
				else{
					existAccandpass=false;
				}
			}
			if(existAccandpass==false){
				JOptionPane.showMessageDialog(null, "This ID or Password is something wrong");
				response.sendRedirect("changepassword.jsp");
			}
			else{
					
					if(npass.equals(cnpass)){
						
						HttpSession session=request.getSession(true);
						session.setAttribute("id",id);
						session.setAttribute("npass",npass);
						response.sendRedirect("passChange.jsp");
						
					}//end of inner_if
					else{
						JOptionPane.showMessageDialog(null, "Your password and retype password are not the same!");
						response.sendRedirect("changepassword.jsp");
						
					
					}
					
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
