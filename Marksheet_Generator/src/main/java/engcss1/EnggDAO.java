package engcss1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import bean.BeanClass;
import connection.DBConnection;
import validate.ValidatedMarks;

public class EnggDAO {

	
public int a=0,b=0,c=0;
	
	public int insert(BeanClass bean)
	{
	
		try
		{
			Connection con = DBConnection.getCon();
			
			
			
			//Student Details
			PreparedStatement ps = con.prepareStatement("INSERT INTO student (roll_no, name, department, branch, semester, medium, collegecode) VALUES (?, ?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, bean.getStudentRollNo());
			ps.setString(2, bean.getStudentName());
			ps.setString(3, bean.getStudentDepartment());
			ps.setString(4, bean.getStudentBranch());
			ps.setString(5, bean.getSemesterName());
			ps.setString(6, bean.getMedium());
			ps.setInt(7, bean.getCollegeCode());
			
			a =ps.executeUpdate();
			
			//Student Marks
			ArrayList<String> subjectNames = new ArrayList<String>();
			subjectNames.add(bean.getNameS1());
			subjectNames.add(bean.getNameS2());
			subjectNames.add(bean.getNameS3());
			subjectNames.add(bean.getNameS4());
			subjectNames.add(bean.getNameP1());
			subjectNames.add(bean.getNameP2());

			ArrayList<Integer> subjectMarksT = new ArrayList<Integer>();
			subjectMarksT.add(bean.getObtS1TU());
			subjectMarksT.add(bean.getObtS2TU());
			subjectMarksT.add(bean.getObtS3TU());
			subjectMarksT.add(bean.getObtS4TU());
			subjectMarksT.add(bean.getObtP1TU());
			subjectMarksT.add(bean.getObtP2TU());

			ArrayList<Integer> subjectInternalMarks = new ArrayList<Integer>();
			subjectInternalMarks.add(bean.getObtS1TI());
			subjectInternalMarks.add(bean.getObtS2TI());
			subjectInternalMarks.add(bean.getObtS3TI());
			subjectInternalMarks.add(bean.getObtS4TI());
			subjectInternalMarks.add(bean.getObtP1TI());
			subjectInternalMarks.add(bean.getObtP2TI());
			
			
			
			ArrayList<Integer>sbConTotMarkTU=new ArrayList<Integer>();
			
			sbConTotMarkTU.add(bean.getConstS1TU());
			sbConTotMarkTU.add(bean.getConstS2TU());
			sbConTotMarkTU.add(bean.getConstS3TU());
			sbConTotMarkTU.add(bean.getConstS4TU());
			sbConTotMarkTU.add(bean.getConstP1TU());
			sbConTotMarkTU.add(bean.getConstP2TU());
			
			ArrayList<Integer>sbConTotMarkTI =new ArrayList<Integer>();
			sbConTotMarkTI.add(bean.getConstS1TI());
			sbConTotMarkTI.add(bean.getConstS2TI());
			sbConTotMarkTI.add(bean.getConstS3TI());
			sbConTotMarkTI.add(bean.getConstS4TI());
			sbConTotMarkTI.add(bean.getConstP1TI());
			sbConTotMarkTI.add(bean.getConstP2TI());
			
			
			ArrayList<Integer>maxMark=new ArrayList<Integer>();
			maxMark.add(bean.getMaxS1());
			maxMark.add(bean.getMaxS2());
			maxMark.add(bean.getMaxS3());
			maxMark.add(bean.getMaxS4());
			maxMark.add(bean.getMaxP1());
			maxMark.add(bean.getMaxP2());
			
			ArrayList<Integer>minMark=new ArrayList<Integer>();
			minMark.add(bean.getMinS1());
			minMark.add(bean.getMinS2());
			minMark.add(bean.getMinS3());
			minMark.add(bean.getMinS4());
			minMark.add(bean.getMinP1());
			minMark.add(bean.getMinP2());
			
			ArrayList<Integer>crArrayList =new ArrayList<Integer>();
			crArrayList.add(bean.getCrS1());
			crArrayList.add(bean.getCrS2());
			crArrayList.add(bean.getCrS3());
			crArrayList.add(bean.getCrS4());
			crArrayList.add(bean.getCrP1());
			crArrayList.add(bean.getCrP2());
			
			
			
			
			//Subject Marks
			PreparedStatement ps2 = con.prepareStatement
		    ("INSERT INTO subject_marks (roll_no, sr_no, subject_name, ctu, cti, maxmarks, minmarks, obttu, obtti, totalmarks, grade, gp, cr, gpv) "
		    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			// Insert subject marks data for each subject
			for (int i = 0; i < subjectNames.size(); i++) {
			    // Set the values for the prepared statement
				ps2.setString(1, bean.getStudentRollNo());
				ps2.setInt(2, i+1);
				ps2.setString(3, subjectNames.get(i));
				ps2.setInt(4, sbConTotMarkTU.get(i));
			    ps2.setInt(5,sbConTotMarkTI.get(i) );
			    ps2.setInt(6, maxMark.get(i));
			    ps2.setInt(7, minMark.get(i));
			    ps2.setInt(8, subjectMarksT.get(i));
			    ps2.setInt(9, subjectInternalMarks.get(i));
			    int totalMarks = subjectMarksT.get(i) + subjectInternalMarks.get(i);
			    ps2.setInt(10, totalMarks);
			    ps2.setString(11, ValidatedMarks.grade_theory(totalMarks,i+1));
			    ps2.setInt(12, ValidatedMarks.GP_theory(totalMarks));
			    ps2.setInt(13, crArrayList.get(i));
			    ps2.setInt(14, crArrayList.get(i)*ValidatedMarks.GP_theory(totalMarks));
			    
			    
			    if(a>0) {
			    	b  = ps2.executeUpdate();
			   }
			    
			    
			}
			   
			//Student Result
			PreparedStatement ps3 = con.prepareStatement("INSERT INTO student_result (roll_no, total_credits, sgpa, outofsgpa, totalmarksobt, outofmarks, result, Division) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");


			ps3.setString(1, bean.getStudentRollNo());
			ps3.setInt(2, bean.getTotalCredits());
			ps3.setFloat(3, bean.getSgpa());
			ps3.setInt(4, bean.getSgpaOutof());
			ps3.setInt(5, bean.getObtTotalMarks());
			ps3.setInt(6, bean.getOutofTotalMarks());
			ps3.setString(7, bean.getResult());
			ps3.setString(8, bean.getDivision());

			
			if(a>0 && b>0) {
				c = ps3.executeUpdate();
			}
			
			c =a+b+c;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return c;
		
	}

	
}
