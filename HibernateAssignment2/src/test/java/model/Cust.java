package model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Customer1")
public class Cust {
	
	@Id
	private Integer custId;
	private String custName;
	private Date dob;
	private String Address;
	private String mobileNumber;
	
	//@OneToOne
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="custLockerId")
	private Locker locker;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Locker getLocker() {
		return locker;
	}
	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	public Cust(int custId, String custName, Date dob, String address, String mobileNumber, Locker locker) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.dob = dob;
		Address = address;
		this.mobileNumber = mobileNumber;
		this.locker = locker;
	}
	public Cust() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cust [custId=" + custId + ", custName=" + custName + ", dob=" + dob + ", Address=" + Address
				+ ", mobileNumber=" + mobileNumber + ", locker=" + locker + "]";
	}
	
	
	
}
