package com.csi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "cust_id")
	private int custId;

	@Column(name = "cust_name")
	private String custName;

	@Column(name = "cust_address")
	private String custAddress;

	@Column(name = "add_state")
	private String addState;

	@Column(name = "cust_contact_number")
	private long custContactNumber;

	@Column(name = "cust_acc_balance")
	private double custAccBalance;

	@Column(name = "cust_age")
	private int custAge;

	@Temporal(TemporalType.DATE)
	@Column(name = "cust_dob")
	private Date custDOB;

	@Column(name = "cust_email_id")
	private String custEmailId;

	@Column(name = "cust_password")
	private String custPassword;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", addState="
				+ addState + ", custContactNumber=" + custContactNumber + ", custAccBalance=" + custAccBalance
				+ ", custAge=" + custAge + ", custDOB=" + custDOB + ", custEmailId=" + custEmailId + ", custPassword="
				+ custPassword + "]";
	}

	public String getAddState() {
		return addState;
	}

	public void setAddState(String addState) {
		this.addState = addState;
	}

	public Customer(String custName, String custAddress, String addState, long custContactNumber, double custAccBalance,
			int custAge, Date custDOB, String custEmailId, String custPassword) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
		this.addState = addState;
		this.custContactNumber = custContactNumber;
		this.custAccBalance = custAccBalance;
		this.custAge = custAge;
		this.custDOB = custDOB;
		this.custEmailId = custEmailId;
		this.custPassword = custPassword;
	}

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

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	public double getCustAccBalance() {
		return custAccBalance;
	}

	public void setCustAccBalance(double custAccBalance) {
		this.custAccBalance = custAccBalance;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public Date getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

}
