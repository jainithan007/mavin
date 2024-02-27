package jdbc;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class jdbc2 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// Step 1: Database connection details
			
			
			String db_url ="jdbc:mysql://localhost:3306/";
			String user="root";
			String password="root";
			
	        try {
	        Connection connection=DriverManager.getConnection(db_url, user, password);
	        if(connection!=null) {
	                System.out.println("Connected to the database!");

	                // Data to be inserted
	                String[] names = {"GUV", "Guss Geeks Network Pvt. L"};
	                String[] empCodes = {"101", "102", "103", "104", "103"};
	                String[] empUAM = {"empag", "empuam"};
	                int[] empAge = {25, 30, 20, 40, 25};
	                String[] empSalaries = {"Jenny", "10000", "Jacky", "Joe", "John", "20000", "40000", "40", "Shameer", "25", "90000"};

	                // Insert data
	                String sql = "INSERT INTO your_table_name (name, empcode, empuam, empage, esalar) VALUES ()";
	                PreparedStatement statement = connection.prepareStatement(sql);
	                for (int i = 0; i < names.length; i++) {
	                    statement.setString(1, names[i]);
	                    statement.setString(2, empCodes[i % empCodes.length]);
	                    statement.setString(3, empUAM[i % empUAM.length]);
	                    statement.setInt(4, empAge[i % empAge.length]);
	                    statement.setString(5, empSalaries[i % empSalaries.length]);
	                    statement.executeUpdate();
	                }
	                System.out.println("Data inserted successfully!");
	            }
	        } catch (SQLException ex) {
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	        }
	    }
	}



