package evaluatorlogin;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EvaluatorBean implements Serializable{
	
	 private String evEmail ,evPassword;
	 
	 
	 public EvaluatorBean() {
		 
	 }


	public String getEvEmail() {
		return evEmail;
	}


	public void setEvEmail(String evEmail) {
		this.evEmail = evEmail;
	}


	public String getEvPassword() {
		return evPassword;
	}


	public void setEvPassword(String evPassword) {
		this.evPassword = evPassword;
	}
	 
	 
	 
	 

}
