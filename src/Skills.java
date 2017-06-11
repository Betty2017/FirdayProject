import java.util.Scanner;

public class Skills {
	private int nuSkill;
	private String skillDes;
	private String final_ski;
	int x=1;
	String temp;
	
	public int getNuSkill() {
		return nuSkill;
	}
	public void setNuSkill(int nuSkill) {
		this.nuSkill = nuSkill;
	}
	public String getSkillDes() {
		return skillDes;
	}
	public void setSkillDes(String skillDes) {
		this.skillDes = skillDes;
	}
		
	public String getFinal_ski() {
		return final_ski;
	}
	public void setFinal_ski(String final_ski) {
		this.final_ski = final_ski;
	}
	public void skillDisp()
	{
		do{
			try{
					Scanner sc = new Scanner(System.in);
					System.out.println("Please Enter Number of  Skills with Rating :");
		 		    int numOfSkills = sc.nextInt();
		
		 			 while(numOfSkills < 1 || numOfSkills>10) 
		 		     {
		 		   	  System.out.println("Please Enter Number of  Skills with Rating Again:");  
		 		   	numOfSkills = sc.nextInt();
		 		     }//while end 
		
		 		     	     
		 				String ski[] = new String[numOfSkills];
		
		 				 for (int i = 0; i < ski.length; i++)
		 				{
		 					 System.out.println("Please Enter Skills with Rateing");
		 					 
		 					ski[i] = sc.next();
		 					ski[i] += sc.nextLine();
					  		 
					  		  
					  		if (i==0){
					 			 temp= ski[i];
					 			 final_ski =temp;
					 		   }
					 		  
					 		   else {
					 		     
					 		  final_ski = final_ski +" , "+  ski[i];
					 		   }
					  		}
					  		 
					  		setFinal_ski(final_ski);	 
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

