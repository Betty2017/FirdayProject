import java.util.Scanner;

public class Skills {
	private int nuSkill;
	private String skillDes;
	private String final_ski;
	Scanner sc = new Scanner(System.in);
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
			System.out.println("Number of  Skills with Rateing :");
 		    int numOfSkills = sc.nextInt();

 			 while(numOfSkills < 1 || numOfSkills>10) 
 		     {
 		   	  System.out.println("Please Enter Number of  Skills with Rateing:");  
 		   	numOfSkills = sc.nextInt();
 		     }//while end 

 		     	     
 				String ski[] = new String[numOfSkills];

 				 for (int i = 0; i < ski.length; i++)
 				{
 					 System.out.println("Enter Skills with Rateing");
 					 
 					ski[i] = sc.next();
 				  sc.nextLine();
 				 final_ski = final_ski+" "+  ski[i];
 		  		  
 		  		}
 		  			setFinal_ski(final_ski); 
 		 		   
 		 		}
 				
 		  	
	}


