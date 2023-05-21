package engcss1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BeanClass;
import subjectnames.SubjectNames;
import validate.ValidatedMarks;


@SuppressWarnings("serial")
@WebServlet("/addmarksheet")
public class EnggServlet extends HttpServlet{
	
		
		
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			SubjectNames sub=new SubjectNames();
			BeanClass bean = new BeanClass();
			
			//Student Details
			String sSemester=req.getParameter("semester");
			String sDepartment=req.getParameter("department");
			String sName = req.getParameter("name");
			String sBranch=req.getParameter("branch");
			int sCenter=Integer.parseInt(req.getParameter("centre"));
			String sRollNo=req.getParameter("rollno");
			bean.setMedium("ENGLISH");
			
			ArrayList<String> arrayList=sub.getSubjectName(sDepartment, sBranch, sSemester);
			
			
			//Subject Exam Marks
			int s1T = Integer.parseInt(req.getParameter("s1T"));
			int s2T = Integer.parseInt(req.getParameter("s2T"));
			int s3T = Integer.parseInt(req.getParameter("s3T"));
			int s4T = Integer.parseInt(req.getParameter("s4T"));
			int p1T = Integer.parseInt(req.getParameter("p1T"));
			int p2T = Integer.parseInt(req.getParameter("p2T"));
			
			//Subject Internal Marks
			int s1I = Integer.parseInt(req.getParameter("s1I"));
			int s2I = Integer.parseInt(req.getParameter("s2I"));
			int s3I = Integer.parseInt(req.getParameter("s3I"));
			int s4I = Integer.parseInt(req.getParameter("s4I"));
			int p1I = Integer.parseInt(req.getParameter("p1I"));
			int p2I = Integer.parseInt(req.getParameter("p2I"));
		
			
			
			
			//Set Student Details
			
			bean.setStudentDepartment(sDepartment.toUpperCase());
			bean.setSemesterName(sSemester.toUpperCase());
			bean.setStudentName(sName.toUpperCase());
			bean.setStudentBranch(sBranch.toUpperCase());
			bean.setCollegeCode(sCenter);
			bean.setStudentRollNo(sRollNo);
			
			
			//Set Subject 1 Marks
			bean.setSrS1(1);
			bean.setNameS1(arrayList.get(0).toUpperCase());
			bean.setConstS1TU(80);
			bean.setConstS1TI(20);
			bean.setMaxS1(100);
			bean.setMinS1(40);
			bean.setObtS1TU(s1T);
			bean.setObtS1TI(s1I);
			int totalS1=s1T+s1I;
			bean.setTotS1(totalS1);
			bean.setGrdS1(ValidatedMarks.grade_theory(totalS1,bean.getSrS1()));
			bean.setGpS1(ValidatedMarks.GP_theory(totalS1));
			int cr1=4;
			bean.setCrS1(cr1);
			int gpvS1=cr1*(ValidatedMarks.GP_theory(totalS1));
			bean.setGpvS1(gpvS1);
			
			//Set Subject 2 Marks
			bean.setSrS2(2);
			bean.setNameS2(arrayList.get(1).toUpperCase());
			bean.setConstS2TU(80);
			bean.setConstS2TI(20);
			bean.setMaxS2(100);
			bean.setMinS2(40);
			bean.setObtS2TU(s2T);
			bean.setObtS2TI(s2I);
			int totalS2=s2T+s2I;
			bean.setTotS2(totalS2);
			bean.setGrdS2(ValidatedMarks.grade_theory(totalS2,bean.getSrS2()));
			bean.setGpS2(ValidatedMarks.GP_theory(totalS2));
			int cr2=4;
			bean.setCrS2(cr2);
			int gpvS2=cr2*(ValidatedMarks.GP_theory(totalS2));
			bean.setGpvS2(gpvS2);
			
