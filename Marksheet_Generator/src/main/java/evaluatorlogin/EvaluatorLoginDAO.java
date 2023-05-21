package evaluatorlogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletRequest;

import connection.DBConnection;

public class EvaluatorLoginDAO {

	public EvaluatorBean eb = null;

	public EvaluatorBean retrieve(ServletRequest req) {

		try {
			Connection con = DBConnection.getCon();

			PreparedStatement ps = con.prepareStatement("select * from evaluator where emailid=? and password=?");

			ps.setString(1, req.getParameter("mail"));
			ps.setString(2, req.getParameter("password"));

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				eb = new EvaluatorBean();

				eb.setEvEmail(rs.getNString(1));
				eb.setEvPassword(rs.getNString(2));
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return eb;
	}
	
	
	
	
}
