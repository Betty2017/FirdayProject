import java.util.Scanner;

public  class Education {
	
	
	private int numEdu;
	private String eduDesc;
	private String school;
	private int year;
	private String final_edu ;
	int x=1;
	String temp;
		
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getNumEdu() {
		return numEdu;
	}
	public void setNumEdu(int numEdu) {
		this.numEdu = numEdu;
	}
	
	public String seteduDesc(String eduDes){
		return eduDesc;
	}
	public void geteduDesc() {
		this.eduDesc = eduDesc;
	}
	
	public String getFinal_edu() {
		return final_edu;
	}
	public void setFinal_edu(String final_edu) {
		this.final_edu = final_edu;
	}
	
	
	public  void eduDisplay()
	{
		
	do{
		try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Please Enter Number of  Education Achivement :");
			      int numOfAchivement = sc.nextInt();
			      	      
			  	 while(numOfAchivement < 1 || numOfAchivement>10) 
			       {
			     	  System.out.println("Please Enter Number of  Education Achivement Again:");  
			     	  numOfAchivement = sc.nextInt();
			       }//while end 
			       		  	 
			     
			  		String edu[] = new String[numOfAchivement];
		
			  		 for (int i = 0; i < edu.length; i++)
			  		{
			  			 System.out.println("Please Enter Education Achivement ");
			  			
			  			
			  		edu[i] = sc.next();
			  		edu[i] += sc.nextLine();
			  		 
			  		  
			  		if (i==0){
			 			 temp= edu[i];
			 			 final_edu =temp;
			 		   }
			 		  
			 		   else {
			 		     
			 		  final_edu = final_edu +" , "+  edu[i];
			 		   }
			  		}
			  		 
			  		setFinal_edu(final_edu);	 
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

	  	 
	  	  
	  	 
	  	 
	  	 
	  	 
	  	
		
	

	  		
	  		 
	


