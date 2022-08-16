package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie1")
public class Movie{
	


	@Id
	@Column(name = "Id")
	private Integer Id;

	@Column(name = "MovieId")
	private String movieId;

	@Column(name = "MovieName")
	private String movieName;

	@Column(name = "Language")
	private String language;

	@Column(name = "ReleasedIn")
	private Integer releasedIn;

	@Column(name = "RevenueInDollars")
	private Integer revenueInDollars;

	public Movie() {
	}

	public Movie(String movieId, String movieName, String language, Integer releasedIn,
			Integer revenueInDollars) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDollars = revenueInDollars;
	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getReleasedIn() {
		return releasedIn;
	}

	public void setReleasedIn(Integer releasedIn) {
		this.releasedIn = releasedIn;
	}

	public Integer getRevenueInDollars() {
		return revenueInDollars;
	}

	public void setRevenueInDollars(Integer revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}

	@Override
	public String toString() {
		return "Movie [Id=" + Id + ", movieId=" + movieId + ", movieName=" + movieName + ", language=" + language
				+ ", releasedIn=" + releasedIn + ", revenueInDollars=" + revenueInDollars + "]";
	}
}