package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Movies")
public class Movie {

	
	@Id
	@Column
	private String movieId;
	@Column
	private String moviename;
	@Column
	private String language;
	@Column
	private Integer releasdIn;
	@Column
	private Integer revenueInDollars;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="DirId")
	private Director directorId;
	
	public Director getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Director directorId) {
		this.directorId = directorId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getReleasdIn() {
		return releasdIn;
	}
	public void setReleasdIn(Integer releasdIn) {
		this.releasdIn = releasdIn;
	}
	public Integer getRevenueInDollars() {
		return revenueInDollars;
	}
	public void setRevenueInDollars(Integer revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	public Movie(String movieId, String moviename, String language, Integer releasdIn, Integer revenueInDollars,
			Director directorId) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
		this.language = language;
		this.releasdIn = releasdIn;
		this.revenueInDollars = revenueInDollars;
		this.directorId = directorId;
	}
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", moviename=" + moviename + ", language=" + language + ", releasdIn="
				+ releasdIn + ", revenueInDollars=" + revenueInDollars + ", directorId=" + directorId + "]";
	}
	
	
	
	
}
