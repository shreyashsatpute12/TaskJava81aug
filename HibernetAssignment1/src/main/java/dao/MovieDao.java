package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Movie;
import util.HibernateUtil;

public class MovieDao {
	public SessionFactory  sf=HibernateUtil.getSessionFactory();
	public Session session = sf.openSession() ;
	
	

		public String addMovie(Movie movie) {
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
		return movie.getMovieName();
		
	}
	
	 	
	public void deleteMovie(Movie movie)
	{
		session.beginTransaction();
		session.delete(movie);
		session.getTransaction().commit();
	}
	public void updateMovie(Movie movie) {
		session.beginTransaction();
		session.update(movie);
		session.getTransaction().commit();
		
	}
	
	public Movie getMovieDetails(Integer id) {
		return session.get(Movie.class, id);
	}
		
	
	}
