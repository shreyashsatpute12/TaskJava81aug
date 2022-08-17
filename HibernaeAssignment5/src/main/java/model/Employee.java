package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, Integer empId, String password, Assets asset) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.password = password;
		this.asset = asset;
	}

	@Column(name = "EmpName")
	private String empName;

	@Column(name = "EmpId")
	private Integer empId;

	@Column(name = "Password")
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AssetId")
	private Assets asset;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Assets getAsset() {
		return asset;
	}

	public void setAsset(Assets asset) {
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", empName=" + empName + ", empId=" + empId + ", password=" + password
				+ ", asset=" + asset + "]";
	}
}
