package validate;

public class ValidatedMarks {

	
public static int GP_theory(int marks) {
		
		if(marks>=91) {
			return 10;
		}else if(marks>=81) {
			return 9;
		}else if(marks>=71) {
			return 8;
		}else if(marks>=61) {
			return 7;
		}else if(marks>=51) {
			return 6;
		}else if(marks>=40 && marks<=50) {
			return 5;
		}
		return 0;
	}
	
      public static int GP_practical(int marks) {
		
		if(marks>=45) {
			return 10;
		}else if(marks>=40) {
			return 9;
		}else if(marks>=35) {
			return 8;
		}else if(marks>=30) {
			return 7;
		}else if(marks>=25) {
			return 6;
		}else if(marks>=20) {
			return 5;
		}
		return 0;
	}
      
      public static String grade_theory(int marks,int srN) {
    	  if(srN<=4) {
    		  if(marks>=91) {
    	  			return "AA";
    	  		}else if(marks>=81) {
    	  			return "AB";
    	  		}else if(marks>=71) {
    	  			return "BB";
    	  		}else if(marks>=61) {
    	  			return "BC";
    	  		}else if(marks>=51) {
    	  			return "CC";
    	  		}else if(marks>=40 && marks<=50) {
    	  			return "CD";
    	  		}
    	    	  return "FF";
    	      }else {
    	    	  if(marks>=45) {
    	    			return "AA";
    	    		}else if(marks>=40) {
    	    			return "AB";
    	    		}else if(marks>=35) {
    	    			return "BB";
    	    		}else if(marks>=30) {
    	    			return "BC";
    	    		}else if(marks>=25) {
    	    			return "CC";
    	    		}
    	    		return "FF";
        	  }
    	  }
    	 
      
      
      
      public static String checkDivision(float i) {
    	  
    	  if(i>=8.25) {
    		  return "DISTINCTION";
    	  }else if(i>=6.75) {
    		  return "FIRST CLASS";
    	  }else if(i>=5.25) {
    		  return "SECOND CLASS";
    	  }
    	  
    	  return"THIRED CLASS";
      }
      
      public static String checkResult_Theory(int subMark1,int subMark2,int subMark3,int subMark4) {
    	  
    	  if(subMark1>=40 && subMark2>=40 && subMark3>=40 && subMark4>=40) {
    		  return "PASS";
    	  }
    	  
    	  return "FAIL";
      }
      
      
 public static String checkResult_Practical(int subMark1,int subMark2) {
    	  
	  if(subMark1>=25 && subMark2>=25) {
		  return "PASS";
	  }
    	  
    	  return "FAIL";
      }

  


	
}
