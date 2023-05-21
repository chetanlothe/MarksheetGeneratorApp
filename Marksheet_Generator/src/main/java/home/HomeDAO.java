package home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.http.HttpServletRequest;

import bean.BeanClass;
import connection.DBConnection;

public class HomeDAO {
	
	BeanClass beanClass=null;
	int i=0,j=0,k=0,count=0;
	public BeanClass retreive(HttpServletRequest req) {
		try
		{
			beanClass=new BeanClass();
			
			Connection con = DBConnection.getCon();
			
			String deprtment = req.getParameter("dept").toUpperCase();
			String branch = req.getParameter("branch").toUpperCase();
			String semester = req.getParameter("semester").toUpperCase();
			String  rollno = req.getParameter("rollno");
			
			
			
			PreparedStatement preparedStatement1 = con.prepareStatement
		   ("SELECT * FROM student WHERE (roll_no=? AND department=?) AND (branch=? AND semester=?)");
			
			preparedStatement1.setString(1, rollno);
			preparedStatement1.setString(2, deprtment);
			preparedStatement1.setString(3, branch);
			preparedStatement1.setString(4, semester);
			
			ResultSet resultSet1 = preparedStatement1.executeQuery();
			
			if (resultSet1.next()) {
				
				
			    // set the values of the variables using the getter and setter methods
				beanClass.setStudentRollNo(resultSet1.getString(1));
				beanClass.setStudentName(resultSet1.getString(2));
				beanClass.setStudentDepartment(resultSet1.getString(3));
				beanClass. setStudentBranch(resultSet1.getString(4));
				beanClass.setSemesterName(resultSet1.getString(5));
				beanClass. setMedium(resultSet1.getString(6));
				beanClass.setCollegeCode(resultSet1.getInt(7));
				
				i=1;
				//beanClass.setResultDate(resultSet1.getString("result_date"));
				
				
			}
			
			
			
			PreparedStatement preparedStatement2 = con.prepareStatement
		   ("SELECT * from subject_marks where roll_no=?");
			preparedStatement2.setString(1, rollno); // replace rollNo with the student's roll number

			
			ResultSet resultSet2 = preparedStatement2.executeQuery();
			

			while(resultSet2.next())
			{
				  count++;
			      int srS=resultSet2.getInt(2);
				  String nameS = resultSet2.getString(3);
				  int constSTU = resultSet2.getInt(4);
				  int constSTI= resultSet2.getInt(5);
				  int maxS = resultSet2.getInt(6);
				  int minS = resultSet2.getInt(7);
				  int obtSTU = resultSet2.getInt(8);
				  int obtSTI = resultSet2.getInt(9);
				  int totS = resultSet2.getInt(10);
				  String grdS = resultSet2.getString(11);
				  int gpS = resultSet2.getInt(12);
				  int crS = resultSet2.getInt(13);
				  int gpvS = resultSet2.getInt(14);
				  j=1;
				  
				  // Use the appropriate setter methods to set the values into the bean class variables
				  switch (srS) {
				    case 1: beanClass.setSrS1(srS);
				            beanClass.setNameS1(nameS);
				            beanClass.setConstS1TU(constSTU);
				            beanClass.setConstS1TI(constSTI);
				            beanClass.setMaxS1(maxS);
				            beanClass.setMinS1(minS);
				            beanClass.setObtS1TU(obtSTU);
				            beanClass.setObtS1TI(obtSTI);
				            beanClass.setTotS1(totS);
				            beanClass.setGrdS1(grdS);
				            beanClass.setGpS1(gpS);
				            beanClass.setCrS1(crS);
				            beanClass.setGpvS1(gpvS);
				      
				      break;
				    case 2:
				    	beanClass.setSrS2(srS);
			            beanClass.setNameS2(nameS);
			            beanClass.setConstS2TU(constSTU);
			            beanClass.setConstS2TI(constSTI);
			            beanClass.setMaxS2(maxS);
			            beanClass.setMinS2(minS);
			            beanClass.setObtS2TU(obtSTU);
			            beanClass.setObtS2TI(obtSTI);
			            beanClass.setTotS2(totS);
			            beanClass.setGrdS2(grdS);
			            beanClass.setGpS2(gpS);
			            beanClass.setCrS2(crS);
			            beanClass.setGpvS2(gpvS);
				     
				      break;
				    case 3:
				    	beanClass.setSrS3(srS);
			            beanClass.setNameS3(nameS);
			            beanClass.setConstS3TU(constSTU);
			            beanClass.setConstS3TI(constSTI);
			            beanClass.setMaxS3(maxS);
			            beanClass.setMinS3(minS);
			            beanClass.setObtS3TU(obtSTU);
			            beanClass.setObtS3TI(obtSTI);
			            beanClass.setTotS3(totS);
			            beanClass.setGrdS3(grdS);
			            beanClass.setGpS3(gpS);
			            beanClass.setCrS3(crS);
			            beanClass.setGpvS3(gpvS);
					     
					  break;
				    case 4:
				    	beanClass.setSrS4(srS);
			            beanClass.setNameS4(nameS);
			            beanClass.setConstS4TU(constSTU);
			            beanClass.setConstS4TI(constSTI);
			            beanClass.setMaxS4(maxS);
			            beanClass.setMinS4(minS);
			            beanClass.setObtS4TU(obtSTU);
			            beanClass.setObtS4TI(obtSTI);
			            beanClass.setTotS4(totS);
			            beanClass.setGrdS4(grdS);
			            beanClass.setGpS4(gpS);
			            beanClass.setCrS4(crS);
			            beanClass.setGpvS4(gpvS);
					     
					  break;
				    case 5:
				    	beanClass.setSrS5(srS);
			            beanClass.setNameP1(nameS);
			            beanClass.setConstP1TU(constSTU);
			            beanClass.setConstP1TI(constSTI);
			            beanClass.setMaxP1(maxS);
			            beanClass.setMinP1(minS);
			            beanClass.setObtP1TU(obtSTU);
			            beanClass.setObtP1TI(obtSTI);
			            beanClass.setTotP1(totS);
			            beanClass.setGrdP1(grdS);
			            beanClass.setGpP1(gpS);
			            beanClass.setCrP1(crS);
			            beanClass.setGpvP1(gpvS);
					     
					  break;
				    case 6:
				    	beanClass.setSrS6(srS);
			            beanClass.setNameP2(nameS);
			            beanClass.setConstP2TU(constSTU);
			            beanClass.setConstP2TI(constSTI);
			            beanClass.setMaxP2(maxS);
			            beanClass.setMinP2(minS);
			            beanClass.setObtP2TU(obtSTU);
			            beanClass.setObtP2TI(obtSTI);
			            beanClass.setTotP2(totS);
			            beanClass.setGrdP2(grdS);
			            beanClass.setGpP2(gpS);
			            beanClass.setCrP2(crS);
			            beanClass.setGpvP2(gpvS);
					     
					  break;

			
			
			}
			
		  }
			
		  PreparedStatement preparedStatement3=con.prepareStatement("select * from student_result where roll_no=?");
		  preparedStatement3.setString(1,rollno);
			
		  ResultSet resultSet3=preparedStatement3.executeQuery();
		  
		  if(resultSet3.next()) {
			 
			  beanClass.setTotalCredits(resultSet3.getInt(2));
              beanClass.setSgpa(resultSet3.getFloat(3));
              beanClass.setSgpaOutof(resultSet3.getInt(4));
              beanClass.setObtTotalMarks(resultSet3.getInt(5));
              beanClass.setOutofTotalMarks(resultSet3.getInt(6));
              beanClass.setResult(resultSet3.getString(7));
              beanClass.setDivision(resultSet3.getString(8));
              k=1;
		  }

		}		
		catch (Exception e) {
			e.printStackTrace();
		}
		beanClass.setSubCount(count);
		 if(i==1 && j==1 && k==1) {
				return beanClass;
		  }
	   return null;
		
	}

}
