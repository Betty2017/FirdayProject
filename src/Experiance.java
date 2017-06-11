import java.util.Scanner;

public class Experiance {
	private int numExp;
	private String expDes;
	private String final_exp;
	int x=1;
	String temp;
	
	
	
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
		do{
			try{
				Scanner sc = new Scanner(System.in);
			 	System.out.println("Please Enter Number of Work Experiences:");
			 	int numOfexperiences = sc.nextInt();
		      
			 	while (numOfexperiences < 0 || numOfexperiences>10)
	
					 {
				    	 System.out.println("Please Enter Number of  Work Experiences Again: ");
				    	 numOfexperiences = sc.nextInt();
		 		     }//while end 
	
			 		String exp[] = new String[numOfexperiences];
				
	 			for (int i = 0; i < exp.length; i++)
	 				{
	 			
		 				System.out.println("Please Enter Work Experiences:");
		 				exp[i] = sc.next();
		 				exp[i] += sc.nextLine();
	 				if (i==0)
	 					{
	 					temp= exp[i];
	 					final_exp =temp;
	 					}
	 		  
	 				else {
	 		     
	 					final_exp = final_exp +" , "+  exp[i];
	 					}
	 				
				  		}
				  		setFinal_exp(final_exp);
				  		x=2;
			}
			catch(Exception e)
						{
							System.out.println("You Enterd Incorrect Value:");
						}
		}
	while(x==1);
				 		   
				 		}
		
	 
	 }  			
	     		


