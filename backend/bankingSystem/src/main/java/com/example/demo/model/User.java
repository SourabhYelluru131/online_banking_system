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
	private Long mobile_num;

	@NotBlank(message="Adhar no is required")
	@Column(unique = true, nullable = false)
	private Long adhar_id;
	
	@NotBlank(message="title is required - Mr/Ms/Mrs")
	@Column(nullable = false)
	@ValidateTitle
	private String title;
	
	@NotBlank(message="middle_name is required")
	@Column(nullable = false)
	private String first_name;
	private String middle_name;
	
	@NotBlank(message="father_name is required")
	@Column(nullable=false)
	private String father_name;
	
	@NotBlank(message="Last name is required")
	@Column(nullable = false)
	private String last_name;
	
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
	private String perm_add_id;
	
	@NotBlank(message="Temp address is required")
	@Column(nullable=false)
	private String temp_add_id;
	
	@NotBlank(message="Choose 1 for Yes ,0 for No")
	@Column(nullable = false)
	@ValidateIsAdmin
	//@ValueOfEnum(enumClass=IsAdmin.class,message="Choose 1 for Yes or 0 for No")
	private int is_admin;
	
	@NotBlank(message="Occupation type is required")
	@Column(nullable = false)
	private String occupation_type;
	
	@NotBlank(message="Income source is required")
	@Column(nullable = false)
	private String income_source;
	
	@NotBlank(message="Annual Income is required")
	@Column(nullable = false)
	private double annual_income;
	
//	fetch=FetchType.EAGER,
	//@OneToOne(mappedBy = "user",  cascade=CascadeType.ALL)
	@OneToOne(mappedBy = "user")
	private Account account;

	public User() {
		super();
	}

	public User(Long id, String email, Long mobile_num, Long adhar_id, String title, String first_name,
			String middle_name, String father_name, String last_name, String dob, int age, String gender,
			String perm_add_id, String temp_add_id, int is_admin, String occupation_type, String income_source,
			double annual_income, Account account) {
		super();
		this.id = id;
		this.email = email;
		this.mobile_num = mobile_num;
		this.adhar_id = adhar_id;
		this.title = title;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.father_name = father_name;
		this.last_name = last_name;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.perm_add_id = perm_add_id;
		this.temp_add_id = temp_add_id;
		this.is_admin = is_admin;
		this.occupation_type = occupation_type;
		this.income_source = income_source;
		this.annual_income = annual_income;
		this.account = account;
	}

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

	public Long getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(Long mobile_num) {
		this.mobile_num = mobile_num;
	}

	public Long getAdhar_id() {
		return adhar_id;
	}

	public void setAdhar_id(Long adhar_id) {
		this.adhar_id = adhar_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public String getPerm_add_id() {
		return perm_add_id;
	}

	public void setPerm_add_id(String perm_add_id) {
		this.perm_add_id = perm_add_id;
	}

	public String getTemp_add_id() {
		return temp_add_id;
	}

	public void setTemp_add_id(String temp_add_id) {
		this.temp_add_id = temp_add_id;
	}

	public int getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(int is_admin) {
		this.is_admin = is_admin;
	}

	public String getOccupation_type() {
		return occupation_type;
	}

	public void setOccupation_type(String occupation_type) {
		this.occupation_type = occupation_type;
	}

	public String getIncome_source() {
		return income_source;
	}

	public void setIncome_source(String income_source) {
		this.income_source = income_source;
	}

	public double getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(double annual_income) {
		this.annual_income = annual_income;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
//	public User() {
//		super();
//	}
//
//	public User(Long id, String email, Long mobile_num, Long adhar_id, String title, String first_name,
//			String middle_name, String father_name, String last_name, String dob, int age, String gender,
//			String perm_add_id, String temp_add_id, int is_admin, String occupation_type, String income_source,
//			double annual_income) {
//		super();
//		this.id = id;
//		this.email = email;
//		this.mobile_num = mobile_num;
//		this.adhar_id = adhar_id;
//		this.title = title;
//		this.first_name = first_name;
//		this.middle_name = middle_name;
//		this.father_name = father_name;
//		this.last_name = last_name;
//		this.dob = dob;
//		this.age = age;
//		this.gender = gender;
//		this.perm_add_id = perm_add_id;
//		this.temp_add_id = temp_add_id;
//		this.is_admin = is_admin;
//		this.occupation_type = occupation_type;
//		this.income_source = income_source;
//		this.annual_income = annual_income;
//	}

}
