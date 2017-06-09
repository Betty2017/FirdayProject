import java.util.Scanner;

public class NameDisplay {
	 
	private String name;
	private String email;
	
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void nameDisplay(){
		

	      System.out.println("Please Enter First, Last Name :");
	      String name =  sc.nextLine();
	      
	      while(!name.matches("[a-zA-z]+([ '-][a-zA-Z]+)*"))
	      {
	    	  System.out.println("Please Retype name First, Last name ");
	    	  name =  sc.nextLine();
	      }
	    
	      System.out.println("Please Enter Email Address :");
	      String email =  sc.nextLine();
	      
	      while(!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))

	      {
	    	  System.out.println("Please Retype Email Address ");
	    	  email =  sc.nextLine();
	      } 
	      setName(name);
	      setEmail(email);
	      
	}
	
}
