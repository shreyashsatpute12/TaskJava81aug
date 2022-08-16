package Main;

import java.util.Objects;

import dao.MovieDao;
import model.Movie;

public class Implementation {

	
		static MovieDao md;
		
////		
		 public static void get() {
		    	Movie m1 = md.getMovieDetails(1);
		    	System.out.println(m1);
		      }
		  public static void add() {
		    	Movie movie = new Movie("102","Thor","English",2014,100000000);
		    	md.addMovie(movie);
		      }
		private static void update() {
			Movie movie = md.getMovieDetails(1);
			if(!Objects.isNull(movie)) {
				movie.setRevenueInDollars(movie.getRevenueInDollars()+10000);
				md.updateMovie(movie);
				System.out.println("Successfully updated the data");
			}else System.out.println("Data is not updated");
			
		}
		 public static void delete() {
		    	try {
		    	Movie m2 = md.getMovieDetails(1);
		    	md.deleteMovie(m2);
		    	}catch(Exception e) {
		    		System.out.println(e.getMessage());
		    	}
		      }
	
		 public static void main( String[] args ) 
		    {
			 md=new MovieDao();
		    //  add();
		      // get();
		        //update();
		        delete();
		    }

	}


