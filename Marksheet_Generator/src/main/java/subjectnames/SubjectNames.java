package subjectnames;

import java.util.ArrayList;

public class SubjectNames {
	
    ArrayList<String> subjectName = new  ArrayList<String>();	
	
	public ArrayList<String> getSubjectName(String sDepartment,String sBranch,String sSemester){
		
		if(sDepartment.equals("engineering") && sBranch.equals("Computer Science") && sSemester.equals("1st Semester"))
		{
			subjectName.add("Object Oriented system");
			subjectName.add("High performance computer Architecture");
			subjectName.add("Advances in Operating system");
			subjectName.add("Computer System");
			subjectName.add("Object Oriented system [ Practical ]");
			subjectName.add("Computer System [ Practical ]");
		}else if(sDepartment.equals("engineering") && sBranch.equals("Computer Science") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("Computer Network");
			subjectName.add("Theory of Computation");
			subjectName.add("System Programming");
			subjectName.add("Database Management System");
			subjectName.add("System Programming [ Practical ]");
			subjectName.add("Database Management System [ Practical ]");
			
		}else if(sDepartment.equals("engineering") && sBranch.equals("Information Technology") && sSemester.equals("1st Semester"))
		{
			
			subjectName.add("Ethics In Information Technology");
			subjectName.add("Fundamentals of Microprocessor");
			subjectName.add("Data Communication");
			subjectName.add("Database Management System");
			subjectName.add("Fundamentals of Microprocessor[ Practical ]");
			subjectName.add("Database Management System [ Practical ]");
			
		}else if(sDepartment.equals("engineering") && sBranch.equals("Information Technology") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("COMPUTER ARCHITECTURE AND ORGANIZATION");
			subjectName.add("OBJECT ORIENTED METHODOLOGY");
			subjectName.add("ALGORITHMS AND DATA STRUCTURES");
			subjectName.add("Computer System");
			subjectName.add("COMPUTER ARCHITECTURE AND ORGANIZATION[ Practical ]");
			subjectName.add("ALGORITHMS AND DATA STRUCTURES [ Practical ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. IT") && sSemester.equals("1st Semester"))
		{
			
			subjectName.add("COMPUTER Science");
			subjectName.add("Advanced and Data Structure");
			subjectName.add("Digital Computer Fundamentals");
			subjectName.add("Computer Graphics");
			subjectName.add("COMPUTER Science [ Practical ]");
			subjectName.add("Advanced and Data Structure [ Practical ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. IT") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("Logic, Discrete Mathematical Structures");
			subjectName.add("Computational Mathematics");
			subjectName.add("DBMS Systems");
			subjectName.add("Operating Systems");
			subjectName.add("DBMS Systems [ Practical ]");
			subjectName.add("Operating Systems[ Practical ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. Computer Science") && sSemester.equals("1st Semester"))
		{
			
			subjectName.add("Java Programming");
			subjectName.add("Oracle");
			subjectName.add("Python");
			subjectName.add("Ajax");
			subjectName.add("Python [ Practical ]");
			subjectName.add("Java Programming[ Practical ]");
			
		}else if(sDepartment.equals("bsc") && sBranch.equals("B.Sc. Computer Science") && sSemester.equals("2nd Semester"))
		{
			
			subjectName.add("Discrete Structures");
			subjectName.add("HTML Programming");
			subjectName.add("Cloud Computing");
			subjectName.add("Mobile Applications");
			subjectName.add("HTML Programming [ Practical ]");
			subjectName.add("Cloud Computing [ Practical ]");
			
		}
			return subjectName;
	}

}


