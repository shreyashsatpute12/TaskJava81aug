package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Director")
public class Director {

	
	@Id
	@Column(name="DirId")
	private String directorId;
	@Column()
	private String directorName;
	@Column()
	private Integer bornln;
	
	
	
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public Integer getBornln() {
		return bornln;
	}
	public void setBornln(Integer bornln) {
		this.bornln = bornln;
	}
	public Director(String directorId, String directorName, Integer bornln) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.bornln = bornln;
	}
	
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", bornln=" + bornln + "]";
	}
	
	
	
	
}
