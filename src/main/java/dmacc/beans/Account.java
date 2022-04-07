package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Account {
	@Id
	@GeneratedValue
	private long accountId;
	@Column(unique=true)
	private String email;
	private String password;
	@Transient
	private String confirmPassword;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String accountType;
	Address address;
	public Account() {
		super();
	}
	public Account(String email, String password, String confirmPassword, String firstName, String lastName, String phoneNumber,
			String accountType, Address address) {
		super();
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
		this.address = address;
	}
	public Account(long accountId, String email, String password, String confirmPassword, String firstName, String lastName, String phoneNumber,
			String accountType, Address address) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
		this.address = address;
	}
	public Account(String email, String password, String firstName, String lastName, String phoneNumber,
			String accountType, Address address) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
		this.address = address;
	}
	public Account(long accountId, String email, String password, String firstName, String lastName, String phoneNumber,
			String accountType, Address address) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
		this.address = address;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", accountType=" + accountType
				+ ", address=" + address + "]";
	}
	
	
	
}
