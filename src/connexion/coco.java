package connexion;

import java.sql.*;

public class coco {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			   //connection to database
			   Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1", "root", "");
			   
			   //create statement 
			   Statement myStmt = myConn.createStatement();
			   
			   //execute sql query
			   ResultSet myRs = myStmt.executeQuery("select * from sq");
			   
			   //results set
			   while (myRs.next()) {
			    System.out.println(myRs.getString("name")+ " , "+myRs.getString("usn"));
			   }
			  }
			  catch (Exception exc) {
			   exc.printStackTrace();
			  }

	}

}
