package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BeanClass implements Serializable{
	
	
	public BeanClass()
	{
		
		
	}
	  //Count Subject
	  private int subCount;
	
	 
	//Student Details
	  private String semesterName,studentDepartment,studentName,studentBranch,studentRollNo,resultDate,medium;
	  private int collegeCode;
	  
	  
	  //Subject Sr.No,Name
	  private int srS1,srS2,srS3,srS4,srS5,srS6;
	  private String nameS1,nameS2,nameS3,nameS4,nameP1,nameP2;
	   
	   
	  //Constant Marks (TU/PU),(TI/PI),(Maximum=100(T)/50(P),(Minimum=40(T)/25(P)
	  private int constS1TU,constS2TU,constS3TU,constS4TU,constP1TU,constP2TU;   //(Theory/Practical 80/25)
	  private int constS1TI,constS2TI,constS3TI,constS4TI,constP1TI,constP2TI;   //(Theory/Practical 20/25)
	  private int maxS1,maxS2,maxS3,maxS4,maxP1,maxP2;                           //(Max Subject Marks to be Obtained)
	  private int minS1,minS2,minS3,minS4,minP1,minP2;                           //(Minimum Subject Marks to be Pass)
	  
	  //Obtained Marks,Total marks
	  private int obtS1TU,obtS2TU,obtS3TU,obtS4TU,obtP1TU,obtP2TU;              //(Obtained Theory/Practical Exam Marks)
	  private int obtS1TI,obtS2TI,obtS3TI,obtS4TI,obtP1TI,obtP2TI;              //(Obtained Theory/Practical Internal Marks)
	  private int totS1,totS2,totS3,totS4,totP1,totP2;                          //(Total Marks =Exam+Internal Marks)
	  
	  //Grade,GP,CR,GPV
	  private String grdS1,grdS2,grdS3,grdS4,grdP1,grdP2;                       //(Subject Grade)
	  private int gpS1,gpS2,gpS3,gpS4,gpP1,gpP2;                                //(Grade Points)
	  private int crS1,crS2,crS3,crS4,crP1,crP2;                                //(Credit Points Given By Teacher)
	  private int gpvS1,gpvS2,gpvS3,gpvS4,gpvP1,gpvP2;                          //(GPV=GP*CR)
	  
	  
	   //Total Credits,SGPA,
	  private int totalCredits,sgpaOutof,obtTotalMarks,outofTotalMarks;
	  private float sgpa;
	  private String result,division;
	public String getSemesterName() {
		return semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getResultDate() {
		return resultDate;
	}
	public void setResultDate(String resultDate) {
		this.resultDate = resultDate;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	public int getSrS1() {
		return srS1;
	}
	public void setSrS1(int srS1) {
		this.srS1 = srS1;
	}
	public int getSrS2() {
		return srS2;
	}
	public void setSrS2(int srS2) {
		this.srS2 = srS2;
	}
	public int getSrS3() {
		return srS3;
	}
	public void setSrS3(int srS3) {
		this.srS3 = srS3;
	}
	public int getSrS4() {
		return srS4;
	}
	public void setSrS4(int srS4) {
		this.srS4 = srS4;
	}
	public int getSrS5() {
		return srS5;
	}
	public void setSrS5(int srS5) {
		this.srS5 = srS5;
	}
	public int getSrS6() {
		return srS6;
	}
	public void setSrS6(int srS6) {
		this.srS6 = srS6;
	}
	public String getNameS1() {
		return nameS1;
	}
	public void setNameS1(String nameS1) {
		this.nameS1 = nameS1;
	}
	public String getNameS2() {
		return nameS2;
	}
	public void setNameS2(String nameS2) {
		this.nameS2 = nameS2;
	}
	public String getNameS3() {
		return nameS3;
	}
	public void setNameS3(String nameS3) {
		this.nameS3 = nameS3;
	}
	public String getNameS4() {
		return nameS4;
	}
	public void setNameS4(String nameS4) {
		this.nameS4 = nameS4;
	}
	public String getNameP1() {
		return nameP1;
	}
	public void setNameP1(String nameP1) {
		this.nameP1 = nameP1;
	}
	public String getNameP2() {
		return nameP2;
	}
	public void setNameP2(String nameP2) {
		this.nameP2 = nameP2;
	}
	public int getConstS1TU() {
		return constS1TU;
	}
	public void setConstS1TU(int constS1TU) {
		this.constS1TU = constS1TU;
	}
	public int getConstS2TU() {
		return constS2TU;
	}
	public void setConstS2TU(int constS2TU) {
		this.constS2TU = constS2TU;
	}
	public int getConstS3TU() {
		return constS3TU;
	}
	public void setConstS3TU(int constS3TU) {
		this.constS3TU = constS3TU;
	}
	public int getConstS4TU() {
		return constS4TU;
	}
	public void setConstS4TU(int constS4TU) {
		this.constS4TU = constS4TU;
	}
	public int getConstP1TU() {
		return constP1TU;
	}
	public void setConstP1TU(int constP1TU) {
		this.constP1TU = constP1TU;
	}
	public int getConstP2TU() {
		return constP2TU;
	}
	public void setConstP2TU(int constP2TU) {
		this.constP2TU = constP2TU;
	}
	public int getConstS1TI() {
		return constS1TI;
	}
	public void setConstS1TI(int constS1TI) {
		this.constS1TI = constS1TI;
	}
	public int getConstS2TI() {
		return constS2TI;
	}
	public void setConstS2TI(int constS2TI) {
		this.constS2TI = constS2TI;
	}
	public int getConstS3TI() {
		return constS3TI;
	}
	public void setConstS3TI(int constS3TI) {
		this.constS3TI = constS3TI;
	}
	public int getConstS4TI() {
		return constS4TI;
	}
	public void setConstS4TI(int constS4TI) {
		this.constS4TI = constS4TI;
	}
	public int getConstP1TI() {
		return constP1TI;
	}
	public void setConstP1TI(int constP1TI) {
		this.constP1TI = constP1TI;
	}
	public int getConstP2TI() {
		return constP2TI;
	}
	public void setConstP2TI(int constP2TI) {
		this.constP2TI = constP2TI;
	}
	public int getMaxS1() {
		return maxS1;
	}
	public void setMaxS1(int maxS1) {
		this.maxS1 = maxS1;
	}
	public int getMaxS2() {
		return maxS2;
	}
	public void setMaxS2(int maxS2) {
		this.maxS2 = maxS2;
	}
	public int getMaxS3() {
		return maxS3;
	}
	public void setMaxS3(int maxS3) {
		this.maxS3 = maxS3;
	}
	public int getMaxS4() {
		return maxS4;
	}
	public void setMaxS4(int maxS4) {
		this.maxS4 = maxS4;
	}
	public int getMaxP1() {
		return maxP1;
	}
	public void setMaxP1(int maxP1) {
		this.maxP1 = maxP1;
	}
	public int getMaxP2() {
		return maxP2;
	}
	public void setMaxP2(int maxP2) {
		this.maxP2 = maxP2;
	}
	public int getMinS1() {
		return minS1;
	}
	public void setMinS1(int minS1) {
		this.minS1 = minS1;
	}
	public int getMinS2() {
		return minS2;
	}
	public void setMinS2(int minS2) {
		this.minS2 = minS2;
	}
	public int getMinS3() {
		return minS3;
	}
	public void setMinS3(int minS3) {
		this.minS3 = minS3;
	}
	public int getMinS4() {
		return minS4;
	}
	public void setMinS4(int minS4) {
		this.minS4 = minS4;
	}
	public int getMinP1() {
		return minP1;
	}
	public void setMinP1(int minP1) {
		this.minP1 = minP1;
	}
	public int getMinP2() {
		return minP2;
	}
	public void setMinP2(int minP2) {
		this.minP2 = minP2;
	}
	public int getObtS1TU() {
		return obtS1TU;
	}
	public void setObtS1TU(int obtS1TU) {
		this.obtS1TU = obtS1TU;
	}
	public int getObtS2TU() {
		return obtS2TU;
	}
	public void setObtS2TU(int obtS2TU) {
		this.obtS2TU = obtS2TU;
	}
	public int getObtS3TU() {
		return obtS3TU;
	}
	public void setObtS3TU(int obtS3TU) {
		this.obtS3TU = obtS3TU;
	}
	public int getObtS4TU() {
		return obtS4TU;
	}
	public void setObtS4TU(int obtS4TU) {
		this.obtS4TU = obtS4TU;
	}
	public int getObtP1TU() {
		return obtP1TU;
	}
	public void setObtP1TU(int obtP1TU) {
		this.obtP1TU = obtP1TU;
	}
	public int getObtP2TU() {
		return obtP2TU;
	}
	public void setObtP2TU(int obtP2TU) {
		this.obtP2TU = obtP2TU;
	}
	public int getObtS1TI() {
		return obtS1TI;
	}
	public void setObtS1TI(int obtS1TI) {
		this.obtS1TI = obtS1TI;
	}
	public int getObtS2TI() {
		return obtS2TI;
	}
	public void setObtS2TI(int obtS2TI) {
		this.obtS2TI = obtS2TI;
	}
	public int getObtS3TI() {
		return obtS3TI;
	}
	public void setObtS3TI(int obtS3TI) {
		this.obtS3TI = obtS3TI;
	}
	public int getObtS4TI() {
		return obtS4TI;
	}
	public void setObtS4TI(int obtS4TI) {
		this.obtS4TI = obtS4TI;
	}
	public int getObtP1TI() {
		return obtP1TI;
	}
	public void setObtP1TI(int obtP1TI) {
		this.obtP1TI = obtP1TI;
	}
	public int getObtP2TI() {
		return obtP2TI;
	}
	public void setObtP2TI(int obtP2TI) {
		this.obtP2TI = obtP2TI;
	}
	public int getTotS1() {
		return totS1;
	}
	public void setTotS1(int totS1) {
		this.totS1 = totS1;
	}
	public int getTotS2() {
		return totS2;
	}
	public void setTotS2(int totS2) {
		this.totS2 = totS2;
	}
	public int getTotS3() {
		return totS3;
	}
	public void setTotS3(int totS3) {
		this.totS3 = totS3;
	}
	public int getTotS4() {
		return totS4;
	}
	public void setTotS4(int totS4) {
		this.totS4 = totS4;
	}
	public int getTotP1() {
		return totP1;
	}
	public void setTotP1(int totP1) {
		this.totP1 = totP1;
	}
	public int getTotP2() {
		return totP2;
	}
	public void setTotP2(int totP2) {
		this.totP2 = totP2;
	}
	public String getGrdS1() {
		return grdS1;
	}
	public void setGrdS1(String grdS1) {
		this.grdS1 = grdS1;
	}
	public String getGrdS2() {
		return grdS2;
	}
	public void setGrdS2(String grdS2) {
		this.grdS2 = grdS2;
	}
	public String getGrdS3() {
		return grdS3;
	}
	public void setGrdS3(String grdS3) {
		this.grdS3 = grdS3;
	}
	public String getGrdS4() {
		return grdS4;
	}
	public void setGrdS4(String grdS4) {
		this.grdS4 = grdS4;
	}
	public String getGrdP1() {
		return grdP1;
	}
	public void setGrdP1(String grdP1) {
		this.grdP1 = grdP1;
	}
	public String getGrdP2() {
		return grdP2;
	}
	public void setGrdP2(String grdP2) {
		this.grdP2 = grdP2;
	}
	public int getGpS1() {
		return gpS1;
	}
	public void setGpS1(int gpS1) {
		this.gpS1 = gpS1;
	}
	public int getGpS2() {
		return gpS2;
	}
	public void setGpS2(int gpS2) {
		this.gpS2 = gpS2;
	}
	public int getGpS3() {
		return gpS3;
	}
	public void setGpS3(int gpS3) {
		this.gpS3 = gpS3;
	}
	public int getGpS4() {
		return gpS4;
	}
	public void setGpS4(int gpS4) {
		this.gpS4 = gpS4;
	}
	public int getGpP1() {
		return gpP1;
	}
	public void setGpP1(int gpP1) {
		this.gpP1 = gpP1;
	}
	public int getGpP2() {
		return gpP2;
	}
	public void setGpP2(int gpP2) {
		this.gpP2 = gpP2;
	}
	public int getCrS1() {
		return crS1;
	}
	public void setCrS1(int crS1) {
		this.crS1 = crS1;
	}
	public int getCrS2() {
		return crS2;
	}
	public void setCrS2(int crS2) {
		this.crS2 = crS2;
	}
	public int getCrS3() {
		return crS3;
	}
	public void setCrS3(int crS3) {
		this.crS3 = crS3;
	}
	public int getCrS4() {
		return crS4;
	}
	public void setCrS4(int crS4) {
		this.crS4 = crS4;
	}
	public int getCrP1() {
		return crP1;
	}
	public void setCrP1(int crP1) {
		this.crP1 = crP1;
	}
	public int getCrP2() {
		return crP2;
	}
	public void setCrP2(int crP2) {
		this.crP2 = crP2;
	}
	public int getGpvS1() {
		return gpvS1;
	}
	public void setGpvS1(int gpvS1) {
		this.gpvS1 = gpvS1;
	}
	public int getGpvS2() {
		return gpvS2;
	}
	public void setGpvS2(int gpvS2) {
		this.gpvS2 = gpvS2;
	}
	public int getGpvS3() {
		return gpvS3;
	}
	public void setGpvS3(int gpvS3) {
		this.gpvS3 = gpvS3;
	}
	public int getGpvS4() {
		return gpvS4;
	}
	public void setGpvS4(int gpvS4) {
		this.gpvS4 = gpvS4;
	}
	public int getGpvP1() {
		return gpvP1;
	}
	public void setGpvP1(int gpvP1) {
		this.gpvP1 = gpvP1;
	}
	public int getGpvP2() {
		return gpvP2;
	}
	public void setGpvP2(int gpvP2) {
		this.gpvP2 = gpvP2;
	}
	public int getTotalCredits() {
		return totalCredits;
	}
	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}
	public float getSgpa() {
		return sgpa;
	}
	public void setSgpa(float sgpa) {
		this.sgpa = sgpa;
	}
	public int getSgpaOutof() {
		return sgpaOutof;
	}
	public void setSgpaOutof(int sgpaOutof) {
		this.sgpaOutof = sgpaOutof;
	}
	public int getObtTotalMarks() {
		return obtTotalMarks;
	}
	public void setObtTotalMarks(int obtTotalMarks) {
		this.obtTotalMarks = obtTotalMarks;
	}
	public int getOutofTotalMarks() {
		return outofTotalMarks;
	}
	public void setOutofTotalMarks(int outofTotalMarks) {
		this.outofTotalMarks = outofTotalMarks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	 public int getSubCount() {
			return subCount;
		}
		public void setSubCount(int subCount) {
			this.subCount = subCount;
		}
	
	  
	  
	  
	  
	
	
	
	

}
