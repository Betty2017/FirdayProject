import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RoboApp {

	public static void main(String[] args) {
		NameDisplay nd = new NameDisplay();
		nd.nameDisplay();
		Education ed = new Education();
		ed.eduDisplay();
		Experiance ex = new Experiance();
		ex.expDisplay();
		Skills sk = new Skills();
		sk.skillDisp();
		
		String nameDis = nd.getName();
		String emailDis = nd.getEmail();
		String edu = ed.getFinal_edu();
		String exDis = ex.getFinal_exp();
		String skDis = sk.getFinal_ski();
		addname(nameDis,emailDis,edu,exDis,skDis);
		System.out.println("Name\n"+nameDis+" \n"+"Email\n"+emailDis+"\n\n"+"Education\n "+edu+"\n\n"+"Experience\n"+exDis+"\n\n"+"Skills with Rating\n "+skDis); //+  ""+exDis+""+skDis);

	}

	public static void addname(String name, String email, String education, String experiance , String skill)
	{
	
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			String sql = "Insert into RResume(name, email,education, experince, skill) values('"+name+"','"+email+"','"+education+"','"+experiance+"','"+skill+"')";
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/Robo_Resume?"
	                                + "user=root&password=password");
				stmt = con.createStatement();
				 if(!stmt.execute(sql))
				 {
				 
					
					sql= "Select * from RResume";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);
					
					while(rs.next()){
						System.out.print(rs.getString(1) + "\t");
						System.out.print(rs.getString(2));
						System.out.println();
					}
				}
				}catch (SQLException e) {
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					e.printStackTrace();
			} finally {
				try {
					//rs.close();
					stmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			}
		}	
	

