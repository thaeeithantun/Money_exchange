import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class MyHistory extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("acid");
		String password=(String)session.getAttribute("pass");
		
		try{
			Connection con =null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
			Statement stmt=null;
			stmt=con.createStatement();
			String query="select * from history where acid='"+id+"'";
			out.print("<html><body bgcolor='cyan'><center><table bgcolor='pink' cellpadding='2' cellspacing='2' border='5'><tr><th></th><th><font color='green'>date</th><th><font color='green'>Status</th><th><font color='green'>Amount</th><th><font color='green'>Other Account Id</th><tr>");
			rs=stmt.executeQuery(query);
			int i=1;
			out.print("<center><h2><font color='green'>Transaction history for account id="+id+"</font></h2></center>");
			while(rs.next()){
				Timestamp ts=rs.getTimestamp(1);
				String accId=rs.getString(2);
				String stat=rs.getString(3);
				double amt=rs.getDouble(4);
				String othId=rs.getString(5);
				out.print("<tr><td>"+i+"</td><td>"+ts+"</td><td>"+stat+"</td><td>"+amt+"</td><td>"+othId+"</td></tr>");
				i=i+1;
			}
			out.print("</table><a href='home.jsp'>Home</a>");
			out.print("</center></body></html>");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
