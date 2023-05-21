package evaluatorlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@SuppressWarnings({ "serial", "unused" })
@WebServlet("/Login")
public class EvaluatorLoginServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		EvaluatorBean eb = new EvaluatorLoginDAO().retrieve(req);

		if (eb == null) {
			pw.print("<script>alert('Enter Valid Detail..!');</script>");
			RequestDispatcher rd = req.getRequestDispatcher("evaluator.html");
			rd.include(req, res);
		} else {
			HttpSession httpSession=req.getSession();
			httpSession.setAttribute("msg", eb);
			RequestDispatcher rd = req.getRequestDispatcher("addmarksheet.html");
			rd.include(req, res);
		}

	}

}
