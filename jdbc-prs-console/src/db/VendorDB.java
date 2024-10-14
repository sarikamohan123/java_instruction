package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Vendor;

public class VendorDB {
	private static Connection getConnection() throws SQLException{
		String dbURL = "jdbc:mysql://localhost:3306/prsdb";
		String username = "prsdb_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL,username,password);
		return connection;

         }
	
	//get all vendors
			public static List<Vendor> getAll(){
				
				String sql = "Select * From Vendor ";
				List<Vendor> vendors = new ArrayList<>();
				try {
					Connection conn = getConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs =stmt.executeQuery(sql);
					while(rs.next()) {
						int id = rs.getInt(1);
						String code = rs.getString(2);
						String name = rs.getString(3);
						String address = rs.getString(4);
						String city = rs.getString(5);
						String state = rs.getString(6);
						String zip = rs.getString(7);
	                                        String phoneNumber = rs.getString(8);
					        String email = rs.getString(9);
				    
						Vendor v =new Vendor(id, code,name,address,city,state,zip,phoneNumber,email);
						vendors.add(v);
					}
					conn.close();
				}
				catch (SQLException e) {
					System.err.println(e);
					vendors =null;
				}
				return vendors;
			}
			
			//Add a vendor

			public static boolean add(Vendor v) {
					String sql = "INSERT INTO Vendor (Code,Name,Address,City,State,Zip,PhoneNumber,email)"

							+ "VALUES(?,?,?,?,?,?,?,?)";
					try(Connection conn = getConnection();
							PreparedStatement ps =conn.prepareStatement(sql)){
						            ps.setString(1,v.getCode());
			                        ps.setString(2,v.getName());
			                        ps.setString(3,v.getAddress());
			                        ps.setString(4,v.getCity());
			                        ps.setString(5,v.getState());
			                        ps.setString(6,v.getZip());
			                        ps.setString(7,v.getPhoneNumber());
			                        ps.setString(8,v.getEmail()); 					
	                                ps.executeUpdate();
						return true;
					}
					catch (SQLException e) {
						System.err.println(e);
						return false;
					}
				}

			// get a vendor by id
			public static Vendor get(int id) {

		        String sql = "SELECT * "

		                   + "FROM Vendor "

		                   + "WHERE Id = ?";

		        try (Connection connection = getConnection();

		             PreparedStatement ps = connection.prepareStatement(sql)) {

		            ps.setInt(1, id);

		            ResultSet rs = ps.executeQuery();

		            if (rs.next()) {
		                String code = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				String city = rs.getString(5);
	                        String state = rs.getString(6);
	                        String zip = rs.getString(7);
	                        String phoneNumber = rs.getString(8);
	                        String email = rs.getString(9);
				Vendor v =new Vendor(id,code,name,address,city,state,zip,phoneNumber,email );

		                return v;

		            } else {

		                rs.close();

		                return null;

		            }

		        } catch (SQLException e) {

		            System.err.println(e);

		            return null;

		        }

		    }

			// delete vendor by id
			public static boolean delete(int id) {
	        String sql = "DELETE FROM Vendor "
	                + "WHERE Id = ?";
	     try (Connection connection = getConnection();
	          PreparedStatement ps = connection.prepareStatement(sql)) {
	         ps.setInt(1, id);
	         ps.executeUpdate();
	         return true;
	     } catch (SQLException e) {
	         System.err.println(e);
	         return false;
	     }
	 }



	
}
