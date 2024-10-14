package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDB {

	private static Connection getConnection() throws SQLException{
		String dbURL = "jdbc:mysql://localhost:3306/prsdb";
		String username = "prsdb_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL,username,password);
		return connection;
}
	//get all users
		public static List<User> getAll(){
			
			String sql = "Select * From User ";
			List<User> users = new ArrayList<>();
			try {
				Connection conn = getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs =stmt.executeQuery(sql);
				while(rs.next()) {
					int id = rs.getInt(1);
					String userName = rs.getString(2);
					String passWord = rs.getString(3);
					String firstName = rs.getString(4);
					String lastName = rs.getString(5);
					String phoneNumber = rs.getString(6);
					String email = rs.getString(7);
				    boolean reviewer = rs.getBoolean(8);
				    boolean admin = rs.getBoolean(9);
					User u =new User(id,userName,passWord,firstName,lastName,phoneNumber,email,reviewer,admin );
					users.add(u);
				}
				conn.close();
			}
			catch (SQLException e) {
				System.err.println(e);
				users =null;
			}
			return users;
		}
		
		//Add an user

		public static boolean add(User u) {
				String sql = "INSERT INTO User (UserName, PassWord, FirstName,LastName,PhoneNumber,Email,Reviewer,Admin )"

						+ "VALUES(?,?,?,?,?,?,?,?)";
				try(Connection conn = getConnection();
						PreparedStatement ps =conn.prepareStatement(sql)){
					ps.setString(1,u.getUserName());
		                        ps.setString(2,u.getPassWord());
		                        ps.setString(3,u.getFirstName());
		                        ps.setString(4,u.getLastName());
		                        ps.setString(5,u.getPhoneNumber());
		                        ps.setString(6,u.getEmail());
				                ps.setInt(7,u.isReviewer() ? 1:0);
		                        ps.setInt(8,u.isAdmin() ? 1:0);
					ps.executeUpdate();
					return true;
				}
				catch (SQLException e) {
					System.err.println(e);
					return false;
				}
			}

		// get a user by id
		public static User get(int id) {

	        String sql = "SELECT * "

	                   + "FROM User "

	                   + "WHERE Id = ?";

	        try (Connection connection = getConnection();

	             PreparedStatement ps = connection.prepareStatement(sql)) {

	            ps.setInt(1, id);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                String userName = rs.getString(2);
			String passWord = rs.getString(3);
			String firstName = rs.getString(4);
			String lastName = rs.getString(5);
			String phoneNumber = rs.getString(6);
			String email = rs.getString(7);
			 boolean reviewer = rs.getBoolean(8);
			boolean admin = rs.getBoolean(9);
			User u =new User(id,userName,passWord,firstName,lastName,phoneNumber,email,reviewer,admin );

	                return u;

	            } else {

	                rs.close();

	                return null;

	            }

	        } catch (SQLException e) {

	            System.err.println(e);

	            return null;

	        }

	    }


		// delete user by id
		public static boolean delete(int id) {
        String sql = "DELETE FROM USER "
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
