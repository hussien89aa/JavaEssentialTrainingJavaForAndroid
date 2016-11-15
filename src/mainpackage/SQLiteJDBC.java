package mainpackage;
import java.sql.*;
public class SQLiteJDBC {
	 public static void main( String args[] )
	  {
		 Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:VDataset.db");
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");
		    
		      stmt = c.createStatement();
		      //remove old data
		      String sqld = "delete from summary;delete from VulnerabilitiesDetails;"; 
	      stmt.executeUpdate(sqld);
	   
		      String sql = "INSERT INTO summary (version,VulnerableDependencies,DependenciesScanned,VulnerabilitiesFound) " +
		                   "VALUES ('4ee4',2,3,4 );"; 
		      stmt.executeUpdate(sql);
		   
		      String sql2 = "INSERT INTO VulnerabilitiesDetails (version,ThirdPartyName,ThirdPartyPath,ThirdPartyDesc) " +
	                   "VALUES ('44','2','3','4' );"; 
	      stmt.executeUpdate(sql2);
	      
		      stmt.close();
		      c.commit();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Records created successfully");
	  }
}