			//Set Subject 3 Marks
			bean.setSrS3(3);
			bean.setNameS3(arrayList.get(2).toUpperCase());
			bean.setConstS3TU(80);
			bean.setConstS3TI(20);
			bean.setMaxS3(100);
			bean.setMinS3(40);
			bean.setObtS3TU(s3T);
			bean.setObtS3TI(s3I);
			int totalS3=s3T+s3I;
			bean.setTotS3(totalS3);
			bean.setGrdS3(ValidatedMarks.grade_theory(totalS3,bean.getSrS3()));
			bean.setGpS3(ValidatedMarks.GP_theory(totalS3));
			int cr3=4;
			bean.setCrS3(cr3);
			int gpvS3=cr3*(ValidatedMarks.GP_theory(totalS3));
			bean.setGpvS3(gpvS3);
			
			
			//Set Subject 4 Marks
			bean.setSrS4(4);
			bean.setNameS4(arrayList.get(3).toUpperCase());
			bean.setConstS4TU(80);
			bean.setConstS4TI(20);
			bean.setMaxS4(100);
			bean.setMinS4(40);
			bean.setObtS4TU(s4T);
			bean.setObtS4TI(s4I);
			int totalS4=s4T+s4I;
			bean.setTotS4(totalS4);
			bean.setGrdS4(ValidatedMarks.grade_theory(totalS4,bean.getSrS4()));
			bean.setGpS4(ValidatedMarks.GP_theory(totalS4));
			int cr4=4;
			bean.setCrS4(cr4);
			int gpvS4=cr4*(ValidatedMarks.GP_theory(totalS4));
			bean.setGpvS4(gpvS4);
			
			
			//Set Subject Practical P1  Marks
			bean.setSrS5(5);
			bean.setNameP1(arrayList.get(4).toUpperCase());
			bean.setConstP1TU(25);
			bean.setConstP1TI(25);
			bean.setMaxP1(50);
			bean.setMinP1(25);
			bean.setObtP1TU(p1T);
			bean.setObtP1TI(p1I);
			int totalP1=p1T+p1I;
			bean.setTotP1(totalP1);
			bean.setGrdP1(ValidatedMarks.grade_theory(totalP1,bean.getSrS5()));
			bean.setGpP1(ValidatedMarks.GP_practical(totalP1));
			int cr5=1;
			bean.setCrP1(cr5);
			int gpvP1=cr5*(ValidatedMarks.GP_practical(totalP1));
			bean.setGpvP1(gpvP1);
			
			//Set Subject Practical P2  Marks
			bean.setSrS6(6);
			bean.setNameP2(arrayList.get(5).toUpperCase());
			bean.setConstP2TU(25);
			bean.setConstP2TI(25);
			bean.setMaxP2(50);
			bean.setMinP2(25);
			bean.setObtP2TU(p2T);
			bean.setObtP2TI(p2I);
			int totalP2=p2T+p2I;
			bean.setTotP2(totalP2);
			bean.setGrdP2(ValidatedMarks.grade_theory(totalP2,bean.getSrS6()));
			bean.setGpP2(ValidatedMarks.GP_theory(totalP2));
			int cr6=1;
			bean.setCrP2(cr6);
			int gpvP2=cr6*(ValidatedMarks.GP_theory(totalP2));
			bean.setGpvP2(gpvP2);
			
			
			
			//Setting Result Table
			int tcr=cr1+cr2+cr3+cr4+cr5+cr6;
			bean.setTotalCredits(tcr);
			int tgpv=gpvS1+gpvS2+gpvS3+gpvS4+gpvP1+gpvP2;
			bean.setSgpa(tgpv/tcr);
			bean.setSgpaOutof(10);
			
			int tobtMark=totalS1+totalS2+totalS3+totalS4+totalP1+totalP2;
			bean.setObtTotalMarks(tobtMark);
			
			bean.setOutofTotalMarks(500);
			
		String tResultString=ValidatedMarks.checkResult_Theory(totalS1,totalS2,totalS3,totalS4);
		String pResultString=ValidatedMarks.checkResult_Practical(totalP1, totalP2);
		
		if(tResultString.equals("PASS") && pResultString.equals("PASS"))
		{
			
			bean.setResult("PASS");
		}
		else {
			bean.setResult("FAIL");
				}
					
		bean.setDivision(ValidatedMarks.checkDivision(tgpv/tcr));
			
			
			
			int k= new EnggDAO().insert(bean);
			
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			
			if(k==3)
			{
				pw.print("<script>alert('Marks Added Successfully..!');</script>");
				RequestDispatcher rDispatcher = req.getRequestDispatcher("addmarksheet.html");
				rDispatcher.include(req, res);
				
			}else {
				pw.print("<script>alert('Roll No Already Exists..!');</script>");
				RequestDispatcher rDispatcher = req.getRequestDispatcher("addmarksheet.html");
				rDispatcher.include(req, res);
				
			}
			
			
			
			
			
		}
	

}
