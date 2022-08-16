package model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Locker1")
public class Locker {

	
	@Id
	private String lockerId;
	private String lockerType;
	private Integer rent;
	
	public Locker()
	{
		super();
	}


	public Locker(Integer id, String lockerId, String lockerType, Integer rent) {
		super();
		//Id = id;
		this.lockerId = lockerId;
		this.lockerType = lockerType;
		this.rent = rent;
	}




	public String getLockerId() {
		return lockerId;
	}


	public void setLockerId(String lockerId) {
		this.lockerId = lockerId;
	}


	public String getLockerType() {
		return lockerType;
	}


	public void setLockerType(String lockerType) {
		this.lockerType = lockerType;
	}


	public Integer getRent() {
		return rent;
	}


	public void setRent(Integer rent) {
		this.rent = rent;
	}


	@Override
	public String toString() {
		return "Locker [lockerId=" + lockerId + ", lockerType=" + lockerType + ", rent=" + rent + "]";
	}



	
	
	
}
