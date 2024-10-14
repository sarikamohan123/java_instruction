package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Actor;
import model.Movie;

public class ActorDB {
	private static Connection getConnection() throws SQLException{
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL,username,password);
		return connection;
	}
	
	
	//get all Actors
		public static List<Actor> getAll(){
			
			String sql = "Select * From Actor ";
			List<Actor> actors = new ArrayList<>();
			try {
				Connection conn = getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs =stmt.executeQuery(sql);
				while(rs.next()) {
					int id = rs.getInt(1);
					String firstName = rs.getString(2);
					String lastName = rs.getString(3);
					String gender = rs.getString(4);
					Date birthday = rs.getDate(5);
					Actor a =new Actor(id, firstName,lastName,gender,birthday);
					actors.add(a);
					
				}
				conn.close();
			}
			catch (SQLException e) {
				System.err.println("Error fetching actors: " + e.getMessage());
				actors =null;
			}
			return actors;
		}
		
		
		// add an actor
		
		public static boolean add(Actor a) {
			String sql = "INSERT INTO Actor (FirstName, LastName, Gender, BirthDate)"

					+ "VALUES(?,?,?,?)";
			try(Connection conn = getConnection();
					PreparedStatement ps =conn.prepareStatement(sql)){
				ps.setString(1,a.getFirstName());
				ps.setString(2, a.getLastName());
				ps.setString(3, a.getGender());
				ps.setDate(4, a.getBirthdate());
				ps.executeUpdate();
				return true;
			}
			catch (SQLException e) {
				System.err.println(e);
				return false;
			}
		}
		
		// get an actor by id
		public static Actor get(int id) {

	        String sql = "SELECT * "

	                   + "FROM Actor "

	                   + "WHERE Id = ?";

	        try (Connection connection = getConnection();

	             PreparedStatement ps = connection.prepareStatement(sql)) {

	            ps.setInt(1, id);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {

	                String firstName = rs.getString(2);

	         	    String lastName = rs.getString(3);

	                String gender = rs.getString(4);
	                
	                Date birthdate =rs.getDate(5);

	                Actor a = new Actor(id, firstName,lastName,gender,birthdate );

	                return a;

	            } else {

	                rs.close();

	                return null;

	            }

	        } catch (SQLException e) {

	            System.err.println(e);

	            return null;

	        }

	    }

		//delete an actor by id
		
		public static boolean delete(int id) {
	        String sql = "DELETE FROM Actor "
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
		
		// update an actor (* coded but not used in the app)
		
		public static boolean update(Actor a) {

	        String sql = "UPDATE Actor SET "

	                   + "  FirstName = ?, "

	                   + "  LastName = ?, "

	                   + "  Gender = ?, "

	                   + "  Birthdate = ? "

	                   + "WHERE Id = ?";

	        try (Connection connection = getConnection();

	             PreparedStatement ps = connection.prepareStatement(sql)) {

	            ps.setString(1, a.getFirstName());

	            ps.setString(2, a.getLastName());

	            ps.setString(3, a.getGender());

	            ps.setDate(4, a.getBirthdate());

	            ps.executeUpdate();

	            return true;

	        } catch (SQLException e) {

	            System.err.println(e);

	            return false;

	        }

	    }

}
