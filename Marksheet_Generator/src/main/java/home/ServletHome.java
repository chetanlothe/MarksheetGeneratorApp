package home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanClass;

@SuppressWarnings({ "serial" })
@WebServlet("/ServletHome")
public class ServletHome extends HttpServlet {

   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		BeanClass beanClass=new HomeDAO().retreive(req);
		
		if(beanClass==null) {
			pw.println("<script>alert('Invalid Details..!');</script>");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);
			
		}else {
			req.setAttribute("BeanClass", beanClass);
			RequestDispatcher rd = req.getRequestDispatcher("marksheet.jsp");
			rd.include(req, res);
		}
		

		
		
		
	
	}


}
