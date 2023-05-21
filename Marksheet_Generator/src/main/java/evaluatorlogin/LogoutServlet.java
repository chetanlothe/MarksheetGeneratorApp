package evaluatorlogin;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse res) {
		
		try {
		PrintWriter pw=res.getWriter();
		
		HttpSession hSession=request.getSession(false);
		
		if(hSession==null){
			pw.print("<script>alert('Sorry Session Expired..!');</script>");
			RequestDispatcher rDispatcher=request.getRequestDispatcher("home.html");
			rDispatcher.include(request, res);
			
		}
		else {
			hSession.removeAttribute("msg");
			hSession.invalidate();
			
			pw.print("<script>alert('Logout Sucessfull..!');</script>");
			RequestDispatcher rDispatcher=request.getRequestDispatcher("home.html");
			rDispatcher.include(request, res);
			
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
