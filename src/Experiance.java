import java.util.Scanner;

public class Experiance {
	private int numExp;
	private String expDes;
	private String final_exp;
	
	
	Scanner sc = new Scanner(System.in);
	
	public int getNumExp() {
		return numExp;
	}
	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}
	public String getExpDes() {
		return expDes;
	}
	public void setExpDes(String expDes) {
		this.expDes = expDes;
	}
	
	
	
	public String getFinal_exp() {
		return final_exp;
	}
	public void setFinal_exp(String final_exp) {
		this.final_exp = final_exp;
	}
	public void expDisplay(){
		 	System.out.println("Number of Work Experiences:");
		 	int numOfexperiences = sc.nextInt();
	      
		 	while (numOfexperiences < 0 || numOfexperiences>10)

			 {
		    	 System.out.println("Please Retype Work Experiences ");
		    	 numOfexperiences = sc.nextInt();
 		     }//while end 

		 	String exp[] = new String[numOfexperiences];
 			
 			for (int i = 0; i < exp.length; i++)
 		{
 			System.out.println("Enter Work Experiences:");
 		   exp[i] = sc.next();
 		   sc.nextLine();
 		  final_exp = final_exp+" "+  exp[i];
  		  
  		}
  		setFinal_exp(final_exp);	 
 		   
 		}
		
		  	// setExpDes(exp);			
	}     		


