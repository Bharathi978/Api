package org.api;




public class HDFCPOJO {


	private String username; // Ravi username correct

	private int password; // 1

	// setter method
	//Arugument local method
	//this- varilable-instance variable
	
	
	
	public void setUsername(String a) {                      // a= ravi
		if (a.equals("ravi")) {
			this.username = "Ravi Username correct";
		}
		else if (a.equals("Bharathi")) {
			this.username = "Bharathi Username correct";
		}
		else if (a.equals("muthu")) {
			this.username = "muthu Username correct";
		}																																														
		else {
			this.username="Incorrect Username";
		}
	}


	public void setPassword(int b) {
		if (this.username.equals("Ravi username is correct")&&b==123) {
			this.password =1;

		}
		else if (this.username.equals("Bharathi username is correct")&&b==321) {
			this.password =1;

		}
		else if (this.username.equals("muthu username is correct")&&b==111) {
			this.password =1;

		}
		else {
			this.password=0;
		}

	}



	public String getUsername() {
		if (this.username.equals("Ravi username correct")&& this.password ==1) {
			return "Ravi account is validated" ;
		}
		else if (this.username.equals("Ravi username correct")&& this.password ==1) {
			return "Bharathi account is validated" ;
		}
		else if (this.username.equals("Ravi username correct")&& this.password==1) {
			return "muthu account is validated" ;
		}
		else {
			return "Account not validated";
		}
	} 




	public int getPassword() {
		if (getUsername().equals("Ravi account validated")) {
			return 10000;
		}

		else  if (getUsername().equals("Bharathi account validated")) {
			return 20000;
		}
		else if (getUsername().equals("muathu account validated")) {
			return 30000;
		}
		else {
			return 0;
		}
	}























}
