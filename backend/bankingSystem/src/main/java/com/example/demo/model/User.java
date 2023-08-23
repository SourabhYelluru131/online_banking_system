package com.example.demo.model;

import javax.persistence.CascadeType;
import org.hibernate.validator.constraints.*;

import com.example.demo.validation.ValidateGender;
import com.example.demo.validation.ValidateIsAdmin;
import com.example.demo.validation.ValidateTitle;

//import java.sql.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true, nullable = false)
	@Email(message = "Invalid email address")
	@NotBlank(message="email is required")
	private String email;
	
	@NotBlank(message="Mobile num is required- 10 digits without leading 0")
	@Column(unique = true, nullable = false)

	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid mobile number")
	private Long mobileNum;

	@NotBlank(message="Adhar no is required")
	@Column(unique = true, nullable = false)
	private Long adharId;
	
	@NotBlank(message="title is required - Mr/Ms/Mrs")
	@Column(nullable = false)
	@ValidateTitle
	private String title;
	
	@NotBlank(message="middle_name is required")
	@Column(nullable = false)
	private String firstName;
	private String middleName;
	
	@NotBlank(message="father_name is required")
	@Column(nullable=false)
	private String fatherName;
	
	@NotBlank(message="Last name is required")
	@Column(nullable = false)
	private String lastName;
	
	@NotBlank(message="Date of birth is required")
	@Column(nullable = false)
	private String dob;
	
	@NotBlank(message="Age is required,min age is 10")
	@Column(nullable = false)
	@Min(10)
	private int age;
	
	@NotBlank(message="Gender is required - male/female/other")
	@Column(nullable=false)
	@ValidateGender
	private String gender;
	
	
	@Column(nullable = false)
	@NotBlank(message="Permanent address is required")
	private String permAddId;
	
	@NotBlank(message="Temp address is required")
	@Column(nullable=false)
	private String tempAddId;
	
	@NotBlank(message="Choose 1 for Yes ,0 for No")
	@Column(nullable = false)
	@ValidateIsAdmin
	//@ValueOfEnum(enumClass=IsAdmin.class,message="Choose 1 for Yes or 0 for No")
	private int isAdmin;
	
	@NotBlank(message="Occupation type is required")
	@Column(nullable = false)
	private String occupationType;
	
	@NotBlank(message="Income source is required")
	@Column(nullable = false)
	private String incomeSource;
	
	@NotBlank(message="Annual Income is required")
	@Column(nullable = false)
	private double annualIncome;
	
//	fetch=FetchType.EAGER,
	//@OneToOne(mappedBy = "user",  cascade=CascadeType.ALL)
	@OneToOne(mappedBy = "user")
	private Account account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Long getAdharId() {
		return adharId;
	}

	public void setAdharId(Long adharId) {
		this.adharId = adharId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPermAddId() {
		return permAddId;
	}

	public void setPermAddId(String permAddId) {
		this.permAddId = permAddId;
	}

	public String getTempAddId() {
		return tempAddId;
	}

	public void setTempAddId(String tempAddId) {
		this.tempAddId = tempAddId;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public User(Long id,
			@Email(message = "Invalid email address") @NotBlank(message = "email is required") String email,
			@NotBlank(message = "Mobile num is required- 10 digits without leading 0") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid mobile number") Long mobileNum,
			@NotBlank(message = "Adhar no is required") Long adharId,
			@NotBlank(message = "title is required - Mr/Ms/Mrs") String title,
			@NotBlank(message = "middle_name is required") String firstName, String middleName,
			@NotBlank(message = "father_name is required") String fatherName,
			@NotBlank(message = "Last name is required") String lastName,
			@NotBlank(message = "Date of birth is required") String dob,
			@NotBlank(message = "Age is required,min age is 10") @Min(10) int age,
			@NotBlank(message = "Gender is required - male/female/other") String gender,
			@NotBlank(message = "Permanent address is required") String permAddId,
			@NotBlank(message = "Temp address is required") String tempAddId,
			@NotBlank(message = "Choose 1 for Yes ,0 for No") int isAdmin,
			@NotBlank(message = "Occupation type is required") String occupationType,
			@NotBlank(message = "Income source is required") String incomeSource,
			@NotBlank(message = "Annual Income is required") double annualIncome, Account account) {
		this.id = id;
		this.email = email;
		this.mobileNum = mobileNum;
		this.adharId = adharId;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.fatherName = fatherName;
		this.lastName = lastName;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.permAddId = permAddId;
		this.tempAddId = tempAddId;
		this.isAdmin = isAdmin;
		this.occupationType = occupationType;
		this.incomeSource = incomeSource;
		this.annualIncome = annualIncome;
		this.account = account;
	}

	public User() {
	}
	
	


}
