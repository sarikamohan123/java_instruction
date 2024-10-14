package ui;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import db.ActorDB;
import db.MovieDB;
import model.Actor;
import model.Movie;
import util.Console;

public class BmdbTesterApp {

	public static void main(String[] args) {
		Console.printLine("Welcome to the BmDB Tester App!");
		
		Console.printLine("List all movies");
		Console.printLine("=====================");
		
		listMovies();
		
		Console.printLine("List all actors");
		listActors();
				
		
		
				
		
		Console.printLine("Add a  movie");
		Console.printLine("=====================");
		String title = Console.getRequiredString("Title :");
		int year =Console.getInt("Year: ");
		String rating =Console.getRequiredString("Rating : ");
		String director =Console.getRequiredString("Director:");
		Movie m = new Movie (title,year,rating,director);
		if(MovieDB.add(m)) {
			Console.printLine("Movie added");
		}
		else {
			Console.printLine("Error adding movie");
		}
		
		
		
		Console.printLine("List all movies:");
		Console.printLine("=====================");
		listMovies();
		
		Console.printLine("Get a movie by id");
		Console.printLine("=====================");
		int id =Console.getInt("Movie Id: ");
		m = MovieDB.get(id);
		if (m != null) {
			Console.printLine(m.toString());
		}else {
			Console.printLine("No movie found for id: " +id);
		}
		
		
		
		Console.printLine("Delete  movie by id:");
		Console.printLine("=====================");

		id = Console.getInt("Movie Id: ");

		m = MovieDB.get(id);

		if (m != null) {

			if (MovieDB.delete(id)) {

				Console.printLine("Movie deleted.");

			} else {

				Console.printLine("Error deleting movie.");

			}

		} else {

			Console.printLine("No movie found for id: " + id + ". Cannot delete.");

		}

    
		Console.printLine("List all movies:");
		Console.printLine("=================");
		listMovies();
		
		Console.printLine("Add an Actor");
		Console.printLine("=====================");
		String firstName = Console.getRequiredString("FirstName :");
		String lastName =Console.getRequiredString("LastName : ");
		String gender =Console.getRequiredString("Gender:");
		String birthdateStr =Console.getRequiredString("BirthDate");
		Date birthdate = Date.valueOf(birthdateStr);
		Actor a = new Actor (firstName,lastName,gender, birthdate);
		if(ActorDB.add(a)) {
			Console.printLine("Actor added");
		}
		else {
			Console.printLine("Error adding actor");
		}
		
		
		
		Console.printLine("List all actors:");
		Console.printLine("=====================");
		listActors();
		
		
		
		Console.printLine("Get an actor by id");
		Console.printLine("=====================");
		int Id = Console.getInt("Actor Id: ");
		a = ActorDB.get(Id);
		if (a != null) {
			Console.printLine(a.toString());
		}else {
			Console.printLine("No actor found for id: " + Id);
		}
		
		
		
		
		Console.printLine("Delete  actor by id:");
		Console.printLine("=====================");

		id = Console.getInt("Actor Id: ");

		a = ActorDB.get(id);

		if (a != null) {

			if (ActorDB.delete(id)) {

				Console.printLine("Actor deleted.");

			} else {

				Console.printLine("Error deleting actor.");

			}

		} else {

			Console.printLine("No actor found for id: " + id + ". Cannot delete.");

		}

		Console.printLine("List all actors");
		listActors();

		
		
		
					
		
		Console.printLine("Bye");
	}

	private static void listMovies() {
		List<Movie> movies =MovieDB.getAll();
		for (Movie m: movies) {
			Console.printLine(m.toString());
		}
	}
	
	
	private static void listActors() {
		List<Actor> actors = ActorDB.getAll();
		for (Actor a : actors) {
			Console.printLine(a.toString());
		}
	
}
}
	


