package jdbc;



	
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		public class jdbc {
			public static void main(String[] args) {
				
				
				String db_url ="jdbc:mysql://localhost:3306/jdbc";
				String user="root";
				String password="root";
				
			
				
				try {
					Connection connection=DriverManager.getConnection(db_url, user, password);
					
			
					
						if(connection!=null) {
							
							System.out.println("Connection sucessfull");
						} else {
							
							System.out.println("Connection unsucessfull");
						}
					
						// Step 4: Perform the Operation
						
						Statement stmt = connection.createStatement();
					//	String createDB ="create database db_jdbc1";
					//	String use="Use db_demo1";
					//	String createTable=  "insert into jdbc (empcode,empname,empage,esalary)";
						String select ="  select * from jdbc";
						String insert ="insert into jdbc values (101,'Jenny',25,10000),"
								+ "(102,'jacky',30,20000),"
								+ "(103,'joe',20,40000),"
								+ "(104,'john',40,80000),"
								+ "(105,'shameer',25,90000)";
								
						
						
						//stmt.executeUpdate(createDB);
						
						
						// use db
						
						//stmt.execute(use);
						
						//create table
						
						//stmt.execute(createTable);
						
						// insert data
						
						stmt.executeUpdate(insert);
						
						// update the data
						
						//stmt.executeUpdate(update);
						
						// Selecting the data
						ResultSet rs = stmt.executeQuery(select);
						
						// iterate result set and print
						
						while(rs.next()) {
							
							System.out.println(rs.getInt("empcode")+" "+rs.getString("empname")+" " +rs.getInt("empage")+" " +rs.getInt("esalary"));
							
						}
						
						// close the connection
						
						connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		

	}

